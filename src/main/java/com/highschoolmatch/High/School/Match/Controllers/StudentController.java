package com.highschoolmatch.High.School.Match.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentController {

    @RequestMapping(value="")
    public String index(){

        return "students/index";
    }
}
