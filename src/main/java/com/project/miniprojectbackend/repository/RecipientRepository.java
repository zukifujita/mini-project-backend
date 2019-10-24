package com.project.miniprojectbackend.repository;

import com.project.miniprojectbackend.core.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientRepository extends JpaRepository<Recipient, Integer> {
}
