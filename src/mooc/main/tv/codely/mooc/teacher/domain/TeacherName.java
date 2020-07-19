package tv.codely.mooc.teacher.domain;

import tv.codely.shared.domain.StringValueObject;

public class TeacherName extends StringValueObject {
    public TeacherName(String value) {
        super(value);
    }

    public TeacherName() {
        super("");
    }
}
