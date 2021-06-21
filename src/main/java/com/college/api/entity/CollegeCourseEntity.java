package com.college.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colleges_2")
public class CollegeCourseEntity {

    private static final long serialVersionUID = 5313493413859894403L;

    @Column(nullable=false)
    private String course_name;

    @Column(nullable=false)
    private String college_code;

    @Id
    @Column(nullable=false)
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
