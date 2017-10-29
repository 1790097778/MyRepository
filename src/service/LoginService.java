package service;

import org.springframework.stereotype.Service;

import dto.Dto;

public interface LoginService {
	public Dto login(String username,String password);
}
