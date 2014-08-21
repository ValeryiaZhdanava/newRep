package entity;

public class AirlinerFactory extends PlaneFactory {
	@SuppressWarnings("unchecked")
	public <T> Plane createPlane(T... args) {

		return new Airliner((String) args[0], (Integer) args[1],
				(Integer) args[2], (Integer) args[3]);
	}
}
