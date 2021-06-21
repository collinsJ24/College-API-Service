package com.college.api.service;

import com.college.api.entity.CollegeCourseEntity;
import com.college.api.entity.CollegeEntity;
import com.college.api.repository.CollegeCourseRepository;
import com.college.api.repository.CollegeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {


    CollegeCourseRepository collegeCourseRepository;

    @Autowired
    CollegeRespository collegeRepository;

    @Autowired
    public CollegeServiceImpl(CollegeCourseRepository collegeCourseRepository){
        this.collegeCourseRepository = collegeCourseRepository;
    }

    @Override
    public List<CollegeCourseEntity> getCollegeCourseInfoById(String collegeId) {

        List<CollegeCourseEntity> returnedList = collegeCourseRepository.findBycollege_code(collegeId);
        return returnedList;
    }

    @Override
    public List<CollegeEntity> getColleges() {

        List<CollegeEntity> returnedList  = collegeRepository.findAllColleges();
        return returnedList;
    }


}
