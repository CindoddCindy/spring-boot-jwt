package com.fluex404.springbootjwt.repository;

import com.fluex404.springbootjwt.model.ERole;
import com.fluex404.springbootjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
