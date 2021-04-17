package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "user_subject")
public class UsersSubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.USERS_SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.USERS_SUBJECT__EQ", allocationSize = 1, name = "teemo.USERS_SUBJECT_SEQ")
    @Column(name = "user_id_pk")
    private Long id;

    @Column(name = "dificulty")
    private Long dificulty;

    @JoinColumn(name = "user_id_pk")
    private Long userIdFk;

    @JoinColumn(name = "subject_id_pk")
    private Long subjectIdFk;

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

    public Long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Long userIdFk) {
        this.userIdFk = userIdFk;
    }

    public Long getSubjectIdFk() {
        return subjectIdFk;
    }

    public void setSubjectIdFk(Long subjectIdFk) {
        this.subjectIdFk = subjectIdFk;
    }
}
