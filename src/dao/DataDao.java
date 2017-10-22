package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

public interface DataDao {
	public Session getSession();
	
	public void addData(Object data);
	
	public void deleteData(Object data);
	
	public List getData(List<Criterion> criterions,Class cla);
	
	public void updata(Object data);
	
	
}
