package tv.codely.mooc.teacher.infrastructure;

import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.mooc.teacher.domain.TeacherId;
import tv.codely.mooc.teacher.domain.TeacherRepository;
import tv.codely.shared.domain.Service;

import java.util.HashMap;
import java.util.Optional;
@Service
public final class InMemoryTeacherRepository implements TeacherRepository {
    private HashMap<String, Teacher> teachers = new HashMap<>();
    @Override
    public void save(Teacher teacher) {
        teachers.put(teacher.id().value(), teacher);
    }

    @Override
        public Optional<Teacher> search(TeacherId id) {
        return Optional.ofNullable(teachers.get(id.value()));
    }
}
