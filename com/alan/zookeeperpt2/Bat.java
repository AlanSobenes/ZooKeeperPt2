package com.alan.zookeeperpt2;

public class Bat extends Mammal {
	
	private int energyLevel;
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Swooosh!");
		this.decreaseEnergy(50);
	}
	
	public void eatHumans() {
		System.out.println("AAAAAHHHHHH!!!!!...CRRUUNCH!!");
		this.increaseEnergy(25);
	}
	
	public void attackTown() {
		System.out.println("Sounds of Mayhem: ;alksdjf;alkdfj;adlkfj;aldkfj");
		this.decreaseEnergy(100);
	}
	
	
	
	
	public void decreaseEnergy(int num) {
		this.energyLevel -= num;
	}
	
	public void increaseEnergy(int num) {
		this.energyLevel += num;
	}
}
