package tv.codely.mooc.teacher.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.teacher.TeacherModuleUnitTestCase;
import tv.codely.mooc.teacher.domain.*;


final  class TeacherCreatorTest extends TeacherModuleUnitTestCase {

    private TeacherCreator creator;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        creator = new TeacherCreator(repository);
    }
    @Test
    void save_a_valid_teacher() {
        CreateTeacherCommand create = CreateTeacherCommandMother.random();
        Teacher teacher = TeacherMother.fromRequest(create);
        creator.create(create);
        shouldHaveSaved(teacher);


    }

}
