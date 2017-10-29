package dao;

import entity.DsTask;

public interface TaskDao {
	
	public void addTask(DsTask task);
	
	public void deleteTask(DsTask task);
	
	public DsTask getById(int tkId);
	
	public void update(DsTask task);
}
