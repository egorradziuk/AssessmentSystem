package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.StatisticRepository;
import by.radziuk.devincubator.model.Question;
import by.radziuk.devincubator.model.Statistic;
import by.radziuk.devincubator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
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

    public void saveMapOfStat(Map<String, Statistic> map, Timestamp endTest) {
        for (Statistic statistic : map.values()) {
            statistic.setDate(endTest);
            statisticRepository.save(statistic);
        }
    }

    @Override
    public void changeCorrectValue(Timestamp date, User user, Question question,
                                   boolean correct) {
        statisticRepository.changeCorrectValue(date, user, question, correct);
    }

    @Override
    public List<Statistic> findAllByDate(Timestamp date) {
        return statisticRepository.findAllByDate(date);
    }

    @Override
    public List<Statistic> getAllByDate(Timestamp date) {
        return statisticRepository.getAllByDate(date);
    }


}
