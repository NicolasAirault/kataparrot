package fr.unilim.iut.kataparrot;

public abstract class Parrot{

	protected double getBaseSpeed;
	public Parrot() {
		this.getBaseSpeed = 12.0;
	}

	public abstract double getSpeed();
}