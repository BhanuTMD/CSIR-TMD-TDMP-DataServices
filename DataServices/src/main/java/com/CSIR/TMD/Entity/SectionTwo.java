package com.CSIR.TMD.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Section_Two")
@NoArgsConstructor
@AllArgsConstructor
public class SectionTwo {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id; // Assuming you want a primary key

    @Id
    @Column(name = "technology_ref_no", length = 25, nullable = false)
    private String technologyRefNo;

    @Column(name = "ipr_type", length = 50, nullable = false)
    private String iprType;

    @Column(name = "registration_no", length = 50)
    private String registrationNo;

    @Column(name = "status", length = 255)
    private String status;

    @Column(name = "status_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") // Specify the date format
    @Temporal(TemporalType.DATE)
    private Date statusDate;

    @ElementCollection
    @CollectionTable(name = "section_two_countries", joinColumns = @JoinColumn(name = "technology_ref_No"))
    @Column(name = "country", length = 255)
    private List<String> country;



    // Getters and Setters

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
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

    public List<String> getCountries() {
        return country;
    }

    public void setCountries(List<String> country) {
        this.country = country;
    }
}
