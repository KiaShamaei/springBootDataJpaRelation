package com.classtursday.springbootdatajpa1401.repository;


import com.classtursday.springbootdatajpa1401.entityCompositionEmbedable.PlayCard;
import com.classtursday.springbootdatajpa1401.entityCompositionEmbedable.PlayCardId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayCardCkRepository extends JpaRepository<PlayCard , PlayCardId> {
}
