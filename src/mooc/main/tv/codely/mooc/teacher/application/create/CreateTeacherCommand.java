package tv.codely.mooc.teacher.application.create;

public class CreateTeacherCommand {

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

    public CreateTeacherCommand(String id, String name, String duration, Integer year) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.year = year;
    }
}
