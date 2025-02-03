package m2.drivingschool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InstructorController {
    @GetMapping("/instructor")
    public String adminPage() {
        return "instructor/instructor";
    }
}
