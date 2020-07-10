package by.radziuk.devincubator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @GetMapping(value = "/")
    public String user() {
        return "User/user";
    }

    @GetMapping(value = "/chooseTest")
    public String ChooseTest() {
        return "User/userChoose";
    }

    @GetMapping(value = "/personalStatistic")
    public String personalStatisticPage() {
        return "User/personalStatistic";
    }

}
