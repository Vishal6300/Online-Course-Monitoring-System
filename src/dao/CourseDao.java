package dao;

import java.util.List;


import exceptions.CourseException;
import model_JavaBeen.Course;

public interface CourseDao {
 public String addCourse()throws CourseException;
	 
	 public List<Course> getAllCourse() throws CourseException;
		
	 public Course searchCourseName() throws CourseException;
	
	
	
	 public String updateCourseDetails() throws CourseException;

	 public String deleteCourse() throws CourseException;
}
