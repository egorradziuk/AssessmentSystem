package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.StatisticRepository;
import by.radziuk.devincubator.model.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticRepository statisticRepository;

    @Override
    public List<Statistic> findAllStatistics() {
        return statisticRepository.findAll();
    }

    public void saveMapOfStat(Map<String, Statistic> map, Date endTest) {
        for (Statistic statistic : map.values()) {
            statistic.setDate(endTest);
            statisticRepository.save(statistic);
        }
    }


}
