package com.jwt.ecommerce.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

        public void addProduct() {
            System.out.println("Product added");
        }

        public void getProducts() {
            System.out.println("Products fetched");
        }

        public void getProduct() {
            System.out.println("Product fetched");
        }

        public void updateProduct() {
            System.out.println("Product updated");
        }

        public void deleteProduct() {
            System.out.println("Product deleted");
        }
}
