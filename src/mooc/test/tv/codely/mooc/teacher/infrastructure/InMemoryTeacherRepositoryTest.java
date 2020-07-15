package tv.codely.mooc.teacher.infrastructure;

import org.junit.jupiter.api.Test;

import tv.codely.mooc.teacher.TeacherModuleInfrastructureTestCase;
import tv.codely.mooc.teacher.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryTeacherRepositoryTest   extends TeacherModuleInfrastructureTestCase {

    @Test
    void save_a_teacher() {
        Teacher teacher = TeacherMother.random();
        inMemoryCourseRepository.save(teacher);
    }

    @Test
    void return_an_existing_teacher() {
        Teacher teacher =TeacherMother.random();
        inMemoryCourseRepository.save(teacher);
        assertEquals(Optional.of(teacher), inMemoryCourseRepository.search(teacher.id()));
    }

    @Test
    void not_return_a_non_existing_teacher() {
        assertFalse(inMemoryCourseRepository.search(TeacherIdMother.random()).isPresent());
    }
}
