package com.example.demo.services;

import com.example.demo.entity.Course;

import java.util.List;

public interface IService {
    public List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course putCourse(Course course);

    Course deleteCourse(long courseId);
}
