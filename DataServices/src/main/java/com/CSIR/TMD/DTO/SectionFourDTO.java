package com.CSIR.TMD.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SectionFourDTO {
    private String technologyRefNo; // Assuming you want to include the ID
    private String clientName;
    private String clientAddress;
    private String city;
    private String country;

    public SectionFourDTO() {
    }

    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNodalContactPerson() {
        return nodalContactPerson;
    }

    public void setNodalContactPerson(String nodalContactPerson) {
        this.nodalContactPerson = nodalContactPerson;
    }

    public String getDeploymentDetails() {
        return deploymentDetails;
    }

    public void setDeploymentDetails(String deploymentDetails) {
        this.deploymentDetails = deploymentDetails;
    }

    public SectionFourDTO(String technologyRefNo, String clientName, String clientAddress, String city, String country, String nodalContactPerson, String deploymentDetails) {
        this.technologyRefNo = technologyRefNo;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.city = city;
        this.country = country;
        this.nodalContactPerson = nodalContactPerson;
        this.deploymentDetails = deploymentDetails;
    }

    private String nodalContactPerson;
    private String deploymentDetails;
}
