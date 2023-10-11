package com.pratatecm.controllingDebt.repositories;

import com.pratatecm.controllingDebt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
