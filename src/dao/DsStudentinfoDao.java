package dao;

import entity.DsStudentinfo;

public interface DsStudentinfoDao {
	//�����û�����ѯ
	public DsStudentinfo getByUsername(String username);
	
	//����id��ѯ
	public DsStudentinfo getById(int id);
}
