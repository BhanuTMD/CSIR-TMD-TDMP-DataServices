package com.CSIR.TMD.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Section_Three")
public class SectionThree {

    @Id
    @Column(name = "technology_ref_no", length = 25, nullable = false)
    private String technologyRefNo; // Primary key

    @Column(name = "license_name", length = 300, nullable = false)
    private String licenseName;

    @Column(name = "date_of_agreement_signing")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateOfAgreementSigning;

    @Column(name = "type_of_license", length = 100, nullable = false)
    private String typeOfLicense;

    @Column(name = "regional_geography", length = 100)
    private String staRegionalGeography;

    @Column(name = "details_of_exclusivity", length = 300)
    private String detailsOfExclusivity;

    @Column(name = "date_of_license")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateOfLicense;

    @Column(name = "license_valid_until")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date licenseValidUntil;

    @Column(name = "payment_terms", length = 300)
    private String paymentTerms;

    @ElementCollection
    @CollectionTable(name = "royalty", joinColumns = @JoinColumn(name = "technologyRefNo"))
    private List<Royalty> royalty;

    @Column(name = "subtotal_royalty")
    private Double subTotalRoyalty;

    @ElementCollection
    @CollectionTable(name = "premia", joinColumns = @JoinColumn(name = "technologyRefNo"))
    private List<Premia> premia;

    @Column(name = "subtotal_premia")
    private Double subTotalPremia;

    @Column(name = "grand_total")
    private Double grandTotal;

    public SectionThree() {
    }

    public SectionThree(String technologyRefNo, String licenseName, Date dateOfAgreementSigning, String typeOfLicense, String staRegionalGeography, String detailsOfExclusivity, Date dateOfLicense, Date licenseValidUntil, String paymentTerms, List<Royalty> royalty, Double subTotalRoyalty, List<Premia> premia, Double subTotalPremia, Double grandTotal) {
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

    public List<Royalty> getRoyalty() {
        return royalty;
    }

    public void setRoyalty(List<Royalty> royalty) {
        this.royalty = royalty;
    }

    public Double getSubTotalRoyalty() {
        return subTotalRoyalty;
    }

    public void setSubTotalRoyalty(Double subTotalRoyalty) {
        this.subTotalRoyalty = subTotalRoyalty;
    }

    public List<Premia> getPremia() {
        return premia;
    }

    public void setPremia(List<Premia> premia) {
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
// Getters and Setters (if needed)
}
