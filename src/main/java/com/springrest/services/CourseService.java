package com.springrest.services;

import com.springrest.entities.*;
import java.util.*;
public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourseById(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
	
	
	
}
