package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YourController {
	@Autowired
	private HumanRepository humanRepo;
	@Autowired
	private DrinkRepository drinkRepo;
	
	@RequestMapping(method = RequestMethod.GET, value = "/drinks")
	public Object getDrinks() {
		List<Drink> dataList = drinkRepo.findAll();
		return ResponseEntity.ok(dataList);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/humans")
	public Object getHumans() {
		List<Human> dataList = humanRepo.findAll();
		return ResponseEntity.ok(dataList);
	}
}
