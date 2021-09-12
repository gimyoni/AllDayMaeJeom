package kr.hs.maejeom.dao;

import java.util.List;

import kr.hs.maejeom.model.dto.ProductDTO;

public interface ProductDAO {
	public List<ProductDTO> list();
	public List<ProductDTO> category_list(String category);
	public List<ProductDTO> search(String name);
	public List<ProductDTO> price_search(int start, int end);
	public ProductDTO detail(int id);
	public void good(int id);
	public void bad(int id);
}
