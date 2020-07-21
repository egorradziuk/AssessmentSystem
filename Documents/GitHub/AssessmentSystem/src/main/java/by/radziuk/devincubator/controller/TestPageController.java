package by.radziuk.devincubator.controller;

import by.radziuk.devincubator.model.Answer;
import by.radziuk.devincubator.model.Question;
import by.radziuk.devincubator.model.Statistic;
import by.radziuk.devincubator.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class TestPageController {

    private static int counter;
    private static int max;
    private static List<Question> questionList;

    @Autowired
    private UserService userService;

    @Autowired
    private TestService testService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @Autowired
    private StatisticService statisticService;

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
            @RequestParam(value = "choosenAns") int id,
            ModelMap modelMap) {
        if (counter < max) {
            statisticService.statList.put(questionList.get(counter - 1)
                    .getDescription(), configureStatistic(id));
            modelMap.addAttribute("questions", questionList.get(counter)
                    .getDescription());
            modelMap.addAttribute("answers", questionService.getAnswersByQuestionId
                    (questionList.get(counter).getId()));
            counter++;
            return "User/testPage";
        } else {
            counter = 0;
            return resultPageFill(id, modelMap);
        }
    }

    private Statistic configureStatistic(int id) {
        Statistic statistic = new Statistic();
        Answer answer = answerService.getCorrectByDescription(id);
        statistic.setCorrect(answer.getCorrect());
        statistic.setQuestion(questionList.get(counter-1));
        statistic.setUser(userService.findUserById(2));
        statistic.setDate(Calendar.getInstance().getTime());
        return statistic;
    }

    @GetMapping("/resultPage")
    public String resultPageFill(int chooseAnswer, ModelMap modelMap) {
        statisticService.saveMapOfStat(StatisticService.statList, Calendar.getInstance().getTime());
        return "User/resultPage";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        statisticService.saveMapOfStat(StatisticService.statList, Calendar.getInstance().getTime());
        return "User/user";
    }

}
