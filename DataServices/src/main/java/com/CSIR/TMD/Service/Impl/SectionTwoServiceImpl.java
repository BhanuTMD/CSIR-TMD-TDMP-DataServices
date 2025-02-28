package com.CSIR.TMD.Service.Impl;

import com.CSIR.TMD.DTO.SectionTwoDTO;
import com.CSIR.TMD.Entity.SectionTwo;
import com.CSIR.TMD.Exception.ResponseNotFoundException;
import com.CSIR.TMD.Mapper.SectionTwoMapper;
import com.CSIR.TMD.Repository.SectionTwoRepository;
import com.CSIR.TMD.Service.SectionTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SectionTwoServiceImpl implements SectionTwoService {

    @Autowired
    private SectionTwoRepository SectionTwoRepository;

    public List<SectionTwoDTO> getAllSections() {
        List<SectionTwo> SectionTwoList = SectionTwoRepository.findAll();
        List<SectionTwoDTO> SectionTwoDTOList = SectionTwoList.stream()
                .map(SectionTwoMapper::toDTO) // Assuming you have a mapper method
                .collect(Collectors.toList());
        return SectionTwoDTOList;
    }

    @Override
    public SectionTwoDTO getSectionById(String technologyRefNo) {
        SectionTwo SectionTwo = (com.CSIR.TMD.Entity.SectionTwo) SectionTwoRepository.findByTechnologyRefNo(technologyRefNo).orElseThrow(() ->
                new ResponseNotFoundException("technology Not Found" + technologyRefNo));
        return SectionTwoMapper.toDTO(SectionTwo);
    }

    public SectionTwoDTO saveSection(SectionTwoDTO SectionTwoDTO) {
        SectionTwo SectionTwo = SectionTwoMapper.toEntity(SectionTwoDTO);
        SectionTwo savedEmployee =SectionTwoRepository.save(SectionTwo);
        return SectionTwoMapper.toDTO(savedEmployee);
    }
}

