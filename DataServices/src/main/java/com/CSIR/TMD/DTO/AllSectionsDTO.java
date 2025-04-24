package com.CSIR.TMD.DTO;

import lombok.Data;

@Data
public class AllSectionsDTO {
    private SectionOneDTO sectionOne;
    private SectionTwoDTO sectionTwo;
    private SectionThreeDTO sectionThree;
    private SectionFourDTO sectionFour;

    // Getters and Setters

    //Constructor
    public AllSectionsDTO() {
    }
    public AllSectionsDTO(SectionOneDTO sectionOne, SectionTwoDTO sectionTwo, SectionThreeDTO sectionThree, SectionFourDTO sectionFour) {
        this.sectionOne = sectionOne;
        this.sectionTwo = sectionTwo;
        this.sectionThree = sectionThree;
        this.sectionFour = sectionFour;
    }

    public SectionOneDTO getSectionOne() {
        return sectionOne;
    }
    public void setSectionOne(SectionOneDTO sectionOne) {
        this.sectionOne = sectionOne;
    }
    public SectionTwoDTO getSectionTwo() {
        return sectionTwo;
    }
    public void setSectionTwo(SectionTwoDTO sectionTwo) {
        this.sectionTwo = sectionTwo;
    }
    public SectionThreeDTO getSectionThree() {
        return sectionThree;
    }
    public void setSectionThree(SectionThreeDTO sectionThree) {
        this.sectionThree = sectionThree;
    }
    public SectionFourDTO getSectionFour() {
        return sectionFour;
    }
    public void setSectionFour(SectionFourDTO sectionFour) {
        this.sectionFour = sectionFour;
    }


}
