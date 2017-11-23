package fr.unilim.iut.kataparrot;

public class ParrotAfri extends Parrot {

	private double getLoadFactor;
	private double numberOfCoconuts;
	
	public ParrotAfri(double numberOfCoconuts) {
		super();
		this.getLoadFactor = 9.0;
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, (getBaseSpeed-(getLoadFactor*numberOfCoconuts)));
	}
}
