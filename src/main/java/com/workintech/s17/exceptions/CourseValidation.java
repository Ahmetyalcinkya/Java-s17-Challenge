package com.workintech.s17.exceptions;

import com.workintech.s17.entity.Course;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

public class CourseValidation {

    public static void checkCourseIsValid(Course course){
        if((course.getCredit() < 0 || course.getCredit() > 4) || (course.getName() == null || course.getName().isEmpty())){
            throw new CourseException("The credentials are not valid.", HttpStatus.BAD_REQUEST);
        }
    }
    public static void isIdValid(int id){
        if(id <= 0){
            throw new CourseException("ID is not valid.", HttpStatus.BAD_REQUEST);
        }
    }
    public static void isDuplicateNameFound(List<Course> courses, String name){
        Optional<Course> course = courses.stream().filter(c -> c.getName().equalsIgnoreCase(name)).findFirst();
        if(course.isPresent()){
            throw new CourseException("Course with given name is already exist.", HttpStatus.BAD_REQUEST);
        }
    }
}
