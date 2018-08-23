package com.filipe.simplecm.resources;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.filipe.simplecm.domain.Category;


@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Category> listing() {
		Category c1 = new Category(1, "IT");
		Category c2 = new Category(2, "Office");
		List<Category> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		return list;
	}
}
