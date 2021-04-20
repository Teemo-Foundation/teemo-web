package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "user_subject")
public class UsersSubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.USER_SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.USER_SUBJECT_SEQ", allocationSize = 1, name = "teemo.USER_SUBJECT_SEQ")
    @Column(name = "user_subject_id_pk")
    private Long id;

    @Column(name = "dificulty")
    private Long dificulty;

    @JoinColumn(name = "user_id_fk")
    private UsersModel user;

    @JoinColumn(name = "subject_id_fk")
    private SubjectModel subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDificulty() {
        return dificulty;
    }

    public void setDificulty(Long dificulty) {
        this.dificulty = dificulty;
    }

    public UsersModel getUserIdFk() {
        return user;
    }

    public void setUserIdFk(UsersModel userIdFk) {
        this.user = userIdFk;
    }

    public SubjectModel getSubjectIdFk() {
        return subject;
    }

    public void setSubjectIdFk(SubjectModel subjectIdFk) {
        this.subject = subjectIdFk;
    }
}
