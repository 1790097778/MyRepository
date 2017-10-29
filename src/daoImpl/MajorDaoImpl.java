package daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.MajorDao;
import entity.DsMajor;
@Repository
public class MajorDaoImpl extends CommonDaoImpl implements MajorDao {

	@Override
	public DsMajor getById(int mjId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsMajor.class, mjId);
	}


}
