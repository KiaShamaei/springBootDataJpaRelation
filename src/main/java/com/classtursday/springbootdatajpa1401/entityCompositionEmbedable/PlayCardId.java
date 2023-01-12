package com.classtursday.springbootdatajpa1401.entityCompositionEmbedable;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PlayCardId implements Serializable {
    private Long id;
    private String type;
}
