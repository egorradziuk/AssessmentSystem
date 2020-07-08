package by.radziuk.devincubator.model;

import javax.persistence.*;

@Entity
@Table
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "link")
    private String link;

    @Column(name = "literature_id")
    private int literature_id;

    @Override
    public String toString() {
        return "Link ";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLiterature_id() {
        return literature_id;
    }

    public void setLiterature_id(int literature_id) {
        this.literature_id = literature_id;
    }
}
