package com.projectservice.webservicedev.repositories;

import com.projectservice.webservicedev.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
