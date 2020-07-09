package by.radziuk.devincubator.service;

import by.radziuk.devincubator.dao.StatisticRepository;
import by.radziuk.devincubator.model.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private StatisticRepository statisticRepository;

    @Override
    public List<Statistic> findAllStatistics() {
        return statisticRepository.findAll();
    }
}
