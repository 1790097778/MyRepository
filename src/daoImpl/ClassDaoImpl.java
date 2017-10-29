package daoImpl;

import org.springframework.stereotype.Repository;

import dao.ClassDao;
import entity.DsClass;
@Repository
public class ClassDaoImpl extends CommonDaoImpl implements ClassDao{

	@Override
	public DsClass getById(int clId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsClass.class, clId);
	}

}
