package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.TopicRepository;
import by.radziuk.devincubator.model.Test;
import by.radziuk.devincubator.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public List<String> findTestsByTopic(String name) {
        return topicRepository.findTestsByTopic(name);
    }

}
