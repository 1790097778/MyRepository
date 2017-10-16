package impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.DsStudentinfoDao;
import entity.DsStudentinfo;
@Repository
public class DsStudeninfoImpl implements DsStudentinfoDao{
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession(){
		return sessionFactory.openSession();
	}
	@Override
	public DsStudentinfo getByUsername(String username) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(DsStudentinfo.class);
		dc.add(Restrictions.eq("stUsername", username));
		Criteria serName = dc.getExecutableCriteria(getCurrentSession());
		if(serName.list().size()!=0)
			return (DsStudentinfo)serName.list().get(0);
		else return null;
	}

	@Override
	public DsStudentinfo getById(int id) {
		// TODO Auto-generated method stub
		DetachedCriteria dc = DetachedCriteria.forClass(DsStudentinfo.class);
		dc.add(Restrictions.eq("stId", id));
		Criteria serName = dc.getExecutableCriteria(getCurrentSession());
	
		return (DsStudentinfo) serName.list().get(0);
	}

}
