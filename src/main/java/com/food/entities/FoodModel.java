package com.food.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FoodModel {
	@Id
	private int cartId;
	private String restaurentName;
	private String foodName;

}
