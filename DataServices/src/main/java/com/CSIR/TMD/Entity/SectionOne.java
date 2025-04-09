package com.CSIR.TMD.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Getter
@Entity
@Data
@Setter
@Table(name = "section_one") // Replace with your actual table name
public class SectionOne {


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Id
    @Column(name = "technology_ref_no") // Ensure this matches your database schema
    private String technologyRefNo;

    @Column(name = "keyword_technology")
    private String keywordTechnology;

    @Column(name = "name_technology")
    private String nameTechnology;

    @ElementCollection
    @CollectionTable(name = "section_one_industrial_sector", joinColumns = @JoinColumn(name = "technology_ref_No"))
    @Column(name = "industrial_sector")
    private List<String> industrialSector;

    @Column(name = "multi_lab_institute")
    private String multiLabInstitute;

    @Column(name = "lead_laboratory")
    private String leadLaboratory;

    @ElementCollection
    @CollectionTable(name = "section_one_theme", joinColumns = @JoinColumn(name = "technology_ref_No"))
    @Column(name = "theme")
    private List<String> theme;


    @ElementCollection
    @CollectionTable(name = "section_one_associate_institute", joinColumns = @JoinColumn(name = "technology_ref_No"))
    @Column(name = "associate_institute")
    private List<String> associateInstitute;

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

    @ElementCollection
    @CollectionTable(name = "section_one_stake_holders", joinColumns = @JoinColumn(name = "technology_ref_No"))
    @Column(name = "stake_holders", length = 300)
    private List<String> stakeHolders;

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

    public List<String> getIndustrialSector() {
        return industrialSector;
    }

    public void setIndustrialSector(List<String> industrialSector) {
        this.industrialSector = industrialSector;
    }

    public SectionOne(String technologyRefNo, String keywordTechnology, String nameTechnology, List<String> industrialSector, String multiLabInstitute, String leadLaboratory, List<String> theme, List<String> associateInstitute, Integer technologyLevel, String scaleDevelopment, Integer yearDevelopment, String briefTech, String competitivePosition, List<String> stakeHolders, String technoEconomics, String marketPotential, String environmentalStatutory, String picture, String laboratoryDetail) {
        this.technologyRefNo = technologyRefNo;
        this.keywordTechnology = keywordTechnology;
        this.nameTechnology = nameTechnology;
        this.industrialSector = industrialSector;
        this.multiLabInstitute = multiLabInstitute;
        this.leadLaboratory = leadLaboratory;
        this.theme = theme;
        this.associateInstitute = associateInstitute;
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

    public List<String> getTheme() {
        return theme;
    }

    public void setTheme(List<String> theme) {
        this.theme = theme;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<String> getStakeHolders() {
        return stakeHolders;
    }

    public void setStakeHolders(List<String> stakeHolders) {
        this.stakeHolders = stakeHolders;
    }


//    public Long getId() {
//        return id;
//    }

    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public String getKeywordTechnology() {
        return keywordTechnology;
    }

    public String getNameTechnology() {
        return nameTechnology;
    }



    public String getMultiLabInstitute() {
        return multiLabInstitute;
    }

    public SectionOne() {
    }

    public String getLeadLaboratory() {
        return leadLaboratory;
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



    public String getLaboratoryDetail() {
        return laboratoryDetail;
    }



//    public void setId(Long id) {
//        this.id = id;
//    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public void setKeywordTechnology(String keywordTechnology) {
        this.keywordTechnology = keywordTechnology;
    }

    public void setNameTechnology(String nameTechnology) {
        this.nameTechnology = nameTechnology;
    }



    public void setMultiLabInstitute(String multiLabInstitute) {
        this.multiLabInstitute = multiLabInstitute;
    }

    public void setLeadLaboratory(String leadLaboratory) {
        this.leadLaboratory = leadLaboratory;
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



    public void setLaboratoryDetail(String laboratoryDetail) {
        this.laboratoryDetail = laboratoryDetail;
    }
}
