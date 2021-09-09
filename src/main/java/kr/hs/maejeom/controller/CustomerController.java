package kr.hs.maejeom.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//import kr.hs.maejeom.model.dto.CustomerDTO;
//import kr.hs.maejeom.service.CustomerService;
//import kr.hs.maejeom.service.CustomerServiceImpl;


@Controller
public class CustomerController {
	
	/*
	 * @Autowired CustomerService customerService;
	 * 
	 * // 회원가입 폼
	 * 
	 * @GetMapping("/signup_form") public String signup_form() { return
	 * "maejeom/signup_form"; }
	 * 
	 * // 회원가입
	 * 
	 * @PostMapping("/signup") public String signup(CustomerDTO dto) {
	 * if(customerService.duplicate(dto.getUserid())) { customerService.signup(dto);
	 * }else { System.out.println("아이디 중복됨"); } return "maejeom/signup"; }
	 * 
	 * // 로그인 폼
	 * 
	 * @GetMapping("/login_form") public String login_form() { return
	 * "maejeom/login_form"; }
	 * 
	 * // 로그인
	 * 
	 * @PostMapping("/login") public String login(@RequestParam String userid,
	 * String passwd) { boolean result = customerService.login(userid, passwd);
	 * if(result) { System.out.println("로그인 성공"); }else {
	 * System.out.println("로그인 실패"); } return "maejeom/login"; }
	 */
	
}