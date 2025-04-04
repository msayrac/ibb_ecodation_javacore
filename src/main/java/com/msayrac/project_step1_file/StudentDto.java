package com.msayrac.project_step1_file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor // LOMBOK
@Builder
@ToString
@EqualsAndHashCode


public class StudentDto implements Serializable {

    private static final Long serialVersionUID = 5566887799L;

    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthday;
    private Date createdDate;
    private Double grade;

    // static nesne boyunca bir kere oluşturulur
    static {

    }

    // parametresiz constructor
    public StudentDto() {
    }

    //Parametreli constructor
    public StudentDto(Integer id, String name, String surname, LocalDate birthday, Double grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.grade = grade;
    }


    // Mothods


    //Getter Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }


}
