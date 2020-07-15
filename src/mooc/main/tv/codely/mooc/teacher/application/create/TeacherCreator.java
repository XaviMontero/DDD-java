package tv.codely.mooc.teacher.application.create;

import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.mooc.teacher.domain.TeacherRepository;
import tv.codely.shared.domain.Service;

@Service
public final class TeacherCreator {
    private TeacherRepository repository ;

    public TeacherCreator(TeacherRepository repository) {
        this.repository = repository;
    }

    public void  create(String  id, String name, String duration, Integer year) {
        Teacher teacher = new Teacher(id,name,duration,year);
        repository.save(teacher);
    }


}
