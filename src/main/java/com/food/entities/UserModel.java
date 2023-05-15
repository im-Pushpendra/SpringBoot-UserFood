package com.food.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserModel {
	@Id
	private int userId;
	private String name;
	private String email;
	private int cartId;

	@OneToOne(cascade = CascadeType.ALL)
	private FoodModel foodModel;
}
