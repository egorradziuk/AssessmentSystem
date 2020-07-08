package by.radziuk.devincubator.controller;

import by.radziuk.devincubator.service.QuestionService;
import by.radziuk.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    UserService userService;

    @Autowired
    QuestionService questionService;


    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
        model.addAttribute("users", userService.findAllUsers());
        model.addAttribute("questions", questionService.findAllQuestions());
        return "allusers";
    }

    /*@RequestMapping(value = {"/r"}, method = RequestMethod.GET)
    public String richestUser(ModelMap model) {
        model.addAttribute("richestUser", userService.findByRichestUser());
        return "allusers";
    }

    @RequestMapping(value = {"/s"}, method = RequestMethod.GET)
    public String sum(ModelMap model) {
        model.addAttribute("sum", accountService.sum());
        return "allusers";
    }*/

}
