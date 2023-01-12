package com.classtursday.springbootdatajpa1401.entityCompositionKeyIdClass;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(BooKId.class)
public class BookWithCK {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Id
    private  String publisherName;
    private String name ;
    private Long price;
}
