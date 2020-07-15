package tv.codely.mooc.teacher.domain;


import tv.codely.shared.domain.IntegerMother;
import tv.codely.shared.domain.RandomElementPicker;


public class TeacherDurationMother {

    public static TeacherDuration create(String value) {
        return new TeacherDuration(value);
    }

    public static TeacherDuration random() {
        return create(
            String.format(
                "%s %s",
                IntegerMother.random(),
                RandomElementPicker.from("months", "years", "days", "hours", "minutes", "seconds")
            )
        );
    }
}
