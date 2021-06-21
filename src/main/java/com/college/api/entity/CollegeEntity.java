package com.college.api.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="colleges")
public class CollegeEntity implements Serializable {

    private static final long serialVersionUID = 5313593413859894403L;

    @Id
    @Column(nullable=false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
