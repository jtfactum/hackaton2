package com.example.HakatonSpring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_history;
    @ManyToOne
    @JoinColumn(name="user")
    private User user;
    private EGames eGames;
    private String money;
    private String time;

    public History(User user, EGames eGames, String money, String time) {
        this.user = user;
        this.eGames = eGames;
        this.money = money;
        this.time = time;
    }

    public History() {
    }

    public Integer getId_history() {
        return id_history;
    }

    public void setId_history(Integer id_history) {
        this.id_history = id_history;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EGames geteGames() {
        return eGames;
    }

    public void seteGames(EGames eGames) {
        this.eGames = eGames;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
