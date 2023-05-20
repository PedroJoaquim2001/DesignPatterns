package com.ApiDesignPatterns.DesignPatterns.models;


import com.ApiDesignPatterns.DesignPatterns.models.enums.CategoryStatus;
import com.ApiDesignPatterns.DesignPatterns.models.enums.ProductStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "TB_PRODUCT")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user_id;
    @Column(nullable = false, length = 50)
    private String product_name;
    @Column(nullable = false)
    private double price;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoryStatus category;
    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProductStatus status;

    public ProductModel(){
    }

    public ProductModel(UserModel user_id, String product_name, double price, CategoryStatus category, ProductStatus status) {
        this.user_id = user_id;
        this.product_name = product_name;
        this.price = price;
        this.category = category;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UserModel getUser_id() {
        return user_id;
    }

    public void setUser_id(UserModel user_id) {
        this.user_id = user_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryStatus getCategory() {
        return category;
    }

    public void setCategory(CategoryStatus category) {
        this.category = category;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}
