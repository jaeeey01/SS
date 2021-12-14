package com.example.ss.Domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UsersRepository extends JpaRepository<UsersEntity, String> {

    Optional<UsersEntity> findById(String id);
}
