package com.CSIR.TMD.Entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Entity
@Data
@Setter
@Table(name = "section_one") // Replace with your actual table name
public class SectionOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public SectionOne() {
    }

    public SectionOne(Long id, String technologyRefNo, String keywordTechnology, String nameTechnology, String industrialSector, Boolean multiLabInstitute, String leadLaboratory, String associateInstitute, Integer technologyLevel, String scaleDevelopment, Integer yearDevelopment, String briefTech, String competitivePosition, String technoEconomics, String marketPotential, String environmentalStatutory, String picture, String laboratoryDetail) {
        this.id = id;
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

    @Column(name = "technology_ref_no") // Ensure this matches your database schema
    private String technologyRefNo;

    @Column(name = "keyword_technology")
    private String keywordTechnology;

    @Column(name = "name_technology")
    private String nameTechnology;

    @Column(name = "industrial_sector")
    private String industrialSector;

    @Column(name = "multi_lab_institute")
    private Boolean multiLabInstitute;

    @Column(name = "lead_laboratory")
    private String leadLaboratory;

    public Long getId() {
        return id;
    }

    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public String getKeywordTechnology() {
        return keywordTechnology;
    }

    public String getNameTechnology() {
        return nameTechnology;
    }

    public String getIndustrialSector() {
        return industrialSector;
    }

    public Boolean getMultiLabInstitute() {
        return multiLabInstitute;
    }

    public String getLeadLaboratory() {
        return leadLaboratory;
    }

    public String getAssociateInstitute() {
        return associateInstitute;
    }

    public Integer getTechnologyLevel() {
        return technologyLevel;
    }

    public String getScaleDevelopment() {
        return scaleDevelopment;
    }

    public Integer getYearDevelopment() {
        return yearDevelopment;
    }

    public String getBriefTech() {
        return briefTech;
    }

    public String getCompetitivePosition() {
        return competitivePosition;
    }

    public String getTechnoEconomics() {
        return technoEconomics;
    }

    public String getMarketPotential() {
        return marketPotential;
    }

    public String getEnvironmentalStatutory() {
        return environmentalStatutory;
    }

    public String getPicture() {
        return picture;
    }

    public String getLaboratoryDetail() {
        return laboratoryDetail;
    }

    @Column(name = "associate_institute")
    private String associateInstitute;

    @Column(name = "technology_level")
    private Integer technologyLevel;

    @Column(name = "scale_development")
    private String scaleDevelopment;

    @Column(name = "year_development")
    private Integer yearDevelopment;

    @Column(name = "brief_tech")
    private String briefTech;

    @Column(name = "competitive_position")
    private String competitivePosition;

    @Column(name = "techno_economics")
    private String technoEconomics;

    @Column(name = "market_potential")
    private String marketPotential;

    @Column(name = "environmental_statutory")
    private String environmentalStatutory;

    @Column(name = "picture")
    private String picture;

    @Column(name = "laboratory_detail")
    private String laboratoryDetail;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public void setKeywordTechnology(String keywordTechnology) {
        this.keywordTechnology = keywordTechnology;
    }

    public void setNameTechnology(String nameTechnology) {
        this.nameTechnology = nameTechnology;
    }

    public void setIndustrialSector(String industrialSector) {
        this.industrialSector = industrialSector;
    }

    public void setMultiLabInstitute(Boolean multiLabInstitute) {
        this.multiLabInstitute = multiLabInstitute;
    }

    public void setLeadLaboratory(String leadLaboratory) {
        this.leadLaboratory = leadLaboratory;
    }

    public void setAssociateInstitute(String associateInstitute) {
        this.associateInstitute = associateInstitute;
    }

    public void setTechnologyLevel(Integer technologyLevel) {
        this.technologyLevel = technologyLevel;
    }

    public void setScaleDevelopment(String scaleDevelopment) {
        this.scaleDevelopment = scaleDevelopment;
    }

    public void setYearDevelopment(Integer yearDevelopment) {
        this.yearDevelopment = yearDevelopment;
    }

    public void setBriefTech(String briefTech) {
        this.briefTech = briefTech;
    }

    public void setCompetitivePosition(String competitivePosition) {
        this.competitivePosition = competitivePosition;
    }

    public void setTechnoEconomics(String technoEconomics) {
        this.technoEconomics = technoEconomics;
    }

    public void setMarketPotential(String marketPotential) {
        this.marketPotential = marketPotential;
    }

    public void setEnvironmentalStatutory(String environmentalStatutory) {
        this.environmentalStatutory = environmentalStatutory;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setLaboratoryDetail(String laboratoryDetail) {
        this.laboratoryDetail = laboratoryDetail;
    }
}
