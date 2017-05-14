package com.assetmanager.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @NotEmpty
    @Column(name="name", nullable = false)
    private String name;

    @NotEmpty
    @Column(name="purchaseDate", nullable = false)
    private Date purchaseDate;

    @NotEmpty
    @Column(name="active", nullable = false)
    private Boolean active;


    public Device(Long id, String name, Date purchaseDate, Boolean active) {
        this.id = id;
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.active = active;
    }

    public Long getId() {
        return id;
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

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", active=" + active +
                '}';
    }
}
