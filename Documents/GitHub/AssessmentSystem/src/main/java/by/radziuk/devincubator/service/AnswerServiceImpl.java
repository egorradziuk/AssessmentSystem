package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.AnswerRepository;
import by.radziuk.devincubator.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public Answer getCorrectByDescription(int id) {
        return answerRepository.getCorrectByDescription(id);
    }
}
