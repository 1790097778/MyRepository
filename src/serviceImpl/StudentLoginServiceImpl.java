package serviceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PowerDao;
import dao.StudentDao;
import dto.Dto;
import entity.DsStudentinfo;
import service.LoginService;
@Service
public class StudentLoginServiceImpl implements LoginService {
	@Autowired
	private PowerDao powerDao;
	
	@Autowired
	private StudentDao stuDao;
	
	
	@Override
	public Dto login(String username,String password) {
		// TODO Auto-generated method stub
		DsStudentinfo student ;
		student =stuDao.getByUsername(username);
		if (student==null) {
			return new Dto(0, "name", null);
		}
		if(!password.equals(student.getStPassword()))
			return new Dto(0,"password",null);
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("studentId", student.getStId());
		map.put("power",powerDao.getById(student.getStPowerid()).getPwPagepower());
		return new Dto(1, "success", map);
	}

}
