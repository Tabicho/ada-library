package edu.ada.library.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ada.library.domain.entity.jpa.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Long>{

}
