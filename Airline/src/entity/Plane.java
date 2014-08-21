package entity;

public class Plane {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fuelConsumption;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + range;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (fuelConsumption != other.fuelConsumption)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (range != other.range)
			return false;
		return true;
	}

	private String name;
	private int fuelConsumption;
	private int range;

	public Plane(String name, int fuelConsumption, int range) {
		this.name = name;
		this.fuelConsumption = fuelConsumption;
		this.range = range;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("[" + "Name: " + this.name + "," + " FuelConsumption: "
				+ this.fuelConsumption + "," + " Range: " + this.range);

		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public String setName() {
		return name;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
}
