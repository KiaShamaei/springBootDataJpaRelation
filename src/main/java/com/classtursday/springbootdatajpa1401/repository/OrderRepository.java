package com.classtursday.springbootdatajpa1401.repository;


import com.classtursday.springbootdatajpa1401.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderProduct,Long> {
}
