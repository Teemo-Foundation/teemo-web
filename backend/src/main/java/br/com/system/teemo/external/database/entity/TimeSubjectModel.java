package br.com.system.teemo.external.database.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "teemo", name = "TIME_SUBJECT")
public class TimeSubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.TIME_SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.TIME_SUBJECT_SEQ", allocationSize = 1, name = "teemo.TIME_SUBJECT_SEQ")
    @Column(name = "time_subject_id_pk")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id_fk")
    private SubjectModel subject;

    @OneToOne
    @JoinColumn(name = "free_time_id_fk")
    private FreeTimeModel freeTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubjectModel getSubject() {
        return subject;
    }

    public void setSubject(SubjectModel subject) {
        this.subject = subject;
    }

    public FreeTimeModel getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(FreeTimeModel freeTime) {
        this.freeTime = freeTime;
    }
}
