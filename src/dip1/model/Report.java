package dip1.model;

import dip1.model.util.ReportPrinter;
import dip1.model.util.Reporter;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// report data
    private final Reporter reporter;

    public Report(Reporter reporter) {
        items = new ArrayList<>();
        this.reporter = reporter;
    }

    public void add(ReportItem item) {
        items.add(item);
    }

    public void output(){
        reporter.output(items);
    }
}
