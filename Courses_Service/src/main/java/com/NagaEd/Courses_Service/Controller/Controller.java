package com.NagaEd.Courses_Service.Controller;

import com.NagaEd.Courses_Service.Model.Course;
import com.NagaEd.Courses_Service.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class Controller {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    @PutMapping("/update/{id}")
    public Course updateCourse(@PathVariable String id, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(id, updatedCourse);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCourseById(@PathVariable String id) {
        courseService.deleteCourseById(id);
        return "Course with ID: " + id + " has been deleted.";
    }
}
