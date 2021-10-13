package kr.hs.maejeom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import kr.hs.maejeom.service.ManagerService;

@Controller
public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
	@GetMapping("/manager_login_form")
	public String manager_login(Model model) {
		return "maejeom/manager_login_form";
	}
	
	// �α���
	@PostMapping("/manager_login")
	public String login(@RequestParam String userid, String passwd) {
		boolean result = managerService.login(userid, passwd);
		if(result) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		return "maejeom/login";
	}
}
