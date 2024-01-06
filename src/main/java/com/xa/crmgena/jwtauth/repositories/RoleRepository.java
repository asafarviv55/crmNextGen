package com.xa.crmgena.jwtauth.repositories;

import com.xa.crmgena.jwtauth.models.ERole;
import com.xa.crmgena.jwtauth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
