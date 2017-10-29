package dao;

import entity.DsReplyalloat;

public interface ReplyalloatDao {
	public void addReplyalloat(DsReplyalloat reply);
	
	public void delete(DsReplyalloat reply);
	
	public DsReplyalloat getById(DsReplyalloat reply);
	
	public void update(DsReplyalloat reply);
}
