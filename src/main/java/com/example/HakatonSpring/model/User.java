package com.example.HakatonSpring.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.stat.Statistics;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer id_user;
    private String nameUser;
    private String email;
    private String dataOfBith;
    private String avatar;
    private String text;
    private Integer balance;

//    @OneToMany
//    private List<History> history;
//
//    @OneToMany
//    private List<Statistics> statistics;

    public User() {
    }

    public User(Integer id_user, String nameUser, String email, String dataOfBith, String avatar, String text, Integer balance) {
        this.id_user = id_user;
        this.nameUser = nameUser;
        this.email = email;
        this.dataOfBith = dataOfBith;
        this.avatar = avatar;
        this.text = text;
        this.balance = balance;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataOfBith() {
        return dataOfBith;
    }

    public void setDataOfBith(String dataOfBith) {
        this.dataOfBith = dataOfBith;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
