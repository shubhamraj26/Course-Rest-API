package com.example.demo.services;

import com.example.demo.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ServiceImp implements IService{
    List<Course> list;
    public ServiceImp(){
        list=new ArrayList<>();
        list.add(new Course(1,"course1","discription"));
        list.add(new Course(2,"course2","discription"));
        list.add(new Course(3,"course3","discription"));
        list.add(new Course(4,"course4","discription"));
        list.add(new Course(5,"course5","discription"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c=null;
        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
        return  c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course putCourse(Course course) {
        long id=course.getId();
        for(Course item:list)
        {
            if(id==item.getId())
            {
                list.remove(item);
                list.add(course);
            }
        }
        return course;
    }

    @Override
    public Course deleteCourse(long courseId) {
//        Course c;
        for(Course item:list)
        {
            if(courseId==item.getId())
            {
//                c=item;
                list.remove(item);
                return item;
            }
        }
        return null;
    }
}
