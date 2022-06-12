package com.codefal.Jwt.repository;

import com.codefal.Jwt.models.ERole;
import com.codefal.Jwt.models.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
  Optional<Role> findByName(ERole name);
}
