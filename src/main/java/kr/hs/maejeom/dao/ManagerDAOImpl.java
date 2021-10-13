package kr.hs.maejeom.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOImpl implements ManagerDAO {
	
	@Autowired
	SqlSessionTemplate session;

	@Override
	public boolean login(String userid, String passwd) {
		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		int count = session.selectOne("manager.login", map);
		System.out.println(map.get("userid"));
		System.out.println(map.get("passwd"));
		if(count == 1) {
			return true;
		}
		return false;
	}

}
