package com.classtursday.springbootdatajpa1401;

import com.classtursday.springbootdatajpa1401.entity.Category;
import com.classtursday.springbootdatajpa1401.entity.OrderProduct;
import com.classtursday.springbootdatajpa1401.entity.Product;
import com.classtursday.springbootdatajpa1401.entity.ProductDetails;
import com.classtursday.springbootdatajpa1401.repository.OrderRepository;
import com.classtursday.springbootdatajpa1401.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class SpringBootDataJpa1401ApplicationTests {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository ;

    @Test
    void contextLoads() {
    }

    @Test
    void testProductOneToOne(){
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductDescription("forFemale");
        Product product = new Product();
        product.setName("kolah");
        //relation add
        product.setProductDetails(productDetails);
        productDetails.setProduct(product);
        //save
        productRepository.save(product);
    }
    @Test
    void testProductManyToMany(){
        Category category = new Category("sport");
        Product product = new Product("kolah");
        product.setCategory(category);
        Product product1 = new Product("Kolah@");
        Set<Product> productSet = new HashSet<>();
        productSet.add(product);
        productSet.add(product1);

        //product details
        ProductDetails productDetails = new ProductDetails();
        productDetails.setProductDescription("this is for sale");
        productDetails.setProductId(1L);
        productDetails.setProduct(product);
        product.setProductDetails(productDetails);

        //order
        OrderProduct order = new OrderProduct("kia");
        OrderProduct order1 = new OrderProduct("hasan");
        Set<OrderProduct> orderSet = new HashSet<>();
        orderSet.add(order1);
        orderSet.add(order);
       // add many to many
        product.setOrderList(orderSet);
        productRepository.save(product);


        order.setProduct(productSet);
        orderRepository.save(order);


    }

}
