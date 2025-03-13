package com.CSIR.TMD.Service.Impl;

import com.CSIR.TMD.DTO.SectionOneDTO;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Exception.ResponseNotFoundException;
import com.CSIR.TMD.Mapper.SectionOneMapper;
import com.CSIR.TMD.Repository.SectionOneRepository;
import com.CSIR.TMD.Service.SectionOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SectionOneServiceImpl implements SectionOneService {

    @Autowired
    private SectionOneRepository sectionOneRepository;

    public List<SectionOneDTO> getAllSections() {
        List<SectionOne> sectionOneList = sectionOneRepository.findAll();
        List<SectionOneDTO> sectionOneDTOList = sectionOneList.stream()
                .map(SectionOneMapper::toSectionOneDTO) // Assuming you have a mapper method
                .collect(Collectors.toList());
        return sectionOneDTOList;
    }

    public SectionOneDTO getSectionById(String technologyRefNo) {
        SectionOne sectionOne = sectionOneRepository.findById(technologyRefNo).orElseThrow(() ->
                new ResponseNotFoundException("technology Not Found" + technologyRefNo));
        return SectionOneMapper.toSectionOneDTO(sectionOne);
    }

    public SectionOneDTO saveSection(SectionOneDTO sectionOneDTO) {
        
        SectionOne sectionOne = SectionOneMapper.toSectionOne(sectionOneDTO);
        SectionOne savedEmployee =sectionOneRepository.save(sectionOne);
        return SectionOneMapper.toSectionOneDTO(savedEmployee);
    }


    public String saveUploadedFile(MultipartFile file) {
        // Define the directory to save the file
        String directory = "uploads/"; // Ensure this directory exists
        String filePath = directory + file.getOriginalFilename();

        try {
            // Save the file to the specified location
            Path path = Paths.get(filePath);
            Files.createDirectories(path.getParent()); // Create directories if they don't exist
            file.transferTo(path.toFile());
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception (e.g., return an error response)
        }

        return filePath; // Return the file path or URL
    }
}

