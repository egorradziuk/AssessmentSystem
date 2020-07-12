package by.radziuk.devincubator.service;

import by.radziuk.devincubator.model.Question;
import by.radziuk.devincubator.model.Test;

import java.util.List;

public interface TestService {
    List<Test> findAll();
    List<Test> findAllTestByTopicId(int id);
    List<Question> getQuestionsByTestName(String topic);
}
