package com.kelaniya.uni.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String getStudent() {
        return "Pasan, 17, Horana";
    }

}
