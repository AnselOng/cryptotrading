package org.ansel.cryptotrading.repository;

import org.ansel.cryptotrading.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed
}