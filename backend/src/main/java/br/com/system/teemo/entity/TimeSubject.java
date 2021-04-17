package br.com.system.teemo.entity;

public class TimeSubject {

    private Long id;
    private Long subjectIdFk;
    private Long freeTimeFk;

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
