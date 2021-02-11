package com.varitoooo.hexagonal.project.domain;

import org.hibernate.Criteria;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    void save(Project project);

    Optional<Project> search(ProjectId projectId);

    List<Project> searchByCriteria(Criteria criteria);

    void remove(ProjectId projectId);
}