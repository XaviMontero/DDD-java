package tv.codely.mooc.teacher.infrastructure;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.teacher.TeacherModuleInfrastructureTestCase;
import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.mooc.teacher.domain.TeacherIdMother;
import tv.codely.mooc.teacher.domain.TeacherMother;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@Transactional
 class MySqlTeacherRepositoryTest  extends TeacherModuleInfrastructureTestCase {
    @Test
    void save_a_teacher() {
        Teacher course = TeacherMother.random();

        mySqlTeacherRepository.save(course);
    }

    @Test
    void return_an_existing_teacher() {
        Teacher course = TeacherMother.random();

        mySqlTeacherRepository.save(course);

        assertEquals(Optional.of(course), mySqlTeacherRepository.search(course.id()));
    }

    @Test
    void not_return_a_non_existing_teacher() {
        assertFalse(mySqlTeacherRepository.search(TeacherIdMother.random()).isPresent());
    }
}
