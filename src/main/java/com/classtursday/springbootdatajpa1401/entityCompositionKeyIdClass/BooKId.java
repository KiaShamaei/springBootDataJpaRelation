package com.classtursday.springbootdatajpa1401.entityCompositionKeyIdClass;

import lombok.*;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BooKId implements Serializable {
    private Long id ;
    private  String publisherName;
}
