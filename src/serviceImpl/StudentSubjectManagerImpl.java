package serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CollegeDao;
import dao.MajorDao;
import dao.StudentDao;
import dao.SubjectDao;
import dto.Dto;
import entity.DsStudentinfo;
import entity.DsSubject;
import service.StudentSubjectManager;
@Service
public class StudentSubjectManagerImpl implements StudentSubjectManager {
	
	@Autowired
	private SubjectDao subjectDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private MajorDao majorDao;
	@Autowired
	private CollegeDao collgeDao;
	@Override
	public Dto getMySubject(int stId) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		Integer sbId = studentDao.getById(stId).getStSubjectid();
		if(sbId==null)
			return new Dto(map);
		DsSubject subject =subjectDao.getById(sbId);
		refitSingleSubject(map, subject, false);
		return new Dto(map);
	}

	public Dto showSubjectDetail(int sbId)
	{
		HashMap map = new HashMap();
		DsSubject subject = subjectDao.getById(sbId);
		if(subject==null)
			return new Dto(0,"The subject has been deleted",null);
		refitSingleSubject(map, subject, true);
		return new Dto(map);
	}

	@Override
	public Dto getSubjectsByPage(int currentPage) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap<>();
		ArrayList<DsSubject> subjects = (ArrayList<DsSubject>) subjectDao.getAll();
		refitArraySubject(map, subjects, currentPage);
		return new Dto(map);
	}

	@Override
	public Dto abandonSubject(int stId) {
		// TODO Auto-generated method stub
		DsStudentinfo student =studentDao.getById(stId);
		DsSubject subject = subjectDao.getById(student.getStSubjectid());
		student.setStSubjectid(null);
		subject.setSbStudentid(null);
		
		studentDao.update(student);
		subjectDao.update(subject);
		
		return getSubjectsByPage(1);
	}

	@Override
	public void addSubject(int stId, int sbId) {
		// TODO Auto-generated method stub
		System.out.println("stId:"+stId+";sbId:"+sbId);
		DsStudentinfo student = studentDao.getById(stId);
		DsSubject subject = subjectDao.getById(sbId);
		student.setStSubjectid(sbId);
		subject.setSbStudentid(stId);
		
		studentDao.update(student);
		subjectDao.update(subject);
		
	}

	
	@SuppressWarnings("unchecked")
	private void refitSingleSubject(Map map ,DsSubject subject,boolean detail)
	{
		
		map.put("sb_name", subject.getSbTitle());
		map.put("sb_type", subject.getSbType());
		map.put("sb_college", collgeDao.geById(subject.getSbCollegeid()).getClName());
		map.put("sb_major", majorDao.getById(subject.getSbMajorid()).getMjName());
		
		if(detail)
		{
			map.put("sb_id", subject.getSbId());
			map.put("sb_content", subject.getSbContent());
			map.put("sb_comments", subject.getSbComments());
		}else
		{
			map.put("sb_id", subject.getSbId());
			map.put("sb_status", subject.getSbStatus());
		}
	}
	
	@SuppressWarnings("unchecked")
	private void refitArraySubject(Map map,List<DsSubject> subjects,int currentPageNumber)
	{
		final int pageCapacity=20;
		int size=subjects.size();
		int maxPageNumber = size/pageCapacity+1;
		int end;

		map.put("current_pageNumber", currentPageNumber);
		map.put("max_pageNumber", maxPageNumber);
		int[] sbId = new int[size];
		String[] sbName = new String[size];
		String[] sbType = new String[size];
		String[] sbCollege = new String[size];
		String[] sbMajor = new String[size];
		String[] sbStatus = new String[size];
		if(currentPageNumber==maxPageNumber)
			end=size;
		else end=currentPageNumber*20;
		for(int i=(currentPageNumber-1)*20;i<end;i++)
		{
			sbId[i] = subjects.get(i).getSbId();
			sbName[i] = subjects.get(i).getSbTitle();
			sbType[i] = subjects.get(i).getSbType();
			sbCollege[i] = collgeDao.geById(subjects.get(i).getSbCollegeid()).getClName();
			sbMajor[i] = majorDao.getById(subjects.get(i).getSbMajorid()).getMjName();
			sbStatus[i] = subjects.get(i).getSbStatus();
		}
		map.put("sb_id", sbId);
		map.put("sb_name",sbName);
		map.put("sb_type", sbType);
		map.put("sb_college", sbCollege);
		map.put("sb_major", sbMajor);
		map.put("sb_status", sbStatus);
		
	}
	
}
