package dao;

import entity.DsPaper;

public interface PaperDao {
	
	public void addPaper(DsPaper paper);
	
	public void deletePaper(DsPaper paper);
	
	public DsPaper getById(int ppId);
	
	public void update(DsPaper paper);
	
	
}
