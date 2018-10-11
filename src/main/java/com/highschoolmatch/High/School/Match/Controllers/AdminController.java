package com.highschoolmatch.High.School.Match.Controllers;

import com.highschoolmatch.High.School.Match.Data.SchoolDao;
import com.highschoolmatch.High.School.Match.Data.StudentDao;
import com.highschoolmatch.High.School.Match.Models.School;
import com.highschoolmatch.High.School.Match.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    public SchoolDao schoolDao;

    @Autowired
    public StudentDao studentDao;

    @RequestMapping(value="")
    public String index(){

        return "admin/index";
    }

    @RequestMapping(value = "addSchool", method = RequestMethod.GET)
    public String addSchool(Model model){

        School school = new School();
        model.addAttribute("school", school);
        return "admin/addSchool";
    }

    @RequestMapping(value ="addSchool", method = RequestMethod.POST)
    public String processAddSchool(Model model, @ModelAttribute School school){
        schoolDao.save(school);
        return "redirect:/admin";
    }

    @RequestMapping(value= "addStudent", method = RequestMethod.GET)
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute(student);
        model.addAttribute("schools", schoolDao.findAll());
        return "admin/addStudent";
    }

    @RequestMapping(value = "addStudent", method = RequestMethod.POST )
    public String processAddStudent(Model model, @ModelAttribute Student student, int id){
        School school = schoolDao.findOne(id);
        student.setSchool(school);
        studentDao.save(student);
        school.calculateData();
        schoolDao.save(school);
        return "redirect/admin";
    }


}
