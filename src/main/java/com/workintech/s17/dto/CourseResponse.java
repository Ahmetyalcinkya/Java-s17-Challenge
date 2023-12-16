package com.workintech.s17.dto;

import com.workintech.s17.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
    private Course course;
    private double totalGpa;
}
