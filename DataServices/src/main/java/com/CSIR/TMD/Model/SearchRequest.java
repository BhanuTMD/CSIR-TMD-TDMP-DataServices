package com.CSIR.TMD.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SearchRequest {
    private String theme;
    private String industrialSector;
    private String lab;
    private String technologyRefNo;
    private int page; // Page number (0-based)
    private int size;// Page size

    public SearchRequest() {
    }

    public SearchRequest(String theme, String industrialSector, String lab, String technologyRefNo, int page, int size) {
        this.theme = theme;
        this.industrialSector = industrialSector;
        this.lab = lab;
        this.technologyRefNo = technologyRefNo;
        this.page = page;
        this.size = size;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getIndustrialSector() {
        return industrialSector;
    }

    public void setIndustrialSector(String industrialSector) {
        this.industrialSector = industrialSector;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
