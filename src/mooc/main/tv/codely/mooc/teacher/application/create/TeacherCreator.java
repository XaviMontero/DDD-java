package tv.codely.mooc.teacher.application.create;

import tv.codely.mooc.teacher.domain.*;
import tv.codely.shared.domain.Service;

@Service
public final class TeacherCreator {
    private TeacherRepository repository ;

    public TeacherCreator(TeacherRepository repository) {
        this.repository = repository;
    }

    public void  create(CreateTeacherCommand teacherCommand) {
        Teacher teacher = new Teacher(new TeacherId(teacherCommand.id()),new TeacherName(teacherCommand.name()),new TeacherDuration(teacherCommand.duration()),new TeacherYear(teacherCommand.year()));
        repository.save(teacher);
    }


}
