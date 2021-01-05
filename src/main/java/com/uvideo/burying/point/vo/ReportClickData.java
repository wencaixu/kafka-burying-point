package com.uvideo.burying.point.vo;

import lombok.Data;

import java.io.Serializable;

public class ReportClickData implements Serializable {

    private String tagType;

    private String content;

    public ReportClickData() {
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
