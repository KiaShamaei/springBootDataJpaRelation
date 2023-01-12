package com.classtursday.springbootdatajpa1401.repository;

import com.classtursday.springbootdatajpa1401.entity.ImageTestBlob;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageTestBlob , Long> {
}
