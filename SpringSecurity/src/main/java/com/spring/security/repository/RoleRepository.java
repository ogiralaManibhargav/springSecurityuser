package com.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.security.model.ERole;
import com.spring.security.model.Role;
import com.spring.security.model.User;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	 Optional<Role> findByName(ERole name);

}
