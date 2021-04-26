package br.com.system.teemo.entity;

public class FreeTime {
    private Long Id;
    private Long dayOfWeek;
    private Long freeTimeHour;
    private Long user;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Long dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Long getFreeTimeHour() {
        return freeTimeHour;
    }

    public void setFreeTimeHour(Long freeTimeHour) {
        this.freeTimeHour = freeTimeHour;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }
}
