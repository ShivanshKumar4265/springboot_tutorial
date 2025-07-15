package com.jmd.spring2nd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // This interface will automatically provide CRUD operations for the Student entity
    // due to the JpaRepository inheritance.
    // No additional methods are needed unless custom queries are required.
}
