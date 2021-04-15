package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "USERS")
public class UserModel {
    private long id;
    private String email;
    private String password;
    private String name;
    private String institution;

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

    @Column(name = "user_institution")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}