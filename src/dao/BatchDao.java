package dao;

import java.util.List;


import exceptions.BatchException;
import model_JavaBeen.Batch;
import model_JavaBeen.Report;

public interface BatchDao {
	 public String addBatch() throws BatchException;
		
		public List<Batch> allBatch() throws BatchException;
		
		public Batch searchBatchById() throws BatchException;

//		public String updateBatch () throws BatchException;
		
		public String deleteBatch() throws BatchException;
		
		public String allocateFaculty() throws BatchException;
		
	   public List<Report> generateReport() throws BatchException;
}
