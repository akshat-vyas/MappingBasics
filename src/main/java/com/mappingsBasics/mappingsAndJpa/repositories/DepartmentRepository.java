package com.mappingsBasics.mappingsAndJpa.repositories;

import com.mappingsBasics.mappingsAndJpa.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {

}
