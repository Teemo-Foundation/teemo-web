package br.com.system.teemo.external.database.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(schema = "teemo", name = "user_subject")
public class UsersSubjectModel {

    @Column(name = "dificulty")
    private Long dificulty;

    @JoinColumn(name = "user_id_pk")
    private Long userIdFk;

    @JoinColumn(name = "subject_id_pk")
    private Long subjectIdFk;

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
