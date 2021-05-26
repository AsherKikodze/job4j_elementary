package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String group;
    private Date dateEnter;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateEnter() {
        return dateEnter;
    }

    public void setDateEnter(Date dateEnter) {
        this.dateEnter = dateEnter;
    }
}
