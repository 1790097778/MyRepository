package dao;

import entity.DsStudentinfo;

public interface DsStudentinfoDao {
	//根据用户名查询
	public DsStudentinfo getByUsername(String username);
	
	//根据id查询
	public DsStudentinfo getById(int id);
}
