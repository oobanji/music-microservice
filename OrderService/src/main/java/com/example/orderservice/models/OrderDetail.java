package com.example.orderservice.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private int orderDetailId;
    private int orderId;
    private int itemKey;
    private int quantity;
    private float unitPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    private OrderObject order;
}
