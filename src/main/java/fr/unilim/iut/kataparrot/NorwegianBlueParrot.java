package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot{

	private boolean isNailed;
	private double voltage;
	
	
	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super();
		this.isNailed = isNailed;
		this.voltage = voltage;
	}

	@Override
	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	public double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage*getBaseSpeed);
	}

}
