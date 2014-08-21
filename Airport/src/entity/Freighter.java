package entity;

public class Freighter extends Plane {

	private int capacity;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Freighter other = (Freighter) obj;
		if (capacity != other.capacity)
			return false;
		return true;
	}

	public Freighter(String name, int fuelConsumption, int range, int capacity) {
		super(name, fuelConsumption, range);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		return super.toString() + ", capacity=" + capacity + "]";
	}
}
