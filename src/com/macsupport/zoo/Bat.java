package com.macsupport.zoo;

public class Bat extends Mammal {

	public Bat() {
		super(300);
		// TODO Auto-generated constructor stub
	}

	public Bat(int energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public void fly() {
		System.out.println("Scrreech flap flap");
		this.energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("yummy humans");
		this.energyLevel += 50;
	}
	
}
