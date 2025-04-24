package com.CSIR.TMD.Service;


import com.CSIR.TMD.DTO.SectionOneDTO;

import java.util.List;

public interface SectionOneService {
    List<SectionOneDTO> getAllSections();
    SectionOneDTO getSectionById(String technologyRefNo);
    SectionOneDTO saveSection(SectionOneDTO sectionOneDTO);
    SectionOneDTO getByTechnologyRefNo(String technologyRefNo);
//    List<String> getAllTechnologyRefNo();

}
