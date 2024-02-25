package dip1.model.util;

import dip1.model.ReportItem;

import java.util.List;

public interface Reporter {
    void output(List<ReportItem> items);
}
