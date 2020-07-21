package by.radziuk.devincubator.service;

import by.radziuk.devincubator.model.Statistic;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StatisticService {
    Map<String, Statistic> statList = new HashMap<>();
    List<Statistic> findAllStatistics();
    void saveMapOfStat(Map<String, Statistic> map, Date endTest);
}
