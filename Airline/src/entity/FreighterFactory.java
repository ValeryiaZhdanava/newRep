package entity;

public class FreighterFactory extends PlaneFactory {
	@SuppressWarnings("unchecked")
	public <T> Plane createPlane(T... args) {

		return new Freighter((String) args[0], (Integer) args[1],
				(Integer) args[2], (Integer) args[3]);
	}

}
