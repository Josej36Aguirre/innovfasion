package com.innovfashion.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
@RepositoryRestResource(path = "task", collectionResourceRel = "task")
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
