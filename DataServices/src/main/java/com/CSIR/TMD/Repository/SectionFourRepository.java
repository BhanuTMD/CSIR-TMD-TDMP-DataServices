package com.CSIR.TMD.Repository;

import com.CSIR.TMD.Entity.SectionFour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionFourRepository extends JpaRepository<SectionFour, String>, JpaSpecificationExecutor<SectionFour> {
}
