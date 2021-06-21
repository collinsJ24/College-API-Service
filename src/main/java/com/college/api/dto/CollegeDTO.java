package com.college.api.dto;

import java.io.Serializable;

public class CollegeDTO implements Serializable {
    private static final long serialVersionUID = 6835192601898364280L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
