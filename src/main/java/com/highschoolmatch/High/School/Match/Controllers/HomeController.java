package com.highschoolmatch.High.School.Match.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping(value="")
    public String index(){

        return "home/index";
    }

}
