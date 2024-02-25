package dip1;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.util.ReportPrinter;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");

        ReportPrinter reportPrinter = new ReportPrinter();
        Report report = new Report(reportPrinter);
        report.add(new ReportItem("First", (float)5));
        report.add(new ReportItem("Second", (float)6));
        report.output();
    }
}
