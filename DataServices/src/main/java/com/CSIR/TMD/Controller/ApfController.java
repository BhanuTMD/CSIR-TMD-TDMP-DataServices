package com.CSIR.TMD.Controller;

import com.CSIR.TMD.Dto.SectionOneDTO;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Service.SectionOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apf/tdmp/") // Base URL for this controller
public class ApfController {

    @Autowired
    private SectionOneService sectionOneService;

    // Get all sections
    @GetMapping
    public ResponseEntity<List<SectionOneDTO>> getAllSections() {
        List<SectionOneDTO> sections = sectionOneService.getAllSections();
        return new ResponseEntity<>(sections, HttpStatus.OK);
    }

    // Get section by ID
    @GetMapping("/{id}")
    public ResponseEntity<SectionOneDTO> getSectionById(@PathVariable Long id) {
        SectionOneDTO section = sectionOneService.getSectionById(id);
        if (section != null) {
            return new ResponseEntity<>(section, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new section
    @PostMapping
    public ResponseEntity<SectionOneDTO> saveSection(@RequestBody SectionOneDTO sectionOneDTO) {
        SectionOneDTO savedSection = sectionOneService.saveSection(sectionOneDTO);
        return new ResponseEntity<>(savedSection, HttpStatus.CREATED);
    }


}
