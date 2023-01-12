package com.classtursday.springbootdatajpa1401;

import com.classtursday.springbootdatajpa1401.entityCompositionKeyIdClass.BooKId;
import com.classtursday.springbootdatajpa1401.entityCompositionKeyIdClass.BookWithCK;
import com.classtursday.springbootdatajpa1401.repository.BookWithCkRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EntityWithCompositionPrimaryKey {
    //this part for key composition with @IdClass
    @Autowired
    private BookWithCkRepository bookWithCkRepository;
    @Test
    public void addToBookCk(){
        BookWithCK book = new BookWithCK();
        book.setName("kafkaInSide");
        book.setPublisherName("jihon");
        book.setPrice(20000L);
        bookWithCkRepository.save(book);
    }
    @Test
    public void getBookCk(){
        BooKId booKId = new BooKId(1L,"jihon");
        var book = bookWithCkRepository.findById(booKId);
        if(book.isPresent()){
            System.out.println(book.get());
        }
    }




    //this part for key composition with @Embeddable and @EmbeddedId
}
