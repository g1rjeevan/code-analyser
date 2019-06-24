package com.backend.codeanalyser.repository;

import com.backend.codeanalyser.model.Role;
import com.backend.codeanalyser.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}