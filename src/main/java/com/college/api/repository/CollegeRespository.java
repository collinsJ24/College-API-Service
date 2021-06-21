package com.college.api.repository;

import com.college.api.entity.CollegeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CollegeRespository extends CrudRepository<CollegeEntity, String> {

    @Query(value="select * from colleges c",nativeQuery=true)
    List<CollegeEntity> findAllColleges();
    //List<CollegeCourseEntity> findAllBycollege_code(String college_code);

}
