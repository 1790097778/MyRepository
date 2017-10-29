package dao;

import entity.DsSupermanager;

public interface SuperManagerDao {

	public DsSupermanager getById(int smId);
	
	public DsSupermanager getByUsername(String username);
	
	public void update(DsSupermanager supermanager);
}
