package com.msayrac._4_week.dao;

import java.io.Serializable;
import java.time.LocalDate;

enum ETeacherSubject {
    MATHEMATICS,
    CHEMISTRY,
    BIOLOGY,
    HISTORY,
    COMPUTER_SCIENCE
}

public record TeacherDto(
        Integer id,
        String name,
        String surname,
        LocalDate birthdate,
        ETeacherSubject subject,
        int yearsOfExperience,
        boolean isTenured,
        double salary

) implements Serializable {


}
