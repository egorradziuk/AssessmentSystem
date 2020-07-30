package by.radziuk.devincubator.dao;

import by.radziuk.devincubator.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    @Query("from Answer where id = ?1")
    Answer getCorrectByDescription(int id);
}
