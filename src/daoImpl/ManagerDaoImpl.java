package daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.ManagerDao;
import entity.DsManagerinfo;
@Repository
public class ManagerDaoImpl extends CommonDaoImpl implements ManagerDao{

	@Override
	public DsManagerinfo getById(int mgId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsManagerinfo.class, mgId);
	}

	@Override
	public DsManagerinfo getByUsername(String username) {
		// TODO Auto-generated method stub
		List list = getTemplate().
				find("from entity.DsManagerinfo manager where manager.mgUsername = ?", username);
		if(list.size()==0)
			return null;
		return (DsManagerinfo)list.get(0);
	}

	@Override
	public void update(DsManagerinfo manager) {
		// TODO Auto-generated method stub
		getTemplate().update(manager);
	}

}
