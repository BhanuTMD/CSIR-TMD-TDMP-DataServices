package com.CSIR.TMD.Repository;

import com.CSIR.TMD.Entity.SectionTwo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SectionTwoRepository extends JpaRepository<SectionTwo, String> {
    Optional<Object> findByTechnologyRefNo(String technologyRefNo);
    // You can define custom query methods here if needed
}
