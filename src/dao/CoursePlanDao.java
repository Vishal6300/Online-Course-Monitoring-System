package dao;

import java.util.List;


import exceptions.CoursePlanException;
import model_JavaBeen.CoursePlan;

public interface CoursePlanDao {
public String addCoursePlan() throws CoursePlanException;
	
	public String updateStatus() throws CoursePlanException;
	
	public String updateStatusAdmin() throws CoursePlanException;
	
	public String updateTopic() throws CoursePlanException;
	
//	public String updateDate() throws CoursePlanException;
//	
//	public String deleteStatus() throws CoursePlanException;
//	
	public List<CoursePlan> viewAllCoursePlanDateWise() throws CoursePlanException;
}
