package by.radziuk.devincubator.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "test_id")
    private Test test;

    @OneToMany(mappedBy = "question")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Answer> answer;

    @OneToMany(mappedBy = "question")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Statistic> statistics;

    @OneToOne(mappedBy = "question", fetch = FetchType.EAGER)
    private Literature literature;

    @Override
    public String toString() {
        return "Question [id = " + id +
                ", description = " + description +
                ", test = " + test +
                ", answer = " + answer +
                ", statistic = " + statistics +
                ", literature = " + literature +
                "]";
    }

    public List<Statistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Statistic> statistics) {
        this.statistics = statistics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }
}
