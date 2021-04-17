package com.spring.microservices.course.endpoint.service;

import com.spring.microservices.course.model.Course;
import com.spring.microservices.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
@Slf4j
public class CourseService {

    private final CourseRepository courseRepository;

    public Iterable<Course> list (Pageable pageable) {
        log.info("Listing all courses");
        return courseRepository.findAll();
    }
}
