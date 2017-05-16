package com.assetmanager.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Integer id;

    @Column
    @NotEmpty
    private String name;

    @OneToMany(mappedBy = "user")
//    @ManyToMany(mappedBy = "user")
    private Set<History> histories = new HashSet<History>();;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }
}
