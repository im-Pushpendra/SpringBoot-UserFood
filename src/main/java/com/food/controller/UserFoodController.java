package com.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entities.UserModel;
import com.food.repository.UserRepo;

@RestController
@RequestMapping("/food")
public class UserFoodController {
	@Autowired
	UserRepo urepo;
	
	@PostMapping("/add")
	public String add(@RequestBody UserModel userModel) {
		urepo.save(userModel);
		return "Added Sucessfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		urepo.deleteById(id);
		return "deleted Sucessfully";
	}

}
