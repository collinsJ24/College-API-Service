package com.college.api.service;

import com.college.api.entity.CollegeCourseEntity;
import com.college.api.entity.CollegeEntity;

import java.util.List;

public interface CollegeService {

    List<CollegeCourseEntity> getCollegeCourseInfoById(String collegeId);

    List<CollegeEntity> getColleges();
}
