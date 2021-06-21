package com.college.api.controller;

import com.college.api.entity.CollegeCourseEntity;
import com.college.api.entity.CollegeEntity;
import com.college.api.model.CollegeCourseResponse;
import com.college.api.model.CollegeResponse;
import com.college.api.service.CollegeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("college")
public class CollegeController {

    private CollegeService collegeService;

    @Autowired
    public CollegeController(CollegeService collegeService){
        this.collegeService = collegeService;
    }

    @GetMapping(path="/{collegeId}")
    public List<CollegeCourseEntity> getCollegeCoursesForCollegeId(@PathVariable String collegeId){
        List<CollegeCourseResponse> response = new ArrayList<>();
        List<CollegeCourseEntity> collegeCourses = collegeService.getCollegeCourseInfoById(collegeId);
        BeanUtils.copyProperties(collegeCourses, response);
        return collegeCourses;
    }

    @GetMapping(path="/colleges")
    public List<CollegeEntity> getColleges(){
        List<CollegeResponse> response = new ArrayList<>();
        List<CollegeEntity> collegeCourses = collegeService.getColleges();
        BeanUtils.copyProperties(collegeCourses, response);
        return collegeCourses;
    }
}
