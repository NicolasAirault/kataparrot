package fr.unilim.iut.kataparrot;

public class ParrotNorw extends Parrot{

	private double getBaseSpeed;
	private boolean isNailed;
	private double voltage;
	
	
	public ParrotNorw(double voltage, boolean isNailed) {
		super();
		this.getBaseSpeed = 12.0;
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
