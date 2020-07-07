package by.radziuk.devincubator.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Role implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id", nullable = false)
    private User user;

    @Column(name = "role_name")
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role [roleName = " + roleName + "]";
    }
}
