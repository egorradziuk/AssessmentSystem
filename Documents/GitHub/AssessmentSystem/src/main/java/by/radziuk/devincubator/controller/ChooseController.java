package by.radziuk.devincubator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChooseController {

    @GetMapping(value = "/goTest")
    public String goTest() {
        return "User/testPage";
    }

}
