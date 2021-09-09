package kr.hs.maejeom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.maejeom.dao.CustomerDAO;
import kr.hs.maejeom.model.dto.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDAO dao;

	// 회원가입
	@Override
	public void signup(CustomerDTO dto) {
		if(dao.duplicate(dto.getUserid())) {
			dao.signup(dto);
		}else {
			System.out.println("아이디가 중복됨");
		}
	}
	
	// 로그인
	@Override
	public boolean login(String userid, String passwd) {
		return dao.login(userid, passwd);
	}

	// 아이디 중복체크
	@Override
	public boolean duplicate(String userid) {
		boolean result = dao.duplicate(userid);
		if(result) {
			return true;
		}
		return false;
	}
	
	public CustomerDTO read(String userid) {
		return dao.read(userid);
	}

	public void delete(String userid) {
		dao.delete(userid);
	}

	public void update(CustomerDTO dto) {
		dao.update(dto);
	}

}
