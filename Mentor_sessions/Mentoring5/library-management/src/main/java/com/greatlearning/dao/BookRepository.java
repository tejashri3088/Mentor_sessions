package com.greatlearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
