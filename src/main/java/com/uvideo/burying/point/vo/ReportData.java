package com.uvideo.burying.point.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


public class ReportData implements Serializable {

    private String userId;
    private String createTime;
    private String page;

    private String operate;
    private ReportMetaData metaData;

    public ReportData() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public ReportMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ReportMetaData metaData) {
        this.metaData = metaData;
    }
}
