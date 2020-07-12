package by.radziuk.devincubator.dao;

import by.radziuk.devincubator.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findAllTestByTopicId(int id);

    /*@Query("From Test ts Join ts.topic tp Where tp.id = 1")
    List<Test> findTestsByTopic(int id);*/
}
