package com.workintech.s17.entity;

import org.springframework.stereotype.Component;

@Component
public class MediumCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 5;
    }
}
