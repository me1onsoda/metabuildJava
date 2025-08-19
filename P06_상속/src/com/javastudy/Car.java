package com.javastudy;

public class Car {
	private String kind;
	private int speed;
	
	public Car(String kind, int speed) {
		this.kind=kind;
		this.speed=speed;
	}
	
	public void prnCar() {
		System.out.println("차종:"+kind);
		System.out.println("속도:"+speed);
	}
}


