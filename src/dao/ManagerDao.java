package dao;

import entity.DsManagerinfo;

public interface ManagerDao {
	public DsManagerinfo getById(int mgId);
	
	public DsManagerinfo getByUsername(String username);
	
	public void update(DsManagerinfo manager);
}
