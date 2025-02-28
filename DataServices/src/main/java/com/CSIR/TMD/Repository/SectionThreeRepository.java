package com.CSIR.TMD.Repository;



import com.CSIR.TMD.Entity.SectionThree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionThreeRepository extends JpaRepository<SectionThree, String> {
}
