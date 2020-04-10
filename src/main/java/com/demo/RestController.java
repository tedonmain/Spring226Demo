package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private CustomerRepository repository;

}
