package com.macsupport.zoo;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gorilla(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void throwSomething() {
		System.out.println("Gorilla Threw Something");
		this.energyLevel -= 5; 
	}
	public void eat() {
		System.out.println("Gorilla Eating a banana");
		this.energyLevel += 10;
	}
	
}
