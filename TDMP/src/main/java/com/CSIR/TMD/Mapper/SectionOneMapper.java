package com.CSIR.TMD.Mapper;


import com.CSIR.TMD.Dto.SectionOneDTO;
import com.CSIR.TMD.Entity.SectionOne;
import org.springframework.stereotype.Component;

@Component
public class SectionOneMapper {

    // Convert Entity to DTO
    public static SectionOneDTO toSectionOneDTO(SectionOne sectionOne) {
        if (sectionOne == null) {
            return null;
        }
        return new SectionOneDTO(
                sectionOne.getId(),
                sectionOne.getTechnologyRefNo(),
                sectionOne.getKeywordTechnology(),
                sectionOne.getNameTechnology(),
                sectionOne.getIndustrialSector(),
                sectionOne.getMultiLabInstitute(),
                sectionOne.getLeadLaboratory(),
                sectionOne.getAssociateInstitute(),
                sectionOne.getTechnologyLevel(),
                sectionOne.getScaleDevelopment(),
                sectionOne.getYearDevelopment(),
                sectionOne.getBriefTech(),
                sectionOne.getCompetitivePosition(),
                sectionOne.getTechnoEconomics(),
                sectionOne.getMarketPotential(),
                sectionOne.getEnvironmentalStatutory(),
                sectionOne.getPicture(),
                sectionOne.getLaboratoryDetail()
        );
    }

    // Convert DTO to Entity
    public static SectionOne toSectionOne(SectionOneDTO sectionOneDTO) {
        if (sectionOneDTO == null) {
            return null;
        }
        SectionOne sectionOne = new SectionOne();
        sectionOne.setId(sectionOneDTO.getId());
        sectionOne.setTechnologyRefNo(sectionOneDTO.getTechnologyRefNo());
        sectionOne.setKeywordTechnology(sectionOneDTO.getKeywordTechnology());
        sectionOne.setNameTechnology(sectionOneDTO.getNameTechnology());
        sectionOne.setIndustrialSector(sectionOneDTO.getIndustrialSector());
        sectionOne.setMultiLabInstitute(sectionOneDTO.getMultiLabInstitute());
        sectionOne.setLeadLaboratory(sectionOneDTO.getLeadLaboratory());
        sectionOne.setAssociateInstitute(sectionOneDTO.getAssociateInstitute());
        sectionOne.setTechnologyLevel(sectionOneDTO.getTechnologyLevel());
        sectionOne.setScaleDevelopment(sectionOneDTO.getScaleDevelopment());
        sectionOne.setYearDevelopment(sectionOneDTO.getYearDevelopment());
        sectionOne.setBriefTech(sectionOneDTO.getBriefTech());
        sectionOne.setCompetitivePosition(sectionOneDTO.getCompetitivePosition());
        sectionOne.setTechnoEconomics(sectionOneDTO.getTechnoEconomics());
        sectionOne.setMarketPotential(sectionOneDTO.getMarketPotential());
        sectionOne.setEnvironmentalStatutory(sectionOneDTO.getEnvironmentalStatutory());
        sectionOne.setPicture(sectionOneDTO.getPicture());
        sectionOne.setLaboratoryDetail(sectionOneDTO.getLaboratoryDetail());
        return sectionOne;
    }
}
