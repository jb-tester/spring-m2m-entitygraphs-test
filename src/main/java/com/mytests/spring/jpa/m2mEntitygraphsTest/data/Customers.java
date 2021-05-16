package com.mytests.spring.jpa.m2mEntitygraphsTest.data;

import javax.persistence.*;
import java.util.List;

/**
 **
 * <p>Created by irina on 16.05.2021.</p>
 * <p>Project: spring-m2m-entitygraphs-test</p>
 **
 */
@Entity
@Table(name = "customers", schema = "shop")
public class Customers {
    @Id
    @Column(name = "customer_id")
    private Integer customerId;
    
    @OneToMany(mappedBy = "customers")
    private List<Orders> orders;
    
    @Basic
    @Column(name = "customer_name")
    private String customerName;
    
    @Basic
    @Column(name = "address")
    private String address;
    
    @Basic
    @Column(name = "vip")
    private Byte vip;

    
    public Integer getCustomerId() {
        return customerId;
    }
    
    public List<Orders> getOrders() {
        return orders;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getVip() {
        return vip;
    }

    public void setVip(Byte vip) {
        this.vip = vip;
    }

    public void setOrders(List<Orders> ordersByCustomerId) {
        this.orders = ordersByCustomerId;
    }
}
