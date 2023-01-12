package com.classtursday.springbootdatajpa1401;

import com.classtursday.springbootdatajpa1401.entity.ImageTestBlob;
import com.classtursday.springbootdatajpa1401.repository.ImageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Optional;

@SpringBootTest
public class SpringBootDataJpaLobTest {
    @Autowired
    private ImageRepository imageRepository;

    @Test
    public void saveInDatabaseBlob() throws IOException {
        ImageTestBlob imageTestBlob = new ImageTestBlob();
        imageTestBlob.setName("test1");

        //read big image file
        File file = new File("D:\\springClass\\springBootDataJpa1401\\log1.jpg");
        FileInputStream fis = new FileInputStream(file);
        byte[] fileContent = new byte[(int) file.length()];
        fis.read(fileContent);
        //end big image read
        // for mysql  need this part to config
        // jdbc:mysql://SERVER:PORT_NO/SCHEMA?sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false

        imageTestBlob.setImage(fileContent);
        imageRepository.save(imageTestBlob);
        fis.close();

    }

    @Test
    public void getFromDatabaseBlob() throws IOException {
        Optional<ImageTestBlob>  getData = imageRepository.findById(2L);
        if(getData.isPresent()){
            File file = new File("D:\\springClass\\springBootDataJpa1401\\fromDataBase.jpg");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(getData.get().getImage());
            fos.close();
        }

    }
}
