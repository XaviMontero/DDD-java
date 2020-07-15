package tv.codely.mooc.teacher.domain;
import tv.codely.shared.domain.UuidMother;

public class TeacherIdMother {

    public static TeacherId create(String value) {
        return new TeacherId(value);
    }

    public static TeacherId random() {
        return create(UuidMother.random());
    }
}
