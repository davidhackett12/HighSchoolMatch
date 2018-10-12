package com.highschoolmatch.High.School.Match.Controllers;

import com.highschoolmatch.High.School.Match.Data.SchoolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    SchoolDao schoolDao;

    @RequestMapping(value="")
    public String index(){

        return "students/index";
    }

    @RequestMapping(value = "compare", method = RequestMethod.GET)
    public String compare(Model model){
        model.addAttribute("schools", schoolDao.findAll());
        return "students/compare";
    }
}
