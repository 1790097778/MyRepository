package daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.StudentDao;
import entity.DsStudentinfo;

@Repository
public class StudentDaoImpl extends CommonDaoImpl implements StudentDao{
	
	@Override
	public DsStudentinfo getByUsername(String username) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		List list = getTemplate().find("from entity.DsStudentinfo stu where stu.stUsername=?", username);
		if (list.size()==0) {
			return null;
		}
		return  (DsStudentinfo) list.get(0);
	}

	@Override
	public DsStudentinfo getById(int id) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsStudentinfo.class, id);
	}

	@Override
	public void update(DsStudentinfo student) {
		// TODO Auto-generated method stub
		getTemplate().update(student);
	}

}
