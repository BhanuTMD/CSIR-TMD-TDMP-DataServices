package com.CSIR.TMD.Model;
import com.CSIR.TMD.Entity.SectionFour;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Entity.SectionThree;
import com.CSIR.TMD.Entity.SectionTwo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompositeResponse {
    private List<SectionOne> sectionOneList;
    private List<SectionTwo> sectionTwoList;
    private List<SectionThree> sectionThreeList;
    private List<SectionFour> sectionFourList;
    private int totalPages; // Total number of pages
    private long totalElements; // Total number of elements

    public CompositeResponse() {
    }

    public CompositeResponse(List<SectionOne> sectionOneList, List<SectionTwo> sectionTwoList, List<SectionThree> sectionThreeList, List<SectionFour> sectionFourList, int totalPages, long totalElements) {
        this.sectionOneList = sectionOneList;
        this.sectionTwoList = sectionTwoList;
        this.sectionThreeList = sectionThreeList;
        this.sectionFourList = sectionFourList;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }



    public List<SectionOne> getSectionOneList() {
        return sectionOneList;
    }

    public void setSectionOneList(List<SectionOne> sectionOneList) {
        this.sectionOneList = sectionOneList;
    }

    public List<SectionTwo> getSectionTwoList() {
        return sectionTwoList;
    }

    public void setSectionTwoList(List<SectionTwo> sectionTwoList) {
        this.sectionTwoList = sectionTwoList;
    }

    public List<SectionThree> getSectionThreeList() {
        return sectionThreeList;
    }

    public void setSectionThreeList(List<SectionThree> sectionThreeList) {
        this.sectionThreeList = sectionThreeList;
    }

    public List<SectionFour> getSectionFourList() {
        return sectionFourList;
    }

    public void setSectionFourList(List<SectionFour> sectionFourList) {
        this.sectionFourList = sectionFourList;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }
}
