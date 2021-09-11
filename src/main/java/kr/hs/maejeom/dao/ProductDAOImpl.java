package kr.hs.maejeom.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.maejeom.model.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SqlSessionTemplate session;

	@Override
	public List<ProductDTO> list() {
		return session.selectList("product.list");
	}

	@Override
	public List<ProductDTO> category_list(String category) {
		return null;
	}

	@Override
	public List<ProductDTO> search(String name) {
		return null;
	}

	@Override
	public List<ProductDTO> price_search(int start, int end) {
		return null;
	}

	@Override
	public ProductDTO detail(int id) {
		return session.selectOne("product.detail", id);
	}

}
