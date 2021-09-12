package kr.hs.maejeom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.maejeom.dao.ProductDAO;
import kr.hs.maejeom.model.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO dao;

	@Override
	public List<ProductDTO> list() {
		return dao.list();
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
		return dao.detail(id);
	}

	@Override
	public void good(int id) {
		dao.good(id);
	}

	@Override
	public void bad(int id) {
		dao.bad(id);
	}

}
