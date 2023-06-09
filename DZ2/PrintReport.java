package DZ2;

import java.util.List;

public class PrintReport implements ReportOutput{

//    public void output(List<ReportItem> items) {
//        System.out.println("Output to printer");
//        for (ReportItem item : items) {
//            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
//        }
//    }

    @Override
    public void printReport(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
