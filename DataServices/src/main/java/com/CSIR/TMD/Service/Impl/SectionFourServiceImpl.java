package com.CSIR.TMD.Service.Impl;

import com.CSIR.TMD.DTO.SectionFourDTO;
import com.CSIR.TMD.Entity.SectionFour;
import com.CSIR.TMD.Mapper.SectionFourMapper;
import com.CSIR.TMD.Repository.SectionFourRepository;
import com.CSIR.TMD.Service.SectionFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionFourServiceImpl implements SectionFourService {

    @Autowired
    private SectionFourRepository sectionFourRepository;

    @Override
    public SectionFourDTO saveSection(SectionFourDTO sectionFourDTO) {
        SectionFour sectionFour = SectionFourMapper.toEntity(sectionFourDTO); // Convert DTO to Entity
        SectionFour savedSectionFour = sectionFourRepository.save(sectionFour); // Save the entity
        return SectionFourMapper.toDTO(savedSectionFour); // Convert saved Entity back to DTO
    }

    @Override
    public SectionFourDTO getSectionById(String technologyRefNo) {
        Optional<SectionFour> sectionFour = sectionFourRepository.findById(technologyRefNo); // Find by ID
        return sectionFour.map(SectionFourMapper::toDTO).orElse(null); // Convert Entity to DTO or return null
    }

    @Override
    public List<SectionFourDTO> getAllSectionFours() {
        List<SectionFour> sectionFours = sectionFourRepository.findAll(); // Get all entities
        return SectionFourMapper.toDTOList(sectionFours); // Convert List of Entities to List of DTOs
    }

    @Override
    public void deleteSectionFour(String technologyRefNo) {
        sectionFourRepository.deleteById(technologyRefNo); // Delete by ID
    }


    @Override
    public SectionFourDTO getByTechnologyRefNo(String technologyRefNo) {
        return sectionFourRepository.findByTechnologyRefNo(technologyRefNo)
                .map(SectionFourMapper::toDTO)
                .orElse(new SectionFourDTO()); // Return empty DTO
    }


}