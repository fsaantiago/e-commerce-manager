package com.jwt.ecommerce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository { //Class used for storing user data and performing CRUD operations on it

        @Autowired
        private UserRepository userRepository;

        public void addUser() {
            System.out.println("User added");
        }

        public void addProducts() {
            System.out.println("Products added");
        }

        public void addOrders() {
            System.out.println("Orders added");
        }

        public void getProducts() {
            System.out.println("Products fetched");
        }

        public void getOrders() {
            System.out.println("Orders fetched");
        }

        public void getUser() {
            System.out.println("User fetched");
        }

        public void register() {
            System.out.println("User registered");
        }

        public void login() {
            System.out.println("User logged in");
        }
}
