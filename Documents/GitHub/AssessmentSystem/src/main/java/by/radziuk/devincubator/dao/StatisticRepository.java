package by.radziuk.devincubator.dao;

import by.radziuk.devincubator.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.tools.JavaCompiler;
@Repository
public interface StatisticRepository extends JpaRepository<Statistic, Long> {
}
