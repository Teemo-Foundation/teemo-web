package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "TIME_SUBJECT")
public class TimeSubjectModel {


    private Long id;

    @JoinColumn(name = "subject_id_pk")
    private Long subjectIdFk;

    @JoinColumn(name = "free_time_id_pk")
    private Long freeTimeFk;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.TIMESUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.TIMESUBJECT_SEQ", allocationSize = 1, name = "teemo.TIMESUBJECT_SEQ")
    @Column(name = "time_subject_id_pk")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectIdFk() {
        return subjectIdFk;
    }

    public void setSubjectIdFk(Long subjectIdFk) {
        this.subjectIdFk = subjectIdFk;
    }

    public Long getFreeTimeFk() {
        return freeTimeFk;
    }

    public void setFreeTimeFk(Long freeTimeFk) {
        this.freeTimeFk = freeTimeFk;
    }
}
