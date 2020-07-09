package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.QuestionRepository;
import by.radziuk.devincubator.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QeustionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAllQuestions() {
        return questionRepository.findAll();
    }

}
