package com.alan.zookeeperpt2;

public class Mammal {
	
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy is Now: " + this.energyLevel);
		return this.energyLevel;
		
	}
	
}
