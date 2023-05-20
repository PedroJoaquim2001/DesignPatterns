package com.ApiDesignPatterns.DesignPatterns.services;


import com.ApiDesignPatterns.DesignPatterns.models.ProductModel;
import com.ApiDesignPatterns.DesignPatterns.repositories.ProductsRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProductsService {
    final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }


    @Transactional
    public ProductModel save(ProductModel productModel){
        return productsRepository.save(productModel);
    }

    public Page<ProductModel> findAll(Pageable pageable) {
        return productsRepository.findAll(pageable);
    }

    public Optional<ProductModel> findById(UUID id){
        return productsRepository.findById(id);
    }

    @Transactional
    public void delete(ProductModel productModel) {
        productsRepository.delete(productModel);
    }
}
