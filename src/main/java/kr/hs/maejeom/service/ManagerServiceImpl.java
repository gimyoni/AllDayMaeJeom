package kr.hs.maejeom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.maejeom.dao.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	ManagerDAO dao;
	
	@Override
	public boolean login(String userid, String passwd) {
		return dao.login(userid, passwd);
	}

}
