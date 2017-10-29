package dao;

import java.util.List;

import entity.DsNotice;

public interface NoticeDao {
	public void publishNotice(DsNotice notice);
	
	public void delete(long dTime);
	
	public List<DsNotice> receiveNotice(long date);
}
