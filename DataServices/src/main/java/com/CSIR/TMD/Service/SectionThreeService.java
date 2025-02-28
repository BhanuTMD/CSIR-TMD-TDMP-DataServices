package com.CSIR.TMD.Service;

import com.CSIR.TMD.DTO.SectionThreeDTO;

import java.util.List;
import java.util.Optional;

public interface SectionThreeService {

    SectionThreeDTO saveSection(SectionThreeDTO sectionThreeDTO);

    SectionThreeDTO getSectionById(String technologyRefNo);

    List<SectionThreeDTO> getAllSections();

    void deleteSectionThree(String technologyRefNo);
}
