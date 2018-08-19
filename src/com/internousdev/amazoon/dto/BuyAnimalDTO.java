package com.internousdev.amazoon.dto;

public class BuyAnimalDTO {

	public int id;
	public String animalName;
	public int animalStrong;
	public String animalPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public int getAnimalStrong() {
		return animalStrong;
	}

	public void setAnimalStrong(int strong) {
		this.animalStrong = strong;
	}

	public String getAnimalPrice() {
		return animalPrice;
	}

	public void setAnimalPrice(String animalPrice) {
		this.animalPrice = animalPrice;
	}

}
