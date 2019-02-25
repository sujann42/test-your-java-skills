package com.suj.skillsjava.controller;

import com.suj.skillsjava.enums.UserType;
import com.suj.skillsjava.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/home")
public class MainController {

    @Autowired
    private HomeService service;

    @GetMapping("/")
    public String getHomePage(ModelMap modelMap) {

        String title = service.getWelcomeMessage();
        String datetime = "@Record Solutions 2019. Last Updated At: " + service.getUpdatedDate();
        modelMap.addAttribute("ttl", title);
        modelMap.addAttribute("updtdate", datetime);

        return "home";
    }

    @GetMapping("/start/user/{usertype}")
    public String goToRespectivePages(@PathVariable int usertype) { /*Do I really need Model Map here?*/
        if (usertype == UserType.TEACHER.ordinal()) {
            System.out.println("Value of UserType PathVariable is: "+usertype);
            return "teacher";
        } else {
            return "student";
        }

    }


}
