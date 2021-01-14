package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author lsr
 * @ClassName Course
 * @Date 2021-01-14
 * @Vertion 1.0
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "choosed_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"),
            foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT),
            inverseForeignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT)
    )
    private List<Student> studentList;
}
