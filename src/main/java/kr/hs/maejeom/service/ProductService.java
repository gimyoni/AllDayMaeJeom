package kr.hs.maejeom.service;

import java.util.List;

import kr.hs.maejeom.model.dto.ProductDTO;

public interface ProductService {
	public List<ProductDTO> list();
	public List<ProductDTO> category_list(String category);
	public List<ProductDTO> search(String name);
	public List<ProductDTO> price_search(int start, int end);
	public ProductDTO detail(int id);
}
