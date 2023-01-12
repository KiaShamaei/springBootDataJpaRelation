package com.classtursday.springbootdatajpa1401.entityCompositionEmbedable;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayCard {
    @EmbeddedId
    private PlayCardId playCardId;
    private String name ;
    private int point ;
}
