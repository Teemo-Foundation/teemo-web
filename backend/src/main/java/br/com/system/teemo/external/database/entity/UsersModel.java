package br.com.system.teemo.external.database.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "teemo", name = "USERS")
public class UsersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.USER_SEQ")
    @SequenceGenerator(sequenceName = "teemo.USER_SEQ", allocationSize = 1, name = "teemo.USER_SEQ")
    @Column(name = "user_id_pk")
    private Long id;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_name")
    private String name;

    @OneToMany(mappedBy = "user")
    private List<UsersSubjectModel> usersSubjectModels;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
