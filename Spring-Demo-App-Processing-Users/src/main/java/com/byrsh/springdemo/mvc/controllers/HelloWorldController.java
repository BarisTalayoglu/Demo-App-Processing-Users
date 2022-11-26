package com.byrsh.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Locale;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

  /*
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = theName + " Yo!";

        model.addAttribute("message",result);

        return "helloworld";
    }
*/

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDudeThree(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();

        String result = theName + "  yOOOOOooooo!";

        model.addAttribute("message",result);

        return "helloworld";
    }

}
