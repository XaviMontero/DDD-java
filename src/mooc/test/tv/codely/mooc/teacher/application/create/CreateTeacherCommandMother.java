package tv.codely.mooc.teacher.application.create;


import tv.codely.mooc.teacher.application.create.CreateTeacherCommand;
import tv.codely.mooc.teacher.domain.*;

public class CreateTeacherCommandMother {
    public static CreateTeacherCommand create(TeacherId id, TeacherName name, TeacherDuration duration, TeacherYear year) {
        return new CreateTeacherCommand(id.value(), name.value(), duration.value(),year.value());
    }

    public static CreateTeacherCommand random() {
        return create(TeacherIdMother.random(), TeacherNameMother.random(), TeacherDurationMother.random(),TeacherYearsMother.random());
    }
}

