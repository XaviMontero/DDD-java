package tv.codely.apps.mooc.backend.controller.teacher;

import org.junit.jupiter.api.Test;
import tv.codely.apps.mooc.MoocApplicationTestCase;

class TeacherPutControllerTest  extends MoocApplicationTestCase {

    @Test
    void create_a_valid_non_existing_teacher() throws Exception {
        assertRequestWithBody(
            "PUT",
            "/courses/1aab45ba-3c7a-4344-8936-78466eca77fa",
            "{\"name\": \"The best course\", \"duration\": \"5 hours\",\"year\": 5}",
            201
        );
    }

}
