package com.SeventhGroup.CollegeSearchJob.dao;

import com.SeventhGroup.CollegeSearchJob.entity.AppOfcomEntity;
import com.SeventhGroup.CollegeSearchJob.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchDao extends JpaRepository<ApplicationEntity, String> {

    List<ApplicationEntity> findByApplicationId(String applicationId);
    List<ApplicationEntity> findByComName(String comName);
    List<ApplicationEntity> findByPosition(String position);
    List<ApplicationEntity> findByTag(String tag);
   // List<ApplicationEntity> findByCompanyId(String companyId);




    @Modifying
    void deleteByApplicationId(String applicationId);
   //void deleteByUserId(String userId);
   //void deleteByCompanyId(String companyId);


}
