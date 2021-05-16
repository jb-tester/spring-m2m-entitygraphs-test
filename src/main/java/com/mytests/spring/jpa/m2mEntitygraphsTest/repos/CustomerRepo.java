package com.mytests.spring.jpa.m2mEntitygraphsTest.repos;

import com.mytests.spring.jpa.m2mEntitygraphsTest.data.Customers;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 16.05.2021.</p>
 * <p>Project: spring-m2m-entitygraphs-test</p>
 * *
 */
public interface CustomerRepo extends JpaRepository<Customers, Integer> {
    @EntityGraph("Customers")
    List<Customers> findByVip(Boolean vip);
}
