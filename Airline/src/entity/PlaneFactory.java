package entity;

abstract public class PlaneFactory {

	@SuppressWarnings("unchecked")
	abstract public <T> Plane createPlane(T... args);

}
