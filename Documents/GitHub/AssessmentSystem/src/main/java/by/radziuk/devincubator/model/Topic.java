package by.radziuk.devincubator.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /*@OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
    List<Test> test;*/

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    /*public List<Test> getTest() {
        return test;
    }

    public void setTest(List<Test> test) {
        this.test = test;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic ";
    }
}
