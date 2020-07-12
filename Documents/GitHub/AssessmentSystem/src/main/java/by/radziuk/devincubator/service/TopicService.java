package by.radziuk.devincubator.service;

import by.radziuk.devincubator.model.Test;
import by.radziuk.devincubator.model.Topic;

import java.util.List;

public interface TopicService {
    public List<Topic> findAll();
    List<String> findTestsByTopic(String name);
}
