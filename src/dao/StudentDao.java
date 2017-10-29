package dao;

import entity.DsStudentinfo;

public interface StudentDao {
	//�����û�����ѯ
	public DsStudentinfo getByUsername(String username);
	
	//����id��ѯ
	public DsStudentinfo getById(int id);
	
	public void update(DsStudentinfo student);
}
