package com.jeeva.rest.restspringdata;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by jeevaraj.dhanaraj on 1/26/2018.
 */
@Entity
public class User {
    @Id
    private Long id;

    private String name;

    private int age;

    private Date dateOfBirth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
