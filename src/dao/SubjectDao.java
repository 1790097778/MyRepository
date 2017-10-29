package dao;

import java.util.List;

import entity.DsSubject;

public interface SubjectDao {
	
	public DsSubject getById(int sbId);
	
	public List<DsSubject> getAll();
	
	public void update(DsSubject subject);
	
	public void save(DsSubject subject);
}
