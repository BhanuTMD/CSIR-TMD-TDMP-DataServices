package com.CSIR.TMD.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class PremiaDTO {
    private Double amount;
    private Date date;

    public Double getAmount() {
        return amount;
    }

    public PremiaDTO() {
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PremiaDTO(Double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }
// Getters and Setters
}