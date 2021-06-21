package com.college.api.repository;

import com.college.api.entity.CollegeCourseEntity;
import com.college.api.entity.CollegeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CollegeCourseRepository extends CrudRepository<CollegeCourseEntity, String> {
     @Query(value="select * from colleges_course_table c where c.college_code = :college_code",nativeQuery=true)
     List<CollegeCourseEntity> findBycollege_code(@Param("college_code")String college_code);


}
