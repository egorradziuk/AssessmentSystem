package by.radziuk.devincubator.service;

import by.radziuk.devincubator.model.Question;
import by.radziuk.devincubator.model.Statistic;
import by.radziuk.devincubator.model.User;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StatisticService {
    Map<String, Statistic> statList = new HashMap<>();
    List<Statistic> findAllStatistics();
    void saveMapOfStat(Map<String, Statistic> map, Timestamp endTest);
    void changeCorrectValue(Timestamp date, User user, Question question, boolean
            correct);
    List<Statistic> findAllByDate(Timestamp date);
    List<Statistic> getAllByDate(Timestamp date);
}
