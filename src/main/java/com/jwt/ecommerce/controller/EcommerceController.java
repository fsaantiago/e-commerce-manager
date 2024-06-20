package com.jwt.ecommerce.controller;

import com.jwt.ecommerce.service.EcommerceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


public class EcommerceController { //Class used for the controller of the application

    private EcommerceService ecommerceService;

    public EcommerceController(EcommerceService ecommerceService) {
        this.ecommerceService = ecommerceService;
    }

    // POST /admin/users
    @PostMapping ("/admin/users")
    public void addUser() {
        ecommerceService.addUser();
    }

    // POST /admin/login
    @PostMapping("/admin/login")
    public void getUser() {
        ecommerceService.getUser();
    }

    // POST /manager/products
    @PostMapping ("POST /manager/products")
    public void addProducts() {
        ecommerceService.addProducts();
    }

    //POST /seller/orders
    @PostMapping ("/seller/orders")
    public void addOrders() {
        ecommerceService.addOrders();
    }

    // GET customer/products
    @GetMapping("/customer/products")
    public void getProducts() {
        ecommerceService.getProducts();
    }

    // GET /customer/orders
    @GetMapping("/customer/orders")
    public void getOrders() {
        ecommerceService.getOrders();
    }
}
