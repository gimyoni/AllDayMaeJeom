package kr.hs.maejeom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.maejeom.model.dto.ProductDTO;
import kr.hs.maejeom.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	ProductService service;
	
	@GetMapping("/")
	public String index(Model model) {
		List<ProductDTO> list = service.list();
		model.addAttribute("list", list);
		return "index";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam int id, Model model) {
		ProductDTO dto = service.detail(id);
		model.addAttribute("dto", dto);
		return "maejeom/product_detail";
	}
}