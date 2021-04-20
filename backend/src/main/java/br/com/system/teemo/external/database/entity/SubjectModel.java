package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "SUBJECT")
public class SubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.SUBJECT_SEQ", allocationSize = 1, name = "teemo.SUBJECT_SEQ")
    @Column(name = "subject_id_pk")
    private Long id;

    @Column(name = "subject_name")
    private String subject_name;

    @JoinColumn(name = "user_id_fk")
    private UsersModel user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public UsersModel getUser() {
        return user;
    }

    public void setUser(UsersModel user) {
        this.user = user;
    }
}
