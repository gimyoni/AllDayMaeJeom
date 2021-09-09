package kr.hs.maejeom.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.maejeom.model.dto.CustomerDTO;

public interface CustomerDAO {
	public void signup(CustomerDTO dto); // 회원가입
	public boolean login(String userid, String passwd); // 로그인
	public boolean duplicate(String email); // 아이디 중복 확인
	public CustomerDTO read(String userid); // 회원 정보 읽기
	public void delete(String userid); // 회원 삭제
	public void update(CustomerDTO dto); // 회원 정보 수정
}