package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.DsSubject;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:spring/spring-dao.xml"})  
public class WriteDao {
	@Autowired
	private SubjectDao dao;
	@Test
	public void write()
	{
		DsSubject subject = dao.getById(1);
		subject.setSbComments("testUpdate");
		dao.update(subject);
	}
}
