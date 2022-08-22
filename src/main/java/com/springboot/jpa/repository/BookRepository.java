package com.springboot.jpa.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.jpa.domain.Book;

//Fill your code here
@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Long> {


}
