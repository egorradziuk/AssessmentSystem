package by.radziuk.devincubator.dao;

import by.radziuk.devincubator.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

    @Query("Select name From Test Where topic.name = ?1")
    List<String> findTestsByTopic(String name);

}
