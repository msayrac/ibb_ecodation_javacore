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
    private Double midTerm;
    private Double finalTerm;
    private Double resultTerm;

    private LocalDate birthday;
    private Date createdDate;

    // static nesne boyunca bir kere oluşturulur
    static {
        System.out.println("studentDto yüklendi");
    }

    // parametresiz constructor
    public StudentDto() {


    }

    //Parametreli constructor
    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.birthday = birthday;
        this.resultTerm = calculateResult();
    }

    private Double calculateResult() {

        if (midTerm == null || finalTerm == null) {
            return 0.0;
        } else {
            return (midTerm * 0.4 + finalTerm * 0.6);
        }


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


    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm = calculateResult();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
    }

    public Double getResultTerm() {
        return resultTerm;
    }

    public void setResultTerm(Double resultTerm) {
        this.resultTerm = resultTerm;
    }
}
