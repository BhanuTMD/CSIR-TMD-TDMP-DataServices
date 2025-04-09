package com.CSIR.TMD.Mapper;

import com.CSIR.TMD.DTO.SectionFourDTO;
import com.CSIR.TMD.Entity.SectionFour;

import java.util.List;
import java.util.stream.Collectors;

public class SectionFourMapper {

    public static SectionFourDTO toDTO(SectionFour sectionFour) {
        if (sectionFour == null) {
            return null;
        }
        return new SectionFourDTO(
                sectionFour.getTechnologyRefNo(),
                sectionFour.getClientName(),
                sectionFour.getClientAddress(),
                sectionFour.getCity(),
                sectionFour.getCountry(),
                sectionFour.getNodalContactPerson(),
                sectionFour.getDeploymentDetails()
        );
    }

    public static SectionFour toEntity(SectionFourDTO sectionFourDTO) {
        if (sectionFourDTO == null) {
            return null;
        }
        SectionFour sectionFour = new SectionFour();
        sectionFour.setTechnologyRefNo(sectionFourDTO.getTechnologyRefNo());
        sectionFour.setClientName(sectionFourDTO.getClientName());
        sectionFour.setClientAddress(sectionFourDTO.getClientAddress());
        sectionFour.setCity(sectionFourDTO.getCity());
        sectionFour.setCountry(sectionFourDTO.getCountry());
        sectionFour.setNodalContactPerson(sectionFourDTO.getNodalContactPerson());
        sectionFour.setDeploymentDetails(sectionFourDTO.getDeploymentDetails());
        return sectionFour;
    }

    public static List<SectionFourDTO> toDTOList(List<SectionFour> sectionFours) {
        return sectionFours.stream()
                .map(SectionFourMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<SectionFour> toEntityList(List<SectionFourDTO> sectionFourDTOs) {
        return sectionFourDTOs.stream()
                .map(SectionFourMapper::toEntity)
                .collect(Collectors.toList());
    }
}
