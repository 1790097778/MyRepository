package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.DsStudentinfo;
import entity.DsSubject;
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath:spring/spring-dao.xml"})  
public class AddSubject {
	@Autowired
	StudentDao studentDao;
	@Autowired
	SubjectDao subjectDao;
	
	@Test
	public void addSubject() {
		int stId=4;
		int sbId=1;
		// TODO Auto-generated method stub
		DsStudentinfo student = studentDao.getById(stId);
		DsSubject subject = subjectDao.getById(sbId);
		student.setStSubjectid(sbId);
		subject.setSbStudentid(stId);
		
		studentDao.update(student);
		subjectDao.update(subject);
		
	}
}
