package com.mytests.spring.jpa.m2mEntitygraphsTest.data;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 16.05.2021.</p>
 * <p>Project: spring-m2m-entitygraphs-test</p>
 * *
 */
@Entity
@Table(name = "order_items", schema = "shop")
//@IdClass(OrderItemsPK.class)
public class OrderItems {
    @EmbeddedId
    OrderItemsPK id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Orders orders;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    private Items items;

    @Basic
    @Column(name = "amount")
    private Integer amount;

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders ordersByOrderId) {
        this.orders = ordersByOrderId;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items itemsByItemId) {
        this.items = itemsByItemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
