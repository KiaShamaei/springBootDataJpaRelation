package com.classtursday.springbootdatajpa1401.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_details")
@Getter
@Setter
@RequiredArgsConstructor
public class ProductDetails {
    @Id
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "product_description")
    private String productDescription;

    @OneToOne
    @MapsId
    private Product product;

}
