package impl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.DataDao;
@Repository
public class BasicDaoImpl implements DataDao {
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession();
	}
	
	public Transaction beginTran()
	{
		 return getSession().beginTransaction();
	}

	@Override
	public void addData(Object data) {
		// TODO Auto-generated method stub	
		getSession().save(data);
	}

	@Override
	public void deleteData(Object data) {
		// TODO Auto-generated method stub
			getSession().save(data);
	}

	@Override
	public List getData(List<Criterion> criterions,Class cla) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(cla);
		if(criterions!=null)
		{
			for(Criterion criterion:criterions)
				dc.add(criterion);
		}
		
		Criteria criteria = dc.getExecutableCriteria(getSession());
		
		return criteria.list();
	}

	@Override
	public void updata(Object data) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(data);
	}

	@Override
	public Transaction begin() {
		// TODO Auto-generated method stub
		return  getSession().beginTransaction();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		getSession().close();
	}

	

}
