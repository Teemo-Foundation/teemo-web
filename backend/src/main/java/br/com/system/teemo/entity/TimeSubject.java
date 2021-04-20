package br.com.system.teemo.entity;

public class TimeSubject {

    private Long id;
    private Subject subject;
    private FreeTime freeTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public FreeTime getFreeTimeFk() {
        return freeTime;
    }

    public void setFreeTimeFk(FreeTime freeTimeFk) {
        this.freeTime = freeTimeFk;
    }
}
