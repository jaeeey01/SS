package com.example.ss.Repository;

import com.example.ss.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<UsersEntity, String> {

}
