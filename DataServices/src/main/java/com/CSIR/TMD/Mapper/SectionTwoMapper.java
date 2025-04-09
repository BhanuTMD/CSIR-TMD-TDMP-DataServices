package com.CSIR.TMD.Mapper;

import com.CSIR.TMD.DTO.SectionTwoDTO;
import com.CSIR.TMD.Entity.SectionTwo;

import java.util.List;
import java.util.stream.Collectors;

public class SectionTwoMapper {

    public static SectionTwoDTO toDTO(SectionTwo sectionTwo) {
        if (sectionTwo == null) {
            return null;
        }
        return new SectionTwoDTO(
//                sectionTwo.getId(),
                sectionTwo.getTechnologyRefNo(),
                sectionTwo.getIprType(),
                sectionTwo.getRegistrationNo(),
                sectionTwo.getStatus(),
                sectionTwo.getStatusDate(),
                sectionTwo.getCountries()
        );
    }

    public static SectionTwo toEntity(SectionTwoDTO sectionTwoDTO) {
        if (sectionTwoDTO == null) {
            return null;
        }
        SectionTwo sectionTwo = new SectionTwo();
//        sectionTwo.setId(sectionTwoDTO.getId());
        sectionTwo.setTechnologyRefNo(sectionTwoDTO.getTechnologyRefNo());
        sectionTwo.setIprType(sectionTwoDTO.getIprType());
        sectionTwo.setRegistrationNo(sectionTwoDTO.getRegistrationNo());
        sectionTwo.setStatus(sectionTwoDTO.getStatus());
        sectionTwo.setStatusDate(sectionTwoDTO.getStatusDate());
        sectionTwo.setCountries(sectionTwoDTO.getCountry());
        return sectionTwo;
    }

    public static List<SectionTwoDTO> toDTOList(List<SectionTwo> sectionTwos) {
        return sectionTwos.stream()
                .map(SectionTwoMapper::toDTO)
                .collect(Collectors.toList());
    }


}
