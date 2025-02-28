package com.CSIR.TMD.DTO;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SectionThreeDTO {
    private String technologyRefNo;
    private String licenseName;
    private Date dateOfAgreementSigning;
    private String typeOfLicense;
    private String regionalGeography;
    private String detailsOfExclusivity;
    private Date dateOfLicense;
    private Date licenseValidUntil;
    private String paymentTerms;
    private List<RoyaltyDTO> royalty;
    private Double subtotalRoyalty;
    private List<PremiaDTO> premia;
    private Double subtotalPremia;
    private Double grandTotal;

    public SectionThreeDTO(String technologyRefNo, String licenseName, Date dateOfAgreementSigning, String typeOfLicense, String regionalGeography, String detailsOfExclusivity, Date dateOfLicense, Date licenseValidUntil, String paymentTerms, List<RoyaltyDTO> royalty, Double subtotalRoyalty, List<PremiaDTO> premia, Double subtotalPremia, Double grandTotal) {
        this.technologyRefNo = technologyRefNo;
        this.licenseName = licenseName;
        this.dateOfAgreementSigning = dateOfAgreementSigning;
        this.typeOfLicense = typeOfLicense;
        this.regionalGeography = regionalGeography;
        this.detailsOfExclusivity = detailsOfExclusivity;
        this.dateOfLicense = dateOfLicense;
        this.licenseValidUntil = licenseValidUntil;
        this.paymentTerms = paymentTerms;
        this.royalty = royalty;
        this.subtotalRoyalty = subtotalRoyalty;
        this.premia = premia;
        this.subtotalPremia = subtotalPremia;
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

    public String getRegionalGeography() {
        return regionalGeography;
    }

    public void setRegionalGeography(String regionalGeography) {
        this.regionalGeography = regionalGeography;
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

    public Double getSubtotalRoyalty() {
        return subtotalRoyalty;
    }

    public void setSubtotalRoyalty(Double subtotalRoyalty) {
        this.subtotalRoyalty = subtotalRoyalty;
    }

    public List<PremiaDTO> getPremia() {
        return premia;
    }

    public void setPremia(List<PremiaDTO> premia) {
        this.premia = premia;
    }

    public Double getSubtotalPremia() {
        return subtotalPremia;
    }

    public void setSubtotalPremia(Double subtotalPremia) {
        this.subtotalPremia = subtotalPremia;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }


// Getters and Setters
}
