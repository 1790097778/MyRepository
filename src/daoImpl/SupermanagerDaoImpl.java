package daoImpl;

import org.springframework.stereotype.Repository;

import dao.SuperManagerDao;
import entity.DsSupermanager;
@Repository
public class SupermanagerDaoImpl extends CommonDaoImpl implements SuperManagerDao{

	@Override
	public DsSupermanager getById(int smId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsSupermanager.class, smId);
	}

	@Override
	public DsSupermanager getByUsername(String username) {
		// TODO Auto-generated method stub
		return (DsSupermanager) getTemplate().
				find("from entity.DsSupermanager manager where manager.smgStuname = ?"
						, username);
	}

	@Override
	public void update(DsSupermanager supermanager) {
		// TODO Auto-generated method stub
		getTemplate().update(supermanager);
	}

}
