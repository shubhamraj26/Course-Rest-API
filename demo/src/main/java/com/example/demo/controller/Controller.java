package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.services.IService;
import com.example.demo.services.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private IService serviceObj;
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return serviceObj.getCourses();
    }
    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.serviceObj.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.serviceObj.addCourse(course);
    }
    @PutMapping("/courses")
    public Course putCourse(@RequestBody Course course)
    {
        return this.serviceObj.putCourse(course);
    }
    @DeleteMapping("/course/{courseId}")
    public Course deleteCourse(@PathVariable String courseId)
    {
        return this.serviceObj.deleteCourse(Long.parseLong(courseId));
    }
}
