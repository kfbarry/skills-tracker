package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String printOption(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker<h1>" +
                "<h2>Programming Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>SQL</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String rankOptions(){
        return "<html>" +
                "<body>" +
                "<form action='entries'>" +
                "<ol>" +
                "<li>Name</li>" +
                "<li><input type='text' name='name'></li>" +
                "<li>My Favorite Language</li>" +
                "<li><input " +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
