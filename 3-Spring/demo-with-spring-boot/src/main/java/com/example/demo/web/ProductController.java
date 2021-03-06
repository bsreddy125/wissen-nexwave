package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView getProducts() {
		List<Product> products = productRepository.findAll();
		ModelAndView mav = new ModelAndView();
		mav.addObject("allProducts", products);
		mav.setViewName("products-template");
		return mav;
	}

}
