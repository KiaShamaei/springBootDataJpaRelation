package com.classtursday.springbootdatajpa1401.repository;

import com.classtursday.springbootdatajpa1401.entityCompositionKeyIdClass.BooKId;
import com.classtursday.springbootdatajpa1401.entityCompositionKeyIdClass.BookWithCK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookWithCkRepository extends JpaRepository<BookWithCK , BooKId> {

}
