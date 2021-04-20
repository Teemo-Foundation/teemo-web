package br.com.system.teemo.entity;

import java.util.List;

public class User {
    private Long id;
    private String email;
    private String password;
    private String name;
    private List<FreeTime> freeTimeList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FreeTime> getFreeTimeList() {
        return freeTimeList;
    }

    public void setFreeTimeList(List<FreeTime> freeTimeList) {
        this.freeTimeList = freeTimeList;
    }
}
