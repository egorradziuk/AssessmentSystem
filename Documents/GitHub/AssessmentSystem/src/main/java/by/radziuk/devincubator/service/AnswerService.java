package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.AnswerRepository;
import by.radziuk.devincubator.model.Answer;

public interface AnswerService {
    Answer getCorrectByDescription(int id);
}
