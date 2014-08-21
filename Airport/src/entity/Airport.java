package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airport {

	private List<Plane> planeList;
	private static Airport instance;

	public static Airport getInstance() {
		if (instance == null) {
			instance = new Airport();
		}
		return instance;

	}

	public Airport() {
		planeList = new ArrayList<Plane>();
	}

	public List<Plane> getPlane() {
		return Collections.unmodifiableList(planeList);
	}

	public void setPlane(List<Plane> planeList) {
		this.planeList = planeList;

	}
	
	public void setPlane(Plane plane) {
		this.planeList.add(plane);

	}
	
}
