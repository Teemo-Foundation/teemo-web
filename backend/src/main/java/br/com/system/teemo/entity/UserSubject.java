package br.com.system.teemo.entity;

public class UserSubject {

    private Long dificulty;
    private Long userIdFk;
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
