package com.CSIR.TMD.Service;


import com.CSIR.TMD.Dto.SectionOneDTO;
import com.CSIR.TMD.Entity.SectionOne;

import java.util.List;

public interface SectionOneService {
    List<SectionOneDTO> getAllSections();
    SectionOneDTO getSectionById(Long id);
    SectionOneDTO saveSection(SectionOneDTO sectionOneDTO);

}
