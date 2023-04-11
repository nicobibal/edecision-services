package com.example.organizationservices.repositories;

import com.example.organizationservices.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
