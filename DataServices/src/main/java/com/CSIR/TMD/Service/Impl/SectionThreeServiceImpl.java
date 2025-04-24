package com.CSIR.TMD.Service.Impl;

import com.CSIR.TMD.DTO.SectionOneDTO;
import com.CSIR.TMD.DTO.SectionThreeDTO;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Entity.SectionThree;
import com.CSIR.TMD.Exception.ResponseNotFoundException;
import com.CSIR.TMD.Mapper.SectionOneMapper;
import com.CSIR.TMD.Mapper.SectionThreeMapper;
import com.CSIR.TMD.Repository.SectionThreeRepository;
import com.CSIR.TMD.Service.SectionThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionThreeServiceImpl implements SectionThreeService {

    @Autowired
    private SectionThreeRepository sectionThreeRepository;


    public SectionThreeDTO saveSection(SectionThreeDTO sectionThreeDTO) {
        SectionThree sectionThree = SectionThreeMapper.toEntity(sectionThreeDTO);
        SectionThree savedSectionThree = sectionThreeRepository.save(sectionThree);
        return SectionThreeMapper.toDTO(savedSectionThree);
    }

    public SectionThreeDTO getSectionById(String technologyRefNo) {
        SectionThree section = sectionThreeRepository.findById(technologyRefNo).orElseThrow(() ->
                new ResponseNotFoundException("technology Not Found" + technologyRefNo));
        return SectionThreeMapper.toDTO(section);
    }

    public List<SectionThreeDTO> getAllSections() {
        List<SectionThree> sectionThrees = sectionThreeRepository.findAll();
        return sectionThrees.stream()
                .map(SectionThreeMapper::toDTO)
                .toList();
    }

    @Override
    public SectionThreeDTO getByTechnologyRefNo(String technologyRefNo) {
        return sectionThreeRepository.findByTechnologyRefNo(technologyRefNo)
                .map(SectionThreeMapper::toDTO)
                .orElse(new SectionThreeDTO()); // Return empty DTO
    }

    public void deleteSectionThree(String technologyRefNo) {
        sectionThreeRepository.deleteById(technologyRefNo);
    }
}
