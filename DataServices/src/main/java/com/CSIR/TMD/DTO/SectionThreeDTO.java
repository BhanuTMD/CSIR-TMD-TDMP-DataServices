package com.CSIR.TMD.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SectionThreeDTO {
    private String technologyRefNo;
    private String licenseName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfAgreementSigning;

    private String typeOfLicense;
    private String staRegionalGeography;
    private String detailsOfExclusivity;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfLicense;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date licenseValidUntil;

    private String paymentTerms;
    private List<RoyaltyDTO> royalty;
    private Double subTotalRoyalty;
    private List<PremiaDTO> premia;
    private Double subTotalPremia;
    private Double grandTotal;

    public SectionThreeDTO(String technologyRefNo, String licenseName, Date dateOfAgreementSigning, String typeOfLicense, String staRegionalGeography, String detailsOfExclusivity, Date dateOfLicense, Date licenseValidUntil, String paymentTerms, List<RoyaltyDTO> royalty, Double subTotalRoyalty, List<PremiaDTO> premia, Double subTotalPremia, Double grandTotal) {
        this.technologyRefNo = technologyRefNo;
        this.licenseName = licenseName;
        this.dateOfAgreementSigning = dateOfAgreementSigning;
        this.typeOfLicense = typeOfLicense;
        this.staRegionalGeography = staRegionalGeography;
        this.detailsOfExclusivity = detailsOfExclusivity;
        this.dateOfLicense = dateOfLicense;
        this.licenseValidUntil = licenseValidUntil;
        this.paymentTerms = paymentTerms;
        this.royalty = royalty;
        this.subTotalRoyalty = subTotalRoyalty;
        this.premia = premia;
        this.subTotalPremia = subTotalPremia;
        this.grandTotal = grandTotal;
    }

    public SectionThreeDTO() {
    }

    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public Date getDateOfAgreementSigning() {
        return dateOfAgreementSigning;
    }

    public void setDateOfAgreementSigning(Date dateOfAgreementSigning) {
        this.dateOfAgreementSigning = dateOfAgreementSigning;
    }

    public String getTypeOfLicense() {
        return typeOfLicense;
    }

    public void setTypeOfLicense(String typeOfLicense) {
        this.typeOfLicense = typeOfLicense;
    }

    public String getstaRegionalGeography() {
        return staRegionalGeography;
    }

    public void setstaRegionalGeography(String staRegionalGeography) {
        this.staRegionalGeography = staRegionalGeography;
    }

    public String getDetailsOfExclusivity() {
        return detailsOfExclusivity;
    }

    public void setDetailsOfExclusivity(String detailsOfExclusivity) {
        this.detailsOfExclusivity = detailsOfExclusivity;
    }

    public Date getDateOfLicense() {
        return dateOfLicense;
    }

    public void setDateOfLicense(Date dateOfLicense) {
        this.dateOfLicense = dateOfLicense;
    }

    public Date getLicenseValidUntil() {
        return licenseValidUntil;
    }

    public void setLicenseValidUntil(Date licenseValidUntil) {
        this.licenseValidUntil = licenseValidUntil;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public List<RoyaltyDTO> getRoyalty() {
        return royalty;
    }

    public void setRoyalty(List<RoyaltyDTO> royalty) {
        this.royalty = royalty;
    }

    public Double getSubTotalRoyalty() {
        return subTotalRoyalty;
    }

    public void setSubTotalRoyalty(Double subTotalRoyalty) {
        this.subTotalRoyalty = subTotalRoyalty;
    }

    public List<PremiaDTO> getPremia() {
        return premia;
    }

    public void setPremia(List<PremiaDTO> premia) {
        this.premia = premia;
    }

    public Double getSubTotalPremia() {
        return subTotalPremia;
    }

    public void setSubTotalPremia(Double subTotalPremia) {
        this.subTotalPremia = subTotalPremia;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }


// Getters and Setters
}
