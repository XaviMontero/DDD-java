package tv.codely.mooc.teacher.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.teacher.domain.*;

import static org.mockito.Mockito.*;

final  class TeacherCreatorTest {
    @Test
    void save_a_valid_teacher() {
        TeacherRepository repository = mock(TeacherRepository.class);
        TeacherCreator creator = new TeacherCreator(repository);
        Teacher teacher = new Teacher(new TeacherId("1aab45ba-3c7a-4344-8936-78466eca77fa"),
            new TeacherName("dsadsa"),new TeacherDuration("dsads"), new TeacherYear(5));


        creator.create(new CreateTeacherCommand(teacher.id().value(),teacher.name().value(),teacher.duration().value(),teacher.year().value()));
        verify(repository, atLeastOnce()).save(teacher);


    }

}
