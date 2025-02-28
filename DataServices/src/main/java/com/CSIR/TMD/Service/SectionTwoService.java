package com.CSIR.TMD.Service;


import com.CSIR.TMD.DTO.SectionOneDTO;
import com.CSIR.TMD.DTO.SectionTwoDTO;

import java.util.List;

public interface SectionTwoService {
    List<SectionTwoDTO> getAllSections();
    SectionTwoDTO getSectionById(String technologyRefNo);
    SectionTwoDTO saveSection(SectionTwoDTO sectionTwoDTO);

}
