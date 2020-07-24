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
        StatisticService.statList.clear();
        questionList = testService.getQuestionsByTestName(testName);
        /*staticService.statList = new LinkedHashMap<>();*/
        max = questionList.size();
        if (questionList != null) {
            modelMap.addAttribute("questions", questionList.get(counter)
                    .getDescription());
            modelMap.addAttribute("answers", questionService.getAnswersByQuestionId
                    (questionList.get(counter).getId()));
        }
        return "User/testPage";
    }

    @GetMapping(value = "/nextTestPage")
    public String nextTestPage1(
            @RequestParam(value = "choosenAns", defaultValue = "-1") int id,
            ModelMap modelMap) {
        statisticService.statList
                .put(String.valueOf(questionList.get(counter)
                .getId()), configureStatistic(id));
        System.out.println("counter -> "+counter);
        counter++;
        if (counter < max) {
            modelMap.addAttribute("questions", questionList.get(counter)
                    .getDescription());
            modelMap.addAttribute("answers", questionService.getAnswersByQuestionId
                    (questionList.get(counter).getId()));

            System.out.println(counter);
            System.out.println(statisticService.statList.get(String.valueOf(questionList.get(counter)
                    .getId())));
            return "User/testPage";
        } else {
            return resultPageFill(id, modelMap);
        }
    }

    private Statistic configureStatistic(int id) {
        Statistic statistic = new Statistic();
        if (id != -1) {
            Answer answer = answerService.getCorrectByDescription(id);
            statistic.setCorrect(answer.getCorrect());
        } else {
            statistic.setCorrect(false);
        }
        statistic.setQuestion(questionList.get(counter));
        statistic.setUser(userService.findUserById(2));
        statistic.setDate(Calendar.getInstance().getTime());
        return statistic;
    }

    @GetMapping("/resultPage")
    public String resultPageFill(int chooseAnswer, ModelMap modelMap) {
        counter = 0;
        statisticService.saveMapOfStat(StatisticService.statList, Calendar.getInstance().getTime());
        modelMap.addAttribute("statistic", statisticService.statList.values());
        return "User/resultPage";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        addSomePart();
        statisticService.saveMapOfStat(StatisticService.statList, Calendar.getInstance().getTime());
        counter = 0;
        return "User/user";
    }

    void addSomePart() {
        int id = -1;
        while (StatisticService.statList.size() != max) {
            statisticService.statList
                    .put(String.valueOf(questionList.get(counter)
                            .getId()), configureStatistic(id));
            counter++;
        }
    }

}
