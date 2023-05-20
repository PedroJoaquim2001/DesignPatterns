package com.ApiDesignPatterns.DesignPatterns.dtos;


import com.ApiDesignPatterns.DesignPatterns.models.ProductModel;
import com.ApiDesignPatterns.DesignPatterns.models.UserModel;
import com.ApiDesignPatterns.DesignPatterns.models.enums.CategoryStatus;
import com.ApiDesignPatterns.DesignPatterns.models.enums.ProductStatus;
import com.ApiDesignPatterns.DesignPatterns.services.UserDetailsServiceImpl;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ProductDto {
    @NotNull
    private UUID user_id;
    @NotNull
    private String product_name;
    @NotNull
    private double price;
    @NotNull
    private CategoryStatus category;
    @NotNull
    private ProductStatus status;

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
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

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public ProductModel convert(UserDetailsServiceImpl userDetailsService){
        UserModel userModel = userDetailsService.findById(user_id).get();
        return new ProductModel(userModel, product_name, price, category, status);
    }
}
