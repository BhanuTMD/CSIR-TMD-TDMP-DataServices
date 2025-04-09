package com.CSIR.TMD.Mapper;

import com.CSIR.TMD.DTO.SectionOneDTO;
import com.CSIR.TMD.Entity.SectionOne;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class SectionOneMapper {

    // Convert Entity to DTO
    public static SectionOneDTO toSectionOneDTO(SectionOne sectionOne) {
        if (sectionOne == null) {
            return null;
        }

        SectionOneDTO sectionOneDTO = new SectionOneDTO();
        sectionOneDTO.setTechnologyRefNo(sectionOne.getTechnologyRefNo());
        sectionOneDTO.setKeywordTechnology(sectionOne.getKeywordTechnology());
        sectionOneDTO.setNameTechnology(sectionOne.getNameTechnology());
        sectionOneDTO.setIndustrialSector(sectionOne.getIndustrialSector());
        sectionOneDTO.setMultiLabInstitute(sectionOne.getMultiLabInstitute());
        sectionOneDTO.setLeadLaboratory(sectionOne.getLeadLaboratory());
        sectionOneDTO.setAssociateInstitute(sectionOne.getAssociateInstitute());
        sectionOneDTO.setTheme(sectionOne.getTheme());
        sectionOneDTO.setTechnologyLevel(sectionOne.getTechnologyLevel());
        sectionOneDTO.setScaleDevelopment(sectionOne.getScaleDevelopment());
        sectionOneDTO.setYearDevelopment(sectionOne.getYearDevelopment());
        sectionOneDTO.setBriefTech(sectionOne.getBriefTech());
        sectionOneDTO.setCompetitivePosition(sectionOne.getCompetitivePosition());
        sectionOneDTO.setStakeHolders(sectionOne.getStakeHolders());
        sectionOneDTO.setTechnoEconomics(sectionOne.getTechnoEconomics());
        sectionOneDTO.setMarketPotential(sectionOne.getMarketPotential());
        sectionOneDTO.setEnvironmentalStatutory(sectionOne.getEnvironmentalStatutory());
        sectionOneDTO.setPicture(sectionOne.getPicture()); // Do not set the picture here, as it's not part of the entity
        sectionOneDTO.setLaboratoryDetail(sectionOne.getLaboratoryDetail());

        return sectionOneDTO;
    }

    // Convert DTO to Entity
    public static SectionOne toSectionOne(SectionOneDTO sectionOneDTO) {
        if (sectionOneDTO == null) {
            return null;
        }

        SectionOne sectionOne = new SectionOne();
        sectionOne.setTechnologyRefNo(sectionOneDTO.getTechnologyRefNo());
        sectionOne.setKeywordTechnology(sectionOneDTO.getKeywordTechnology());
        sectionOne.setNameTechnology(sectionOneDTO.getNameTechnology());
        sectionOne.setIndustrialSector(sectionOneDTO.getIndustrialSector());
        sectionOne.setMultiLabInstitute(sectionOneDTO.getMultiLabInstitute());
        sectionOne.setLeadLaboratory(sectionOneDTO.getLeadLaboratory());
        sectionOne.setTheme(sectionOneDTO.getTheme());
        sectionOne.setAssociateInstitute(sectionOneDTO.getAssociateInstitute());
        sectionOne.setTechnologyLevel(sectionOneDTO.getTechnologyLevel());
        sectionOne.setScaleDevelopment(sectionOneDTO.getScaleDevelopment());
        sectionOne.setYearDevelopment(sectionOneDTO.getYearDevelopment());
        sectionOne.setBriefTech(sectionOneDTO.getBriefTech());
        sectionOne.setCompetitivePosition(sectionOneDTO.getCompetitivePosition());
        sectionOne.setStakeHolders(sectionOneDTO.getStakeHolders());
        sectionOne.setTechnoEconomics(sectionOneDTO.getTechnoEconomics());
        sectionOne.setMarketPotential(sectionOneDTO.getMarketPotential());
        sectionOne.setEnvironmentalStatutory(sectionOneDTO.getEnvironmentalStatutory());

        // Handle the picture upload
//        if (sectionOneDTO.getPicture() != null && !sectionOneDTO.getPicture().isEmpty()) {
//            // Assuming the service will handle the file upload and return the file path
//            String filePath = saveUploadedFile(sectionOneDTO.getPicture());
//            sectionOne.setPicture(filePath); // Set the file path in the entity
//        } else {
//            sectionOne.setPicture(null); // Set to null if no file is uploaded
//        }

        sectionOne.setPicture(sectionOneDTO.getPicture());
        sectionOne.setLaboratoryDetail(sectionOneDTO.getLaboratoryDetail());

        return sectionOne;
    }

    // Method to save the uploaded file and return the file path
    private static String saveUploadedFile(MultipartFile file) {
        // Define the directory to save the file
        String directory = "D:\\Bhanu\\APF\\uploads"; // Ensure this directory exists
        String filePath = directory + file.getOriginalFilename();

        try {
            // Save the file to the specified location
            Path path = Paths.get(filePath);
            Files.createDirectories(path.getParent()); // Create directories if they don't exist
            file.transferTo(path.toFile());
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception (e.g., return an error response)
            return null; // Return null or handle as needed
        }

        return filePath; // Return the file path or URL
    }
}