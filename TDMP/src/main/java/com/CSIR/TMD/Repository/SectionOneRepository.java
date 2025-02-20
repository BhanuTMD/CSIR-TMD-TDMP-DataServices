package com.CSIR.TMD.Repository;

import com.CSIR.TMD.Entity.SectionOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionOneRepository extends JpaRepository<SectionOne, Long> {
    // You can define custom query methods here if needed
}
