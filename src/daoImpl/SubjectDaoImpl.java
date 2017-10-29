package daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.SubjectDao;
import entity.DsSubject;
@Repository
public class SubjectDaoImpl extends CommonDaoImpl implements SubjectDao {

	@Override
	public DsSubject getById(int sbId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsSubject.class,sbId);
	}

	@Override
	public List<DsSubject> getAll() {
		// TODO Auto-generated method stub
		return getTemplate().loadAll(DsSubject.class);
	}
	
	@Override
	public void update(DsSubject subject) {
		// TODO Auto-generated method stub
		getTemplate().update(subject);
	}


	@Override
	public void save(DsSubject subject) {
		// TODO Auto-generated method stub
		getTemplate().save(subject);
	}

}
