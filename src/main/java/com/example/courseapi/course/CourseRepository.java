package com.example.courseapi.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {

    public List<Course> findByName(String name);

    public List<Course> findByTopicId(String topicId);
}
