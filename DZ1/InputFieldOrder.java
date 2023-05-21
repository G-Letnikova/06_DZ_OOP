package DZ1;

import java.util.Scanner;

public class InputFieldOrder {
    private Order order;

    public InputFieldOrder(Order order) {
        this.order = order;
    }
    public void inputFromConsole(){
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice( Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
