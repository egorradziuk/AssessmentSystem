package by.radziuk.devincubator.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "topic")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Test> tests;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    /*public List<Test> getTest() {
        return tests;
    }

    public void setTest(List<Test> tests) {
        this.tests = tests;
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
