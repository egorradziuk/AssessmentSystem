package by.radziuk.devincubator.controller;

import by.radziuk.devincubator.model.Question;
import by.radziuk.devincubator.service.QuestionService;
import by.radziuk.devincubator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class TestPageController {

    private static int counter;
    private static int max;
    private static List<Question> questionList;

    @Autowired
    private TestService testService;

    @Autowired
    private QuestionService questionService;

    @GetMapping(value = "/goTest")
    public String goTest(@RequestParam String testName, ModelMap modelMap) {
        questionList = testService.getQuestionsByTestName(testName);
        /*staticService.statList = new LinkedHashMap<>();*/
        max = questionList.size();
        if (questionList != null) {
            modelMap.addAttribute("questions", questionList.get(counter)
                    .getDescription());
            modelMap.addAttribute("answers", questionService.getAnswersByQuestionId
                    (questionList.get(counter).getId()));
            counter++;
        }
        return "User/testPage";
    }

    @GetMapping(value = "/nextTestPage")
    public String nextTestPage1(
            @RequestParam(value = "choosenAns") String choosenAnswer,
            ModelMap modelMap) {
        if (counter < max) {
//            staticService.statList.put(questionList.get(counter-1)
//                    .getDescription(), configure.)
            modelMap.addAttribute("questions", questionList.get(counter)
                    .getDescription());
            modelMap.addAttribute("answers", questionService.getAnswersByQuestionId
                    (questionList.get(counter).getId()));
            counter++;
            return "User/testPage";
        } else {
            counter = 0;
            return "User/resultPage";
        }
    }

}
