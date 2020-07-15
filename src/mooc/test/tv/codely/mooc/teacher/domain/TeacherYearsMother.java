package tv.codely.mooc.teacher.domain;

import tv.codely.shared.domain.IntegerMother;


public class TeacherYearsMother {
    public static TeacherYear create(Integer value) {
        return new TeacherYear(value);
    }

    public static TeacherYear random() {
        return create(IntegerMother.random());
    }
}
