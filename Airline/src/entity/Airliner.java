package entity;

public class Airliner extends Plane {
	private int seats;

	public Airliner(String name, int fuelConsumption, int range, int seats) {
		super(name, fuelConsumption, range);
		this.seats = seats;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + seats;
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
		Airliner other = (Airliner) obj;
		if (seats != other.seats)
			return false;
		return true;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	 public String toString() {
		  return super.toString() + ", seating=" + seats  + "]";
		 }
}
