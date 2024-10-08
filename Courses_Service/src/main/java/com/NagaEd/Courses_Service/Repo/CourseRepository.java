package com.NagaEd.Courses_Service.Repo;

import com.NagaEd.Courses_Service.Model.Course;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,String> {
}
