package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.TestRepository;
import by.radziuk.devincubator.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }

    @Override
    public List<Test> findAllTestByTopicId(int id) {
        return testRepository.findAllTestByTopicId(id);
    }

    /*@Override
    public List<Test> findTestsByTopic(int id) {
        return testRepository.findTestsByTopic(id);
    }*/


}