package tv.codely.mooc.teacher.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.mooc.teacher.domain.TeacherRepository;

import static org.mockito.Mockito.*;

final  class TeacherCreatorTest {
    @Test
    void save_a_valid_teacher() {
        TeacherRepository repository = mock(TeacherRepository.class);
        TeacherCreator creator = new TeacherCreator(repository);
        Teacher teacher = new Teacher("sdadsa", "dsadsa","dsads", 5);
        creator.create(teacher.id(),teacher.name(),teacher.duration(),teacher.year());
        verify(repository, atLeastOnce()).save(teacher);


    }

}
