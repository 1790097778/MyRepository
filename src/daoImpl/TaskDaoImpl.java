package daoImpl;

import org.springframework.stereotype.Repository;

import dao.TaskDao;
import entity.DsTask;
@Repository
public class TaskDaoImpl extends CommonDaoImpl implements TaskDao{

	@Override
	public void addTask(DsTask task) {
		// TODO Auto-generated method stub
		getTemplate().save(task);
	}

	@Override
	public void deleteTask(DsTask task) {
		// TODO Auto-generated method stub
		getTemplate().delete(task);
	}

	@Override
	public DsTask getById(int tkId) {
		// TODO Auto-generated method stub
		return getTemplate().get(DsTask.class, tkId);
	}

	@Override
	public void update(DsTask task) {
		// TODO Auto-generated method stub
		getTemplate().update(task);
	}

}
