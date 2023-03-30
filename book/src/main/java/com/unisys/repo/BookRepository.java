package com.unisys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unisys.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
