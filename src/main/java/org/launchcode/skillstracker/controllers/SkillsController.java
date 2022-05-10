package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("entries")
    @ResponseBody
    public String createSkillsTrackerMessage(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String rankOptions(){
        return "<html>" +
                "<body>" +
                "<form action='entries'>" +
                "<h1>Name</h1>" +
                "<input type='text' name='name'>" +
                "<h2>My Favorite Language</h2>" +
                "<select name='language1' id='language-select>" +
                "<option value='selectValue>Select Language</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='sql'>SQL</option>" +
                "</select>" +
                "<h2>My Second Favorite Language</h2>" +
                "<select name='language2' id='language-select>" +
                "<option value='selectValue>Select Language</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='sql'>SQL</option>" +
                "</select>" +
                "<h2>My Third Favorite Language</h2>" +
                "<select name='language3' id='language-select>" +
                "<option value='selectValue>Select Language</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='sql'>SQL</option>" +
                "</select>" +
                "<input type='submit' value='Submit!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
