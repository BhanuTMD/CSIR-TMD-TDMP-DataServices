package com.CSIR.TMD.Repository;

import com.CSIR.TMD.Entity.SectionOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionOneRepository extends JpaRepository<SectionOne, String> , JpaSpecificationExecutor<SectionOne> {
    // You can define custom query methods here if needed

    //get all list of Technology Reference Number
//    List<String> getAllTechnologyRefNo();

}
