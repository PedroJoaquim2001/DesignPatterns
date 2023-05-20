package com.ApiDesignPatterns.DesignPatterns.repositories;

import com.ApiDesignPatterns.DesignPatterns.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<ProductModel, UUID> {

}
