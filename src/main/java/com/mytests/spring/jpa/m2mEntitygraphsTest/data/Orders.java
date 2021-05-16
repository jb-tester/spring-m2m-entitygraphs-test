package com.mytests.spring.jpa.m2mEntitygraphsTest.data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 **
 * <p>Created by irina on 16.05.2021.</p>
 * <p>Project: spring-m2m-entitygraphs-test</p>
 **
 */
@Entity
@Table(name="orders", schema = "shop")
public class Orders {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @OneToMany(mappedBy = "orders")
    private List<OrderItems> orderItems;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customers customers;

    @Basic
    @Column(name = "urgent")
    private Boolean urgent;
    
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }


    public List<OrderItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItems> orderItemsByOrderId) {
        this.orderItems = orderItemsByOrderId;
    }
   
    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customersByCustomerId) {
        this.customers = customersByCustomerId;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }
}
