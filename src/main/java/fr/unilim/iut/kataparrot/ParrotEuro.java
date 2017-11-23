package fr.unilim.iut.kataparrot;

public class ParrotEuro extends Parrot{

	private double getBaseSpeed;
	
	public ParrotEuro() {
		super();
		this.getBaseSpeed = 12.0;
	}

	@Override
	public double getSpeed() {
		return getBaseSpeed;
	}

}
