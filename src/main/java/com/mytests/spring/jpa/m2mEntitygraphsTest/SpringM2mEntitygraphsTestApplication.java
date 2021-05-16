package com.mytests.spring.jpa.m2mEntitygraphsTest;

import com.mytests.spring.jpa.m2mEntitygraphsTest.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringM2mEntitygraphsTestApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(SpringM2mEntitygraphsTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerService.displayVipUsers();
    }
}
