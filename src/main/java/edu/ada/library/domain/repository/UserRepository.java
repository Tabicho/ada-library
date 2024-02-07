package edu.ada.library.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ada.library.domain.entity.jpa.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
