package com.peerlender.securityapp.domain.repository;

import com.peerlender.securityapp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
