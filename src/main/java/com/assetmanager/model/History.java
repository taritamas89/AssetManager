package com.assetmanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class History implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "assigned_date")
    private Date assignedDate;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }
}
