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

    //todo manyToOne
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "literature_id")
    private Literature literature;

    @Override
    public String toString() {
        return "Link [id = " + id +
                ", link = " + link +
                "]";
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

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }
}
