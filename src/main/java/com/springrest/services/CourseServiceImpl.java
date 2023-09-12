package com.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
		
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(123,"java core course","this course contain basics of java"));
//		list.add(new Course(124,"react course","this course contain basics of java"));
//		list.add(new Course(125,"javascript course","this course contain basics of java"));
//		list.add(new Course(126,"jquery course","this course contain basics of java"));
//		list.add(new Course(127,"java8 core course","this course contain basics of java"));

	}
	
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourseById(long courseId) {
//		// TODO Auto-generated method stub
//		Course c = null;
//			
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list = this.list.stream().filter(e -> e.getId()!= parseLong).collect(Collectors.toList());
		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
		
	}

}
