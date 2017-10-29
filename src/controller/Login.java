package controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import dto.Dto;
import serviceImpl.StudentLoginServiceImpl;

@Controller
@RequestMapping("login")
public class Login {
	@Autowired
	private StudentLoginServiceImpl ser;

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "loginIn")
	public Dto loginIn(@RequestParam(required = true, value = "name") String username,
			@RequestParam(required = true, value = "password") String password, 
			HttpSession hSession) {
		Dto dto = ser.login(username, password);
		
		if (dto.getSuccess() == 0)
			return dto;

		hSession.setAttribute("studentId", dto.getData().get("studentId"));
		hSession.setAttribute("power", dto.getData().get("power"));
		dto.getData().remove("studentId");
		dto.getData().remove("power");
		
		return dto;

	}

}
