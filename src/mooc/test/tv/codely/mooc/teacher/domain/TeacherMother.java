package tv.codely.mooc.teacher.domain;
import tv.codely.mooc.teacher.application.create.CreateTeacherCommand;

public class TeacherMother {

    public static Teacher create(TeacherId id, TeacherName name, TeacherDuration duration,TeacherYear year) {
        return new Teacher(id, name, duration,year);
    }

    public static Teacher fromRequest(CreateTeacherCommand request) {
        return create(
            TeacherIdMother.create(request.id()),
            TeacherNameMother.create(request.name()),
            TeacherDurationMother.create(request.duration()),
            TeacherYearsMother.create(request.year() )
        );
    }

    public static Teacher random() {
        return create(TeacherIdMother.random(), TeacherNameMother.random(), TeacherDurationMother.random(),TeacherYearsMother.random());
    }

}
