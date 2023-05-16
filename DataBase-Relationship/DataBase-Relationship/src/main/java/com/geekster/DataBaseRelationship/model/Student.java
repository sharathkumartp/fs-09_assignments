package com.geekster.DataBaseRelationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    private  String studentName;
    private String studentAge;
    private String studentNumber;
    private String studentBranch;
    private String studentDepartment;
    @Embedded
    private Address address;
}
