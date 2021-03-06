package com.innopolis.innometrics.restapi.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProcessDayReportResponse implements Serializable {
    private List<Process> processReports;

    public ProcessDayReportResponse() {
        processReports = new ArrayList<>();
    }

    public ProcessDayReportResponse(List<Process> processReports) {
        this.processReports = processReports;
    }

    public List<Process> getProcessReports() {
        return processReports;
    }

    public void setProcessReports(List<Process> processReports) {
        this.processReports = processReports;
    }
}
