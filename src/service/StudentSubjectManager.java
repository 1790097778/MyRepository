package service;

import java.util.List;

import dto.Dto;
import entity.DsSubject;


public interface StudentSubjectManager {
	
	public Dto getSubjectsByPage(int currentPage);

	public Dto getMySubject(int stId);
	
	public Dto showSubjectDetail(int sbId);
	
	public Dto abandonSubject(int stId);
	
	public void addSubject(int stId,int sbId);
	
}
