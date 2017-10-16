package impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.DsPowerDao;
import entity.DsPower;
import entity.DsStudentinfo;
@Repository
public class DsPowerImpl implements DsPowerDao{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession(){
		return sessionFactory.openSession();
	}
	@Override
	public DsPower getById(int id) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(DsPower.class);
		dc.add(Restrictions.eq("pwId", id));
		Criteria serName = dc.getExecutableCriteria(getCurrentSession());
	
		return (DsPower) serName.list().get(0);
	}

}
