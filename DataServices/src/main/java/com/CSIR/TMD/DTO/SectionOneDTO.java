package com.CSIR.TMD.DTO;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Data
public class SectionOneDTO {
//    private Long id;
    private String technologyRefNo;
    private String keywordTechnology;
    private String nameTechnology;
    private List<String> industrialSector;
    private String multiLabInstitute;
    private String leadLaboratory;
    private List<String> associateInstitute;
    private List<String> theme;
    private Integer technologyLevel;
    private String scaleDevelopment;
    private Integer yearDevelopment;
    private String briefTech;
    private String competitivePosition;
    private List<String> stakeHolders;
    private String technoEconomics;
    private String marketPotential;
    private String environmentalStatutory;
    private String picture;
    private String laboratoryDetail;



//    public Long getId() {
//        return id;
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public SectionOneDTO() {
    }


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


    public List<String> getIndustrialSector() {
        return industrialSector;
    }

    public SectionOneDTO(String technologyRefNo, String keywordTechnology, String nameTechnology, List<String> industrialSector, String multiLabInstitute, String leadLaboratory, List<String> associateInstitute, List<String> theme, Integer technologyLevel, String scaleDevelopment, Integer yearDevelopment, String briefTech, String competitivePosition, List<String> stakeHolders, String technoEconomics, String marketPotential, String environmentalStatutory, String picture, String laboratoryDetail) {
        this.technologyRefNo = technologyRefNo;
        this.keywordTechnology = keywordTechnology;
        this.nameTechnology = nameTechnology;
        this.industrialSector = industrialSector;
        this.multiLabInstitute = multiLabInstitute;
        this.leadLaboratory = leadLaboratory;
        this.associateInstitute = associateInstitute;
        this.theme = theme;
        this.technologyLevel = technologyLevel;
        this.scaleDevelopment = scaleDevelopment;
        this.yearDevelopment = yearDevelopment;
        this.briefTech = briefTech;
        this.competitivePosition = competitivePosition;
        this.stakeHolders = stakeHolders;
        this.technoEconomics = technoEconomics;
        this.marketPotential = marketPotential;
        this.environmentalStatutory = environmentalStatutory;
        this.picture = picture;
        this.laboratoryDetail = laboratoryDetail;
    }

    public void setIndustrialSector(List<String> industrialSector) {
        this.industrialSector = industrialSector;
    }

    public List<String> getTheme() {
        return theme;
    }

    public void setTheme(List<String> theme) {
        this.theme = theme;
    }

    public List<String> getStakeHolders() {
        return stakeHolders;
    }

    public void setStakeHolders(List<String> stakeHolders) {
        this.stakeHolders = stakeHolders;
    }

    public String getMultiLabInstitute() {
        return multiLabInstitute;
    }

    public void setMultiLabInstitute(String multiLabInstitute) {
        this.multiLabInstitute = multiLabInstitute;
    }

    public String getLeadLaboratory() {
        return leadLaboratory;
    }

    public void setLeadLaboratory(String leadLaboratory) {
        this.leadLaboratory = leadLaboratory;
    }



    public List<String> getAssociateInstitute() {
        return associateInstitute;
    }

    public void setAssociateInstitute(List<String> associateInstitute) {
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


}
