package br.com.system.teemo.external.database.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "teemo", name = "USERS")
public class UsersModel {
    private long id;
    private String email;
    private String password;
    private String name;

    private List<SubjectModel> subjectModelList;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.USERS_SEQ")
    @SequenceGenerator(sequenceName = "teemo.USERS_SEQ", allocationSize = 1, name = "teemo.USERS_SEQ")
    @Column(name = "user_id_pk")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "user_email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "user_password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "user_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "userIdFk")
    public List<SubjectModel> getSubjectModelList() {
        return subjectModelList;
    }

    public void setSubjectModelList(List<SubjectModel> subjectModelList) {
        this.subjectModelList = subjectModelList;
    }
}
