package DZ2;

public class Program {

    public static void main(String[] args) {

        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
        report.setReportOutput(new PrintReport3());
        report.output();

    }

}
