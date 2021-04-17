package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "SUBJECT")
public class SubjectModel {

    private Long id;
    private String name;

    @JoinColumn(name = "user_id_pk")
    private Long userIdFk;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "teemo.SUBJECT_SEQ", allocationSize = 1, name = "teemo.SUBJECT_SEQ")
    @Column(name = "subject_id_pk")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "subject_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Long userIdFk) {
        this.userIdFk = userIdFk;
    }
}
