package by.radziuk.devincubator.dao;

import by.radziuk.devincubator.model.Answer;
import by.radziuk.devincubator.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("from Answer where question.id = ?1")
    List<Answer> getAnswersByQuestionId(int id);

}
