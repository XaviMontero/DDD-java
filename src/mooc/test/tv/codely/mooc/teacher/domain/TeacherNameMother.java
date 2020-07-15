package tv.codely.mooc.teacher.domain;

import tv.codely.mooc.courses.domain.CourseName;
import tv.codely.shared.domain.WordMother;

public class TeacherNameMother {
    public static TeacherName create(String value) {
        return new TeacherName(value);
    }

    public static TeacherName random() {
        return create(WordMother.random());
    }
}

