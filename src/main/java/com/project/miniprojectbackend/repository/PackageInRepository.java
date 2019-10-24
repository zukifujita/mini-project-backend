package com.project.miniprojectbackend.repository;

import com.project.miniprojectbackend.core.PackageIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageInRepository extends JpaRepository<PackageIn, Integer> {

}
