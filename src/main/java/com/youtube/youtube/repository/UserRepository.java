package com.youtube.youtube.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube.youtube.entity.User;

// public interface UserRepository extends JpaRepository<EntityType,datatype of primary key> {
public interface UserRepository extends JpaRepository<User, Long> {

    // Basic Finders for jpa
    User findByEmail(String email);
    Optional<User> findOptionalByEmail(String email);
    List<User> findAllByEmail(String email);

    // Case-Insensitive
    User findByEmailIgnoreCase(String email);
    List<User> findAllByEmailIgnoreCase(String email);

    // Contains / StartsWith / EndsWith
    List<User> findByEmailContaining(String keyword);  
    List<User> findByEmailStartingWith(String prefix);
    List<User> findByEmailEndingWith(String suffix);

    List<User> findByEmailContainsIgnoreCase(String keyword);
    List<User> findByEmailStartingWithIgnoreCase(String prefix);
    List<User> findByEmailEndingWithIgnoreCase(String suffix);

    // Negation
    List<User> findByEmailNot(String email);
    List<User> findByEmailNotIgnoreCase(String email);

    // Null Checks
    List<User> findByEmailIsNull();
    List<User> findByEmailIsNotNull();

    // Combined Conditions
    User findByEmailAndPassword(String email, String password);
    List<User> findByEmailOrUsername(String email, String username);
    User findByEmailAndStatus(String email, String status);

    // Pattern Matching (LIKE)
    List<User> findByEmailLike(String pattern);
    List<User> findByEmailNotLike(String pattern);

    // Ordering
    List<User> findByEmailOrderByCreatedAtDesc(String email);
    List<User> findByEmailOrderByIdAsc(String email);

    // Count Queries
    Long countByEmail(String email);
    Long countByEmailIgnoreCase(String email);

    // Boolean Existence
    boolean existsByEmail(String email);
    boolean existsByEmailIgnoreCase(String email);
}
