package com.CSIR.TMD.Mapper;

import com.CSIR.TMD.Entity.SectionFour;
import com.CSIR.TMD.Entity.SectionOne;
import com.CSIR.TMD.Entity.SectionThree;
import com.CSIR.TMD.Entity.SectionTwo;
import org.springframework.data.jpa.domain.Specification;

public class SectionSpecifications {

    public static Specification<SectionOne> withTheme(String theme) {
        return (root, query, criteriaBuilder) -> {
            if (theme == null || theme.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("theme"), theme);
        };
    }

    public static Specification<SectionOne> withIndustrialSector(String industrialSector) {
        return (root, query, criteriaBuilder) -> {
            if (industrialSector == null || industrialSector.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("industrialSector"), industrialSector);
        };
    }

    public static Specification<SectionOne> withLab(String lab) {
        return (root, query, criteriaBuilder) -> {
            if (lab == null || lab.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("multiLabInstitute"), lab);
        };
    }

    public static Specification<SectionOne> withTechRefNoSecOne(String technologyRefNo) {
        return (root, query, criteriaBuilder) -> {
            if (technologyRefNo == null || technologyRefNo.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("technologyRefNo"), technologyRefNo);
        };
    }

    public static Specification<SectionTwo> withTechRefNoSecTwo(String technologyRefNo) {
        return (root, query, criteriaBuilder) -> {
            if (technologyRefNo == null || technologyRefNo.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("technologyRefNo"), technologyRefNo);
        };
    }

    public static Specification<SectionThree> withTechRefNoSecThree(String technologyRefNo) {
        return (root, query, criteriaBuilder) -> {
            if (technologyRefNo == null || technologyRefNo.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("technologyRefNo"), technologyRefNo);
        };
    }

    public static Specification<SectionFour> withTechRefNoSecFour(String technologyRefNo) {
        return (root, query, criteriaBuilder) -> {
            if (technologyRefNo == null || technologyRefNo.isEmpty()) {
                return criteriaBuilder.conjunction();
            }
            return criteriaBuilder.equal(root.get("technologyRefNo"), technologyRefNo);
        };
    }



}
