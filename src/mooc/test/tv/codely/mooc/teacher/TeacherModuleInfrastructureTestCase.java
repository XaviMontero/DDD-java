package tv.codely.mooc.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import tv.codely.mooc.MoocContextInfrastructureTestCase;
import tv.codely.mooc.teacher.domain.TeacherRepository;
import tv.codely.mooc.teacher.infrastructure.InMemoryTeacherRepository;

public abstract class  TeacherModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    protected InMemoryTeacherRepository inMemoryCourseRepository = new InMemoryTeacherRepository();
    @Autowired
    protected TeacherRepository mySqlTeacherRepository;



}
