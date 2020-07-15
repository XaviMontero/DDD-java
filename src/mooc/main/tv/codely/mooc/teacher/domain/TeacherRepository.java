package tv.codely.mooc.teacher.domain;

 import java.util.Optional;

public interface TeacherRepository {

    void save(Teacher teacher);

    Optional<Teacher> search(TeacherId id);


}
