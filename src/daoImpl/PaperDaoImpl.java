package daoImpl;

import org.springframework.stereotype.Repository;

import dao.PaperDao;
import entity.DsPaper;
@Repository
public class PaperDaoImpl extends CommonDaoImpl implements PaperDao{

	@Override
	public void addPaper(DsPaper paper) {
		// TODO Auto-generated method stub
		getTemplate().save(paper);
	}

	@Override
	public void deletePaper(DsPaper paper) {
		// TODO Auto-generated method stub
		getTemplate().delete(paper);
	}

	@Override
	public DsPaper getById(int ppId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsPaper.class, ppId);
	}

	@Override
	public void update(DsPaper paper) {
		// TODO Auto-generated method stub
		getTemplate().update(paper);
	}

}
