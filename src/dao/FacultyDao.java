package dao;

import java.util.List;


import exceptions.FacultyException;
import model_JavaBeen.Faculty;

public interface FacultyDao {
	
public String addFaculty() throws FacultyException;
	
	public Boolean FacultyLogin(String username, String password) throws FacultyException;
	
	public List<Faculty> getAllFacultyDetails()throws FacultyException;

	public List<Faculty> searchFacultyByName() throws FacultyException;
//	
	public Faculty searchFacultyById() throws FacultyException;
	
	public String updateFacultyDetails() throws FacultyException;

	public String deleteFaculty() throws FacultyException;

	public String updateppssword()throws FacultyException;

}
