package com.example.orderservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import java.util.Date;

@Entity
public class Order {
    @Id
    private Long orderId;
    private Date orderDate;
    private String userName;
    private String firstName;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
