package com.oneone.oneone.repository;

import com.oneone.oneone.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentRepository extends JpaRepository<Employee,Long> {
}
