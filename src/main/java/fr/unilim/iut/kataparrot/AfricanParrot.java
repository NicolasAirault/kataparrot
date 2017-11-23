package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	private double getLoadFactor;
	private double numberOfCoconuts;
	
	public AfricanParrot(double numberOfCoconuts) {
		super();
		this.getLoadFactor = 9.0;
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, (getBaseSpeed-(getLoadFactor*numberOfCoconuts)));
	}
}
