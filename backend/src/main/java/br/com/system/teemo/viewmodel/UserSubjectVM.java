package br.com.system.teemo.viewmodel;

public class UserSubjectVM {

    private Long id;
    private Long dificulty;
    private UserVM userIdFk;
    private SubjectVM subjectIdFk;

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

    public UserVM getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(UserVM userIdFk) {
        this.userIdFk = userIdFk;
    }

    public SubjectVM getSubjectIdFk() {
        return subjectIdFk;
    }

    public void setSubjectIdFk(SubjectVM subjectIdFk) {
        this.subjectIdFk = subjectIdFk;
    }
}
