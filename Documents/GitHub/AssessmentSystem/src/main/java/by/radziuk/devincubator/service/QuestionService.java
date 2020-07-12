package by.radziuk.devincubator.service;

import by.radziuk.devincubator.model.Answer;
import by.radziuk.devincubator.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> findAllQuestions();
    List<Answer> getAnswersByQuestionId(int id);

}
