package com.CSIR.TMD.Controller;

import com.CSIR.TMD.DTO.SectionFourDTO;
import com.CSIR.TMD.DTO.SectionOneDTO;
import com.CSIR.TMD.DTO.SectionThreeDTO;
import com.CSIR.TMD.DTO.SectionTwoDTO;
//import com.CSIR.TMD.Model.SearchRequestDTO;
//import com.CSIR.TMD.Service.Impl.SearchService;
import com.CSIR.TMD.Model.CompositeResponse;
import com.CSIR.TMD.Model.SearchRequest;
import com.CSIR.TMD.Service.Impl.SectionService;
import com.CSIR.TMD.Service.SectionFourService;
import com.CSIR.TMD.Service.SectionOneService;
import com.CSIR.TMD.Service.SectionTwoService;
import com.CSIR.TMD.Service.SectionThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/apf/tdmp") // Base URL for this controller
public class TDMPController {

    @Autowired
    private SectionOneService sectionOneService;

    @Autowired
    private SectionTwoService sectionTwoService;

    @Autowired
    private SectionThreeService sectionThreeService;

    @Autowired
    private SectionFourService sectionFourService;


    // Get sectionOne
    @GetMapping("/sectionOne")
    public ResponseEntity<List<SectionOneDTO>> getAllSectionOne() {
        List<SectionOneDTO> sectionOne = sectionOneService.getAllSections();
        return new ResponseEntity<>(sectionOne, HttpStatus.OK);
    }

    // Get sectionTwo
    @GetMapping("/sectionTwo")
    public ResponseEntity<List<SectionTwoDTO>> getAllSectionTwo() {
        List<SectionTwoDTO> sectionTwo = sectionTwoService.getAllSections();
        return new ResponseEntity<>(sectionTwo, HttpStatus.OK);
    }

    @GetMapping("/sectionThree")
    public ResponseEntity<List<SectionThreeDTO>> getAllSectionThree() {
        List<SectionThreeDTO> sectionThree = sectionThreeService.getAllSections();
        return new ResponseEntity<>(sectionThree, HttpStatus.OK);
    }

    @GetMapping("/sectionFour")
    public ResponseEntity<List<SectionFourDTO>> getAllSectionFour() {
        List<SectionFourDTO> sectionFour = sectionFourService.getAllSectionFours();
        return new ResponseEntity<>(sectionFour, HttpStatus.OK);
    }

    // Get section by ID
    @GetMapping("/sectionOne/{technologyRefNo}")
    public ResponseEntity<SectionOneDTO> getSectionOneById(@PathVariable String technologyRefNo) {
        SectionOneDTO section = sectionOneService.getSectionById(technologyRefNo);
        if (section != null) {
            return new ResponseEntity<>(section, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/sectionTwo/{technologyRefNo}")
    public ResponseEntity<SectionTwoDTO> getSectionTwoById(@PathVariable String technologyRefNo) {
        SectionTwoDTO section = sectionTwoService.getSectionById(technologyRefNo);
        if (section != null) {
            return new ResponseEntity<>(section, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/sectionThree/{technologyRefNo}")
    public ResponseEntity<SectionThreeDTO> getSectionThreeById(@PathVariable String technologyRefNo) {
        SectionThreeDTO section = sectionThreeService.getSectionById(technologyRefNo);
        if (section != null) {
            return new ResponseEntity<>(section, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/sectionFour/{technologyRefNo}")
    public ResponseEntity<SectionFourDTO> getSectionFourById(@PathVariable String technologyRefNo) {
        SectionFourDTO section = sectionFourService.getSectionById(technologyRefNo);
        if (section != null) {
            return new ResponseEntity<>(section, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new section
    @PostMapping("/saveSectionOne")
    public ResponseEntity<SectionOneDTO> saveSectionOne(@RequestBody SectionOneDTO sectionOneDTO) {

        SectionOneDTO savedSection = sectionOneService.saveSection(sectionOneDTO);
        return new ResponseEntity<>(savedSection, HttpStatus.CREATED);
    }

    @PostMapping("/saveSectionTwo")
    public ResponseEntity<SectionTwoDTO> saveSectionTwo(@RequestBody SectionTwoDTO sectionTwoDTO) {
        SectionTwoDTO savedSection = sectionTwoService.saveSection(sectionTwoDTO);
        return new ResponseEntity<>(savedSection, HttpStatus.CREATED);
    }

    @PostMapping("/saveSectionThree")
    public ResponseEntity<SectionThreeDTO> saveSectionThree(@RequestBody SectionThreeDTO sectionThreeDTO) {

        SectionThreeDTO savedSection = sectionThreeService.saveSection(sectionThreeDTO);
        return new ResponseEntity<>(savedSection, HttpStatus.CREATED);
    }

    @PostMapping("/saveSectionFour")
    public ResponseEntity<SectionFourDTO> saveSectionThree(@RequestBody SectionFourDTO sectionFourDTO) {
        SectionFourDTO savedSection = sectionFourService.saveSection(sectionFourDTO);
        return new ResponseEntity<>(savedSection, HttpStatus.CREATED);
    }


    @Autowired
    private SectionService sectionService;

    @PostMapping("/search")
    public CompositeResponse searchSections(@RequestBody SearchRequest searchRequest) {
        return sectionService.searchSections(searchRequest);
    }

}
