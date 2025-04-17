package com.CSIR.TMD.Repository;



import com.CSIR.TMD.Entity.SectionThree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SectionThreeRepository extends JpaRepository<SectionThree, String> , JpaSpecificationExecutor<SectionThree> {
    Optional<SectionThree> findByTechnologyRefNo(String technologyRefNo);

}
