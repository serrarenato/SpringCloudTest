package br.com.zuulservice.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List findAll() {
        String a[] = { "Product 1", "Product 2", "Product 3", "Product 4" };
        return Arrays.asList(a);
    }
}