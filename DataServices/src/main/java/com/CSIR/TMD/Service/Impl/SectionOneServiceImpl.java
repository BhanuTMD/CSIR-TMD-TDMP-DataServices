package com.CSIR.TMD.Service.Impl;

import com.CSIR.TMD.DTO.SectionOneDTO;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Exception.ResponseNotFoundException;
import com.CSIR.TMD.Mapper.SectionOneMapper;
import com.CSIR.TMD.Repository.SectionOneRepository;
import com.CSIR.TMD.Service.SectionOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SectionOneServiceImpl implements SectionOneService {

    @Autowired
    private SectionOneRepository sectionOneRepository;

    public List<SectionOneDTO> getAllSections() {
        List<SectionOne> sectionOneList = sectionOneRepository.findAll();
        List<SectionOneDTO> sectionOneDTOList = sectionOneList.stream()
                .map(SectionOneMapper::toSectionOneDTO) // Assuming you have a mapper method
                .collect(Collectors.toList());
        return sectionOneDTOList;
    }

    public SectionOneDTO getSectionById(String technologyRefNo) {
        SectionOne sectionOne = sectionOneRepository.findById(technologyRefNo).orElseThrow(() ->
                new ResponseNotFoundException("technology Not Found" + technologyRefNo));
        return SectionOneMapper.toSectionOneDTO(sectionOne);
    }

    public SectionOneDTO saveSection(SectionOneDTO sectionOneDTO) {
        
        SectionOne sectionOne = SectionOneMapper.toSectionOne(sectionOneDTO);
        SectionOne savedEmployee =sectionOneRepository.save(sectionOne);
        return SectionOneMapper.toSectionOneDTO(savedEmployee);
    }
}

