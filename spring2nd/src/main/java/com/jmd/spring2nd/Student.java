package com.jmd.spring2nd;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students", uniqueConstraints = {@UniqueConstraint(columnNames = {"email", "phone"})})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String course;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;
    //update bydefault true
    @Column(updatable = true)
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
