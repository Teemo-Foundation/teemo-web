package br.com.system.teemo.entity;

public class UserSubject {

    private Long id;
    private Long dificulty;
    private User userIdFk;
    private Subject subjectIdFk;

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

    public User getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(User userIdFk) {
        this.userIdFk = userIdFk;
    }

    public Subject getSubjectIdFk() {
        return subjectIdFk;
    }

    public void setSubjectIdFk(Subject subjectIdFk) {
        this.subjectIdFk = subjectIdFk;
    }
}
