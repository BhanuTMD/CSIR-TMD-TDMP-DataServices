package com.CSIR.TMD.DTO;

import lombok.*;

@Setter
@Getter
@Data
public class SectionOneDTO {
//    private Long id;
    private String technologyRefNo;
    private String keywordTechnology;

//    public Long getId() {
//        return id;
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public String getKeywordTechnology() {
        return keywordTechnology;
    }

    public void setKeywordTechnology(String keywordTechnology) {
        this.keywordTechnology = keywordTechnology;
    }

    public String getNameTechnology() {
        return nameTechnology;
    }

    public void setNameTechnology(String nameTechnology) {
        this.nameTechnology = nameTechnology;
    }

    public String getIndustrialSector() {
        return industrialSector;
    }

    public void setIndustrialSector(String industrialSector) {
        this.industrialSector = industrialSector;
    }

    public Boolean getMultiLabInstitute() {
        return multiLabInstitute;
    }

    public void setMultiLabInstitute(Boolean multiLabInstitute) {
        this.multiLabInstitute = multiLabInstitute;
    }

    public String getLeadLaboratory() {
        return leadLaboratory;
    }

    public void setLeadLaboratory(String leadLaboratory) {
        this.leadLaboratory = leadLaboratory;
    }

    public String getAssociateInstitute() {
        return associateInstitute;
    }

    public void setAssociateInstitute(String associateInstitute) {
        this.associateInstitute = associateInstitute;
    }

    public Integer getTechnologyLevel() {
        return technologyLevel;
    }

    public void setTechnologyLevel(Integer technologyLevel) {
        this.technologyLevel = technologyLevel;
    }

    public String getScaleDevelopment() {
        return scaleDevelopment;
    }

    public void setScaleDevelopment(String scaleDevelopment) {
        this.scaleDevelopment = scaleDevelopment;
    }

    public Integer getYearDevelopment() {
        return yearDevelopment;
    }

    public void setYearDevelopment(Integer yearDevelopment) {
        this.yearDevelopment = yearDevelopment;
    }

    public String getBriefTech() {
        return briefTech;
    }

    public void setBriefTech(String briefTech) {
        this.briefTech = briefTech;
    }

    public String getCompetitivePosition() {
        return competitivePosition;
    }

    public void setCompetitivePosition(String competitivePosition) {
        this.competitivePosition = competitivePosition;
    }

    public String getTechnoEconomics() {
        return technoEconomics;
    }

    public void setTechnoEconomics(String technoEconomics) {
        this.technoEconomics = technoEconomics;
    }

    public String getMarketPotential() {
        return marketPotential;
    }

    public void setMarketPotential(String marketPotential) {
        this.marketPotential = marketPotential;
    }

    public String getEnvironmentalStatutory() {
        return environmentalStatutory;
    }

    public void setEnvironmentalStatutory(String environmentalStatutory) {
        this.environmentalStatutory = environmentalStatutory;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLaboratoryDetail() {
        return laboratoryDetail;
    }

    public void setLaboratoryDetail(String laboratoryDetail) {
        this.laboratoryDetail = laboratoryDetail;
    }

    public SectionOneDTO() {
    }

    public SectionOneDTO(String technologyRefNo, String keywordTechnology, String nameTechnology, String industrialSector, Boolean multiLabInstitute, String leadLaboratory, String associateInstitute, Integer technologyLevel, String scaleDevelopment, Integer yearDevelopment, String briefTech, String competitivePosition, String technoEconomics, String marketPotential, String environmentalStatutory, String picture, String laboratoryDetail) {
//        this.id = id;
        this.technologyRefNo = technologyRefNo;
        this.keywordTechnology = keywordTechnology;
        this.nameTechnology = nameTechnology;
        this.industrialSector = industrialSector;
        this.multiLabInstitute = multiLabInstitute;
        this.leadLaboratory = leadLaboratory;
        this.associateInstitute = associateInstitute;
        this.technologyLevel = technologyLevel;
        this.scaleDevelopment = scaleDevelopment;
        this.yearDevelopment = yearDevelopment;
        this.briefTech = briefTech;
        this.competitivePosition = competitivePosition;
        this.technoEconomics = technoEconomics;
        this.marketPotential = marketPotential;
        this.environmentalStatutory = environmentalStatutory;
        this.picture = picture;
        this.laboratoryDetail = laboratoryDetail;
    }

    private String nameTechnology;
    private String industrialSector;
    private Boolean multiLabInstitute;

    private String leadLaboratory;
    private String associateInstitute;
    private Integer technologyLevel;
    private String scaleDevelopment;
    private Integer yearDevelopment;
    private String briefTech;
    private String competitivePosition;
    private String technoEconomics;
    private String marketPotential;
    private String environmentalStatutory;
    private String picture;
    private String laboratoryDetail;
}
