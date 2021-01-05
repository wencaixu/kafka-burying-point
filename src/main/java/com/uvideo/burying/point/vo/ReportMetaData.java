package com.uvideo.burying.point.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ReportMetaData {

    private String title;

    private List<ReportClickData> clickData = new ArrayList<>();

    public ReportMetaData() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ReportClickData> getClickData() {
        return clickData;
    }

    public void setClickData(List<ReportClickData> clickData) {
        this.clickData = clickData;
    }
}
