package com.NagaEd.Courses_Service.Service;

import com.NagaEd.Courses_Service.Model.Course;
import com.NagaEd.Courses_Service.Repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
    public  List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
    public Course updateCourse(String id, Course updatedCourse) {
        Optional<Course> courseOptional = courseRepository.findById(id);

        if (courseOptional.isPresent()) {
            Course course = courseOptional.get();
            course.setName(updatedCourse.getName());
            course.setDescription(updatedCourse.getDescription());
            course.setInstructor(updatedCourse.getInstructor());
            return courseRepository.save(course);
        } else {
            throw new RuntimeException("Course not found with ID: " + id);
        }
    }
    public void deleteCourseById(String id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
        } else {
            throw new RuntimeException("Course not found with ID: " + id);
        }
    }


}
