package com.classtursday.springbootdatajpa1401.repository;

import com.classtursday.springbootdatajpa1401.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
