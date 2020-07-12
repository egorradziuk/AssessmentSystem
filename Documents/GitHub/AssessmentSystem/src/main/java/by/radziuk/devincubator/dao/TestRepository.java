package by.radziuk.devincubator.dao;

import by.radziuk.devincubator.model.Question;
import by.radziuk.devincubator.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findAllTestByTopicId(int id);

//    @Query("From Test ts Join ts.topic tp Where tp.id = 1")
    List<Question> getTestsByTopicName(String topic);
    @Query("select questions from Test where name = ?1")
    List<Question> getQuestionsByTestName(String name);

}
