package test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping("/login.do")
	public void login()
	{
		
		System.out.println("Succeed!!");
	}
}
