package com.xa.crmgena.crm.repositories;

import com.xa.crmgena.crm.models.ERole;
import com.xa.crmgena.crm.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
