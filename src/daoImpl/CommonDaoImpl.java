package daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository

public class CommonDaoImpl {
	@Autowired
	protected SessionFactory factory;
	
	protected HibernateTemplate template;
	
	protected HibernateTemplate getTemplate()
	{
		if(template==null)
			template=new HibernateTemplate(factory);
		return template;
	}
}
