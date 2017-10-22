package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DataDao;


@Service
public class BasicService {
	@Autowired
	private DataDao dao;
	public Session getSession()
	{
		return dao.getSession();
	}
	public void add(Object data)
	{
		dao.addData(data);
	}
	
	public void deleta(Object data)
	{
		dao.deleteData(data);
	}
	
	public List get(List<Criterion> criterions,Class cla)
	{
		return dao.getData(criterions, cla);
	}
	
	public void update(Object data)
	{
		dao.updata(data);
	}
}
