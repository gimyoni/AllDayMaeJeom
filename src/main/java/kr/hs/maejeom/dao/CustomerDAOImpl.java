package kr.hs.maejeom.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.maejeom.model.dto.CustomerDTO;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	SqlSessionTemplate session;

	public void signup(CustomerDTO dto) {
		session.insert("customer.signup", dto);
	}

	public boolean login(String userid, String passwd) {
		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		int count = session.selectOne("customer.login", map);
		System.out.println(map.get("userid"));
		System.out.println(map.get("passwd"));
		if(count == 1) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean duplicate(String userid) {
		int count = session.selectOne("customer.duplicate", userid);
		if(0 == count) {
			return true;
		}
		return false;
	}
	
	public CustomerDTO read(String userid) {
		CustomerDTO dto = session.selectOne("customer.read", userid);
		return dto;
	}

	public void delete(String userid) {
		session.delete("customer.delete", userid);
	}

	public void update(CustomerDTO dto) {
		session.update("customer.update", dto);
	}

}
