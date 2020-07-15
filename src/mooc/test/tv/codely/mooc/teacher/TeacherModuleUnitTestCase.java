package tv.codely.mooc.teacher;

import org.junit.jupiter.api.BeforeEach;


import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.mooc.teacher.domain.TeacherRepository;
import tv.codely.shared.infrastructure.UnitTestCase;

import static org.mockito.Mockito.*;

public abstract  class TeacherModuleUnitTestCase extends UnitTestCase {
    protected TeacherRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        repository = mock(TeacherRepository.class);
    }

    public void shouldHaveSaved(Teacher teacher) {
        verify(repository, atLeastOnce()).save(teacher);
    }
}
