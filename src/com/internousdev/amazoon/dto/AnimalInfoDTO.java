package com.internousdev.amazoon.dto;

public class AnimalInfoDTO {

	public int animalId;
	public String animalName;
	public int animalPrice;
	public int animalStrong;

	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int id) {
		this.animalId = id;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalPrice() {
		return animalPrice;
	}

	public void setAnimalPrice(int animalPrice) {
		this.animalPrice = animalPrice;
	}

	public int getAnimalStrong() {
		return animalStrong;
	}

	public void setAnimalStrong(int animalStrong) {
		this.animalStrong = animalStrong;
	}

}
