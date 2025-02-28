package com.CSIR.TMD.Mapper;

import com.CSIR.TMD.DTO.PremiaDTO;
import com.CSIR.TMD.DTO.RoyaltyDTO;
import com.CSIR.TMD.DTO.SectionThreeDTO;
import com.CSIR.TMD.Entity.Premia;
import com.CSIR.TMD.Entity.Royalty;
import com.CSIR.TMD.Entity.SectionThree;

import java.util.List;
import java.util.stream.Collectors;

public class SectionThreeMapper {

    public static SectionThreeDTO toDTO(SectionThree sectionThree) {
        if (sectionThree == null) {
            return null;
        }
        return new SectionThreeDTO(
                sectionThree.getTechnologyRefNo(),
                sectionThree.getLicenseName(),
                sectionThree.getDateOfAgreementSigning(),
                sectionThree.getTypeOfLicense(),
                sectionThree.getRegionalGeography(),
                sectionThree.getDetailsOfExclusivity(),
                sectionThree.getDateOfLicense(),
                sectionThree.getLicenseValidUntil(),
                sectionThree.getPaymentTerms(),
                toRoyaltyDTOList(sectionThree.getRoyalty()), // Convert List<Royalty> to List<RoyaltyDTO>
                sectionThree.getSubtotalRoyalty(),
                toPremiaDTOList(sectionThree.getPremia()), // Convert List<Premia> to List<PremiaDTO>
                sectionThree.getSubtotalPremia(),
                sectionThree.getGrandTotal()
        );
    }

    public static SectionThree toEntity(SectionThreeDTO sectionThreeDTO) {
        if (sectionThreeDTO == null) {
            return null;
        }
        SectionThree sectionThree = new SectionThree();
        sectionThree.setTechnologyRefNo(sectionThreeDTO.getTechnologyRefNo());
        sectionThree.setLicenseName(sectionThreeDTO.getLicenseName());
        sectionThree.setDateOfAgreementSigning(sectionThreeDTO.getDateOfAgreementSigning());
        sectionThree.setTypeOfLicense(sectionThreeDTO.getTypeOfLicense());
        sectionThree.setRegionalGeography(sectionThreeDTO.getRegionalGeography());
        sectionThree.setDetailsOfExclusivity(sectionThreeDTO.getDetailsOfExclusivity());
        sectionThree.setDateOfLicense(sectionThreeDTO.getDateOfLicense());
        sectionThree.setLicenseValidUntil(sectionThreeDTO.getLicenseValidUntil());
        sectionThree.setPaymentTerms(sectionThreeDTO.getPaymentTerms());
        sectionThree.setRoyalty(toRoyaltyList(sectionThreeDTO.getRoyalty())); // Convert List<RoyaltyDTO> to List<Royalty>
        sectionThree.setSubtotalRoyalty(sectionThreeDTO.getSubtotalRoyalty());
        sectionThree.setPremia(toPremiaList(sectionThreeDTO.getPremia())); // Convert List<PremiaDTO> to List<Premia>
        sectionThree.setSubtotalPremia(sectionThreeDTO.getSubtotalPremia());
        sectionThree.setGrandTotal(sectionThreeDTO.getGrandTotal());
        return sectionThree;
    }

    public static List<SectionThreeDTO> toDTOList(List<SectionThree> sectionThrees) {
        return sectionThrees.stream()
                .map(SectionThreeMapper::toDTO)
                .collect(Collectors.toList());
    }

    // Convert List<Royalty> to List<RoyaltyDTO>
    private static List<RoyaltyDTO> toRoyaltyDTOList(List<Royalty> royalties) {
        return royalties.stream()
                .map(royalty -> new RoyaltyDTO(royalty.getAmount(), royalty.getDate()))
                .collect(Collectors.toList());
    }

    // Convert List<RoyaltyDTO> to List<Royalty>
    private static List<Royalty> toRoyaltyList(List<RoyaltyDTO> royaltyDTOs) {
        return royaltyDTOs.stream()
                .map(royaltyDTO -> new Royalty(royaltyDTO.getAmount(), royaltyDTO.getDate()))
                .collect(Collectors.toList());
    }

    // Convert List<Premia> to List<PremiaDTO>
    private static List<PremiaDTO> toPremiaDTOList(List<Premia> premias) {
        return premias.stream()
                .map(premia -> new PremiaDTO(premia.getAmount(), premia.getDate()))
                .collect(Collectors.toList());
    }

    // Convert List<PremiaDTO> to List<Premia>
    private static List<Premia> toPremiaList(List<PremiaDTO> premiaDTOs) {
        return premiaDTOs.stream()
                .map(premiaDTO -> new Premia(premiaDTO.getAmount(), premiaDTO.getDate()))
                .collect(Collectors.toList());
    }
}