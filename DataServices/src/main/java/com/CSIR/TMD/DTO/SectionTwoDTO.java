package com.CSIR.TMD.DTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Data
public class SectionTwoDTO {

    // Getters and Setters

//    private Long id; // Optional, if you want to expose the ID
    private String technologyRefNo;
    private String iprType;
    private String registrationNo;
    private String status;
        private Date statusDate;
        private List<String> country;

    // Default constructor
    public SectionTwoDTO() {
    }

    // All-args constructor
    public SectionTwoDTO( String technologyRefNo, String iprType, String registrationNo,
                         String status, Date statusDate, List<String> country) {
//        this.id = id;
        this.technologyRefNo = technologyRefNo;
        this.iprType = iprType;
        this.registrationNo = registrationNo;
        this.status = status;
        this.statusDate = statusDate;
        this.country = country;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }


    public String getTechnologyRefNo() {
        return technologyRefNo;
    }

    public void setTechnologyRefNo(String technologyRefNo) {
        this.technologyRefNo = technologyRefNo;
    }

    public String getIprType() {
        return iprType;
    }

    public void setIprType(String iprType) {
        this.iprType = iprType;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }
}
