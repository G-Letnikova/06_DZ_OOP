package DZ1;

public class Program {

    //TODO: (Домашняя работа: 1) Сохранить заказ в XML документ
    public static void main(String[] args) {

        Order order = new Order("Client Jon", "something", 1, 20);
        SaveOrder saveOrder = new SaveOrder(order);
        saveOrder.saveToXML();

        InputFieldOrder inputFieldOrder = new InputFieldOrder(order);
        inputFieldOrder.inputFromConsole();
        System.out.println(order);
//        saveOrder.saveToXML();
    }

}
