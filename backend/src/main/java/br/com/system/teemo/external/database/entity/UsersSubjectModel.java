package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "user_subject")
public class UsersSubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.USERS_SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.USERS_SUBJECT_EQ", allocationSize = 1, name = "teemo.USERS_SUBJECT_SEQ")
    @Column(name = "user_id_pk")
    private Long id;

    @Column(name = "dificulty")
    private Long dificulty;

    @JoinColumn(name = "user_id_fk_user_subject")
    private UsersModel userIdFk;

    @JoinColumn(name = "SUBJECT_ID_FK_USER_SUBJECT")
    private SubjectModel subjectIdFk;

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
        return userIdFk;
    }

    public void setUserIdFk(UsersModel userIdFk) {
        this.userIdFk = userIdFk;
    }

    public SubjectModel getSubjectIdFk() {
        return subjectIdFk;
    }

    public void setSubjectIdFk(SubjectModel subjectIdFk) {
        this.subjectIdFk = subjectIdFk;
    }
}
