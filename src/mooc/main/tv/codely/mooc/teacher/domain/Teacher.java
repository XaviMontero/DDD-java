package tv.codely.mooc.teacher.domain;


import tv.codely.shared.domain.AggregateRoot;

import java.util.Objects;

public class Teacher extends AggregateRoot {
    private final TeacherId id;
    private final TeacherName name;
    private final TeacherDuration duration;
    private final TeacherYear year;

    public Teacher(TeacherId id, TeacherName name, TeacherDuration duration, TeacherYear year) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.year = year;
    }

    private Teacher() {
        this.id = null;
        this.name = null;
        this.duration = null;
        this.year = null;
    }
    public TeacherId id() {
        return id;
    }

    public TeacherName name() {
        return name;
    }

    public TeacherDuration duration() {
        return duration;
    }

    public TeacherYear year() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) &&
            Objects.equals(name, teacher.name) &&
            Objects.equals(duration, teacher.duration) &&
            Objects.equals(year, teacher.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration, year);
    }
}

