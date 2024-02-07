package edu.ada.library.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.ada.library.domain.entity.jpa.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
