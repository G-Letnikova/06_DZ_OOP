package DZ2;

import java.util.List;

public class PrintReport3 implements ReportOutput{

    @Override
    public void printReport(List<ReportItem> items) {
        System.out.println("Запись отчета в файл");
    }
}
