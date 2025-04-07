package com.msayrac._4_week.dao;

import java.time.LocalDate;
import java.util.Date;

public class PersonDto {

    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private Date createdDate;

    public PersonDto() {
        this.id = id;
        this.name = "name unknow";
        this.surname = "surname unknow";
        this.birthDate = LocalDate.now();
        this.createdDate = new Date(System.currentTimeMillis());
    }

    public PersonDto(Integer id, String name, String surname, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }
}
