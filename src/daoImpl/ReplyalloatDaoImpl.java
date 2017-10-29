package daoImpl;

import org.springframework.stereotype.Repository;

import dao.ReplyalloatDao;
import entity.DsReplyalloat;
@Repository
public class ReplyalloatDaoImpl extends CommonDaoImpl implements ReplyalloatDao{

	@Override
	public void addReplyalloat(DsReplyalloat reply) {
		// TODO Auto-generated method stub
		getTemplate().save(reply);
	}

	@Override
	public void delete(DsReplyalloat reply) {
		// TODO Auto-generated method stub
		getTemplate().delete(reply);
	}

	@Override
	public DsReplyalloat getById(DsReplyalloat reply) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsReplyalloat.class, reply);
	}

	@Override
	public void update(DsReplyalloat reply) {
		// TODO Auto-generated method stub
		getTemplate().update(reply);
	}

}
