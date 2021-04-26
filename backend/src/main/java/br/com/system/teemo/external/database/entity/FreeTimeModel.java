package br.com.system.teemo.external.database.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "teemo", name = "FREE_TIME")
public class FreeTimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.FREE_TIME_SEQ")
    @SequenceGenerator(sequenceName = "teemo.FREE_TIME_SEQ", allocationSize = 1, name = "teemo.FREE_TIME_SEQ")
    @Column(name = "free_time_id_pk")
    private Long id;

    @Column(name = "day_of_week")
    private Long dayOfWeek;

    @Column(name = "free_time_hour")
    private Long freeTimeHour;

    @Column(name = "user_id_fk")
    private Long user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
