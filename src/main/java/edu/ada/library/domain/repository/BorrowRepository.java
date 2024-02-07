package edu.ada.library.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ada.library.domain.entity.jpa.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

}
