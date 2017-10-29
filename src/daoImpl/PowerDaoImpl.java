package daoImpl;

import org.springframework.stereotype.Repository;

import dao.PowerDao;
import entity.DsPower;
@Repository
public class PowerDaoImpl extends CommonDaoImpl implements PowerDao {

	@Override
	public DsPower getById(int id) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsPower.class, id);
	}
	
	

}
