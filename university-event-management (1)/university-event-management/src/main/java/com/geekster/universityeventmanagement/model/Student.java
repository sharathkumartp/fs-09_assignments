package com.geekster.universityeventmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;
    @Pattern(regexp = "^[A-Z].*")
    private String firstName;
    private String lastName;
    @Min(18) @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
