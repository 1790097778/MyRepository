package daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import dao.NoticeDao;
import entity.DsNotice;
@Repository
public class NoticeDaoImpl extends CommonDaoImpl implements NoticeDao{

	@Override
	public void publishNotice(DsNotice notice) {
		// TODO Auto-generated method stub
		getTemplate().save(notice);
	}

	@Override
	public void delete(long dTime) {
		// TODO Auto-generated method stub
		getTemplate().deleteAll(getTemplate().find("from entity.DsNotice notice where ntTime < ?", dTime));
	}

	@Override
	public List<DsNotice> receiveNotice(long date) {
		// TODO Auto-generated method stub
		List list = getTemplate().find("from entity.DsNotice notice where ntTime < ?", date);
		if(list.size()!=0)
			return (List<DsNotice>)list;
		return null;
	}

	
	
}
