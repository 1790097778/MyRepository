package daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.CollegeDao;
import entity.DsCollege;
@Repository
public class CollegeDaoImpl extends CommonDaoImpl implements CollegeDao {

	@Override
	public DsCollege geById(int clId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsCollege.class, clId);
	}


}
