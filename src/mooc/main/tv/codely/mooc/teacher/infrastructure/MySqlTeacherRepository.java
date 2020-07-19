package tv.codely.mooc.teacher.infrastructure;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.mooc.teacher.domain.TeacherId;
import tv.codely.mooc.teacher.domain.TeacherRepository;
import tv.codely.shared.domain.Service;

import tv.codely.shared.infrastructure.hibernate.HibernateRepository;

import java.util.Optional;

@Service
@Transactional("mooc-transaction_manager")
public class MySqlTeacherRepository extends HibernateRepository<Teacher> implements TeacherRepository {


    public MySqlTeacherRepository(@Qualifier("mooc-session_factory") SessionFactory sessionFactory) {
        super(sessionFactory, Teacher.class);
    }

    @Override
    public void save(Teacher teacher) {
        persist(teacher);
    }

    @Override
    public Optional<Teacher> search(TeacherId id) {
        return byId(id);
    }
}
