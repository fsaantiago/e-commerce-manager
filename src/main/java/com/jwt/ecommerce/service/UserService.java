package com.jwt.ecommerce.service;

import com.jwt.ecommerce.model.User;
import com.jwt.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService { //Service class to handle the business logic and call the repository methods

    private final UserRepository userRepository;

    @Autowired
    private UserService userService;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
    }

    public void addUser() {
        userRepository.addUser();
    }

    public void addProducts() {
        userRepository.addProducts();
    }

    public void addOrders() {
        userRepository.addOrders();
    }

    public void getProducts() {
        userRepository.getProducts();
    }

    public void getOrders() {
        userRepository.getOrders();
    }

    public void getUser() {
        userRepository.getUser();
    }

    public void register(User user) {
        userRepository.addUser();
    }

    public void login(User user) {
        userRepository.getUser();
    }

    public void logout(User user) {
        userRepository.getUser();
    }
}
