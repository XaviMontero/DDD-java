package tv.codely.mooc.teacher.infrastructure;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.teacher.domain.Teacher;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryTeacherRepositoryTest {
    @Test
    void save_a_teacher() {
        InMemoryTeacherRepository inMemoryCourseRepository= new InMemoryTeacherRepository();
        Teacher teacher = new Teacher("IDAS","sdadsa","sdadsa",4);

        inMemoryCourseRepository.save(teacher);
    }

    @Test
    void return_an_existing_teacher() {
        InMemoryTeacherRepository inMemoryCourseRepository= new InMemoryTeacherRepository();
        Teacher teacher = new Teacher("IDAS","sdadsa","sdadsa",4);

        inMemoryCourseRepository.save(teacher);

        assertEquals(Optional.of(teacher), inMemoryCourseRepository.search(teacher.id()));
    }

    @Test
    void not_return_a_non_existing_teacher() {
        InMemoryTeacherRepository inMemoryCourseRepository= new InMemoryTeacherRepository();
        Teacher teacher = new Teacher("dsadsadsadwdsa","sdadsa","sdadsa",4);
        assertFalse(inMemoryCourseRepository.search("dsadsadsa").isPresent());
    }
}
