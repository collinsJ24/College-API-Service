package com.college.api.model;

public class CollegeCourseResponse {

    private String course_name;
    private String college_code;
    private String course_code;

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getcollege_code() {
        return college_code;
    }

    public void setcollege_code(String college_code) {
        this.college_code = college_code;
    }
}
