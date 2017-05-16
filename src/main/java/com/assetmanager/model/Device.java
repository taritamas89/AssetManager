package com.assetmanager.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Device {
    @Id
    @GeneratedValue
    @Column(name = "device_id")
    private Integer id;

    @Column
    @NotEmpty
    private String name;

    @Column(name= "purchase_date")
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date purchaseDate;

    @Column
    @NotNull
    private Boolean active;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "history", joinColumns = @JoinColumn(name = "device_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private Set<History> histories = new HashSet<History>();


    public Device(String name, Date purchaseDate, Boolean active) {
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.active = active;
    }

    public Device() {
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }
}
