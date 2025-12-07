package com.andrealves.crudspring.repositories;

import com.andrealves.crudspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
