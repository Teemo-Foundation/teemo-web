package br.com.system.teemo.external.database.entity;

import javax.persistence.*;

@Entity
@Table(schema = "teemo", name = "FREE_TIME")
public class FreeTimeModel {

    private Long id;
    private Long dayOfWeek;
    private Long freeTimeHour;

    @JoinColumn(name = "user_id_pk")
    private Long userIdFk;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teemo.FREETIME_SEQ")
    @SequenceGenerator(sequenceName = "teemo.FREETIME_SEQ", allocationSize = 1, name = "teemo.FREETIME_SEQ")
    @Column(name = "free_time_id_pk")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "day_of_week")
    public Long getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Long dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Column(name = "free_time_hour")
    public Long getFreeTimeHour() {
        return freeTimeHour;
    }

    public void setFreeTimeHour(Long freeTimeHour) {
        this.freeTimeHour = freeTimeHour;
    }

    public Long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(Long userIdFk) {
        this.userIdFk = userIdFk;
    }
}
