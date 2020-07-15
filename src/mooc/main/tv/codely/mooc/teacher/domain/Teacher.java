package tv.codely.mooc.teacher.domain;

import tv.codely.mooc.courses.domain.CourseDuration;
import tv.codely.mooc.courses.domain.CourseId;
import tv.codely.mooc.courses.domain.CourseName;

import java.util.Objects;

public class Teacher {
    private String id;
    private String name;
    private String duration;
    private Integer year;

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String duration() {
        return duration;
    }

    public Integer year() {
        return year;
    }

    public Teacher(String id, String name, String duration, Integer year) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) &&
            Objects.equals(duration, teacher.duration) &&
            Objects.equals(year, teacher.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, year);
    }
}

