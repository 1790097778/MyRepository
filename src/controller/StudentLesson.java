package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.Dto;
import service.StudentSubjectManager;

@Controller
@RequestMapping(method=RequestMethod.POST,value="/student/lesson")
public class StudentLesson {
	
	@Autowired
	private StudentSubjectManager manager;
	
	@RequestMapping("show.do")
	@ResponseBody
	public Dto show(HttpSession session)
	{
		if(!sessionExist(session))
			return new Dto(0,"Identity expired",null);
		//Get data from database
		try{
			return manager.getMySubject((int)session.getAttribute("studentId"));
		}catch(Exception e){
			e.printStackTrace();
			return new Dto(0, "Fail to get Subject", null);
		}	
	}
	
	@RequestMapping("abandon.do")
	@ResponseBody
	public Dto abandon(HttpSession session)
	{
		if(!sessionExist(session))
			return new Dto(0,"Identity expired",null);
		try{
			return manager.abandonSubject((int)session.getAttribute("studentId"));
		}catch(Exception e)
		{
			e.printStackTrace();
			return new Dto(0,"Fail to abondan",null);
		}
	}
	
	/**
	 * @param sbId
	 * @param currentPageNumber  if the request comes from student_lesson_choose,then the
	 * 		currentPageNumber need to be passed;
	 * @return
	 */
	@RequestMapping("detail.do")
	@ResponseBody
	public Dto detail(@RequestParam(value="sb_id")int sbId,
			@RequestParam(value="current_pageNumber",required=false)Integer currentPageNumber,
			HttpSession session)
	{
		if(!sessionExist(session))
			return new Dto(0,"Identity expired",null);
		try{
			Dto dto = manager.showSubjectDetail(sbId);
			if(currentPageNumber!=null)
				dto.getData().put("current_pageNumber", currentPageNumber);
			return dto;
		}catch(Exception e)
		{
			e.printStackTrace();
			return new Dto(0,"Fail to show detail",null);
		}
	}
	@RequestMapping("flip.do")
	@ResponseBody
	public Dto flip(@RequestParam(value="current_pageNumber")int currentPageNumber,
			HttpSession session)
	{
		if(!sessionExist(session))
			return new Dto(0,"Identity expired",null);
		try {
			return manager.getSubjectsByPage(currentPageNumber);
		} catch (Exception e) {
			// TODO: handle exception
			return new Dto(0,"Fail to flip",null);
		}
	}
	
	@RequestMapping("addSubject.do")
	@ResponseBody
	public Dto addSubject(@RequestParam(value="sb_id")int sbId,HttpSession session)
	{
		if(!sessionExist(session))
			return new Dto(0,"Identity expired",null);
		try{
			System.out.println(sbId);
			manager.addSubject((int)session.getAttribute("studentId"), sbId);
			return manager.getMySubject((int)session.getAttribute("studentId"));
		}catch(Exception e)
		{
			e.printStackTrace();
			return new Dto(0,"Fail to addSubject",null);
		}
	}
	
	private boolean sessionExist(HttpSession session)
	{
		if(session.getAttribute("studentId")!=null)
			return true;
		else return false;
	}
}
