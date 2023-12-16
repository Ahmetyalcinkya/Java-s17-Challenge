package com.workintech.s17.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    private int id;
    private String name;
    private int credit;
    private Grade grade;
}
