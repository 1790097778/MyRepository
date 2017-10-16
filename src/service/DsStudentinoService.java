package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DsStudentinfoDao;
import entity.DsStudentinfo;
@Service
public class DsStudentinoService {
	@Autowired
	private DsStudentinfoDao dao;
	
	public DsStudentinfo getByUsername(String username)
	{
		return dao.getByUsername(username);
	}
	
	public DsStudentinfo getById(int id)
	{
		return dao.getById(id);
	}
}
