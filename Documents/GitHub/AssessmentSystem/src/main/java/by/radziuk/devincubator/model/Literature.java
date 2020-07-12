package by.radziuk.devincubator.model;

import javax.persistence.*;

@Entity
@Table
public class Literature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "question_id")
    private int questionId;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id", insertable=false, updatable=false)
    private Question question;

    //todo oneToMany
    @OneToOne(mappedBy = "literature", fetch = FetchType.EAGER)
    private Link link;

    @Override
    public String toString() {
        return "Literature [id = " + id +
                ", description = " + description +
                ", link = " + link +
                "]";
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

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
