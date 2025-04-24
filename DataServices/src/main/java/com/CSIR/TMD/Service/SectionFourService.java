package com.CSIR.TMD.Service;

import com.CSIR.TMD.DTO.SectionFourDTO; // Assuming you have a DTO for SectionFour
import com.CSIR.TMD.DTO.SectionOneDTO;

import java.util.List;
import java.util.Optional;

public interface SectionFourService {

    SectionFourDTO saveSection(SectionFourDTO sectionFourDTO);

    SectionFourDTO getSectionById(String technologyRefNo);

    List<SectionFourDTO> getAllSectionFours();

    void deleteSectionFour(String technologyRefNo);

    SectionFourDTO getByTechnologyRefNo(String technologyRefNo);
}
