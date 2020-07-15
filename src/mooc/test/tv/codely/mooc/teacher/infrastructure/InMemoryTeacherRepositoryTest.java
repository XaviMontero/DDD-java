package tv.codely.mooc.teacher.infrastructure;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.teacher.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryTeacherRepositoryTest {
    @Test
    void save_a_teacher() {
        InMemoryTeacherRepository inMemoryCourseRepository= new InMemoryTeacherRepository();
        Teacher teacher = new Teacher(new TeacherId("1aab45ba-3c7a-4344-8936-78466eca77fa"),
            new TeacherName("dsadsa"),new TeacherDuration("dsads"), new TeacherYear(5));
        inMemoryCourseRepository.save(teacher);
    }

    @Test
    void return_an_existing_teacher() {
        InMemoryTeacherRepository inMemoryCourseRepository= new InMemoryTeacherRepository();
        Teacher teacher = new Teacher(new TeacherId("1aab45ba-3c7a-4344-8936-78466eca77fa"),
            new TeacherName("dsadsa"),new TeacherDuration("dsads"), new TeacherYear(5));
        inMemoryCourseRepository.save(teacher);

        assertEquals(Optional.of(teacher), inMemoryCourseRepository.search(teacher.id()));
    }

    @Test
    void not_return_a_non_existing_teacher() {
        InMemoryTeacherRepository inMemoryCourseRepository= new InMemoryTeacherRepository();

        assertFalse(inMemoryCourseRepository.search(new TeacherId("1aab45ba-3d7a-4344-8936-78466eca77fa")).isPresent());
    }
}
