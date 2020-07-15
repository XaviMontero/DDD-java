package tv.codely.apps.mooc.backend.controller.teacher;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.teacher.application.create.TeacherCreator;
import tv.codely.mooc.teacher.domain.Teacher;
import tv.codely.shared.domain.DomainError;
import tv.codely.shared.domain.bus.command.CommandBus;
import tv.codely.shared.domain.bus.command.CommandHandlerExecutionError;
import tv.codely.shared.domain.bus.query.QueryBus;
import tv.codely.shared.infrastructure.spring.ApiController;

import java.util.HashMap;

@RestController
public class TeacherPutController extends ApiController {
   TeacherCreator creator ;

    public TeacherPutController(QueryBus queryBus, CommandBus commandBus, TeacherCreator creator) {
        super(queryBus, commandBus);
        this.creator = creator;
    }

    @PutMapping(value = "/teachers/{id}")
    public ResponseEntity<String> index(
        @PathVariable String id,
        @RequestBody Request request
    ) throws CommandHandlerExecutionError {

            creator.create(id,request.name(),request.duration(),request.year());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() {
        return null;
    }
}

final class Request {
    private String name;
    private String duration;
    private Integer year;

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    String name() {
        return name;
    }

    String duration() {
        return duration;
    }
    Integer year() {
        return year;
    }
}
