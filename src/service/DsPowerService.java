package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DsPowerDao;
import entity.DsPower;
@Service
public class DsPowerService {
	@Autowired
	private DsPowerDao dao;
	
	public DsPower getById(int id)
	{
		return dao.getById(id);
	}
}
