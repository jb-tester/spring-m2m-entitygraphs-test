package com.mytests.spring.jpa.m2mEntitygraphsTest.services;

import com.mytests.spring.jpa.m2mEntitygraphsTest.data.Customers;
import com.mytests.spring.jpa.m2mEntitygraphsTest.repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 **
 * <p>Created by irina on 16.05.2021.</p>
 * <p>Project: spring-m2m-entitygraphs-test</p>
 **
 */
@Component
public class CustomerService {


    @Autowired
    private CustomerRepo customerRepo;
    
    public void displayVipUsers(){
        List<Customers> customers = customerRepo.findByVip(true);
        for (Customers customer : customers) {
            System.out.println(customer);
        } 
    }
}
