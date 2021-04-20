package br.com.system.teemo.external.database.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "teemo", name = "SUBJECT")
public class SubjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.SUBJECT_SEQ", allocationSize = 1, name = "teemo.SUBJECT_SEQ")
    @Column(name = "subject_id_pk")
    private Long id;

    @Column(name = "subject_name")
    private String name;
    
    @Column(name = "user_id_fk")
    private Long user;

    @OneToMany(mappedBy = "subject")
    private List<TimeSubjectModel> timeSubjectModelList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject_name() {
        return name;
    }

    public void setSubject_name(String subject_name) {
        this.name = subject_name;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }
}
