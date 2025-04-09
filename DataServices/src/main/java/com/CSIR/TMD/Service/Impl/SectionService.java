package com.CSIR.TMD.Service.Impl;

import com.CSIR.TMD.Entity.SectionFour;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Entity.SectionThree;
import com.CSIR.TMD.Entity.SectionTwo;
import com.CSIR.TMD.Mapper.SectionSpecifications;
import com.CSIR.TMD.Model.CompositeResponse;
import com.CSIR.TMD.Model.SearchRequest;
import com.CSIR.TMD.Repository.SectionFourRepository;
import com.CSIR.TMD.Repository.SectionOneRepository;
import com.CSIR.TMD.Repository.SectionThreeRepository;
import com.CSIR.TMD.Repository.SectionTwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService {

    @Autowired
    private SectionOneRepository sectionRepository;

    @Autowired
    private SectionTwoRepository sectionTwoRepository;
    @Autowired
    private SectionThreeRepository sectionThreeRepository;
    @Autowired
    private SectionFourRepository sectionFourRepository;

    public CompositeResponse searchSections(SearchRequest searchRequest) {
        Pageable pageable = PageRequest.of(searchRequest.getPage(), searchRequest.getSize());

        Specification<SectionOne> sectionOneSpec = Specification.where(SectionSpecifications.withTheme(searchRequest.getTheme()))
                .and(SectionSpecifications.withIndustrialSector(searchRequest.getIndustrialSector()))
                .and(SectionSpecifications.withLab(searchRequest.getLab()))
                .and(SectionSpecifications.withTechRefNoSecOne(searchRequest.getTechnologyRefNo()));

        Page<SectionOne> sectionOnePage = sectionRepository.findAll(sectionOneSpec, pageable);
        List<SectionOne> sectionOneList = sectionOnePage.getContent();

        // Assuming SectionTwo, SectionThree, and SectionFour have similar specifications
        List<SectionTwo> sectionTwoList = sectionTwoRepository.findAll(SectionSpecifications.withTechRefNoSecTwo(searchRequest.getTechnologyRefNo()));
        List<SectionThree> sectionThreeList = sectionThreeRepository.findAll(SectionSpecifications.withTechRefNoSecThree(searchRequest.getTechnologyRefNo()));
        List<SectionFour> sectionFourList = sectionFourRepository.findAll(SectionSpecifications.withTechRefNoSecFour(searchRequest.getTechnologyRefNo()));

        return new CompositeResponse(sectionOneList, sectionTwoList, sectionThreeList, sectionFourList,
                sectionOnePage.getTotalPages(), sectionOnePage.getTotalElements());
    }
}