package br.com.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private static final String CUSTOMERS[] ={
        "Customer 1",
                "Customer 2",
                "Customer 3",
                "Customer 4"};

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(Arrays.asList(CUSTOMERS));
    }

   }
