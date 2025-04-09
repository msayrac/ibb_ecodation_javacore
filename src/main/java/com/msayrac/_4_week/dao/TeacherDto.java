package com.msayrac._4_week.dao;

import java.io.Serializable;

public record TeacherDto(
        PersonDto personDto,
        String subject,
        int yearsOfExperience,
        boolean isTenured,
        double salary


) implements Serializable {



}
