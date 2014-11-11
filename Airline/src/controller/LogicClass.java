package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Airliner;
import entity.Airport;
import entity.Freighter;
import entity.Plane;

public class LogicClass {

	public static List<Plane> sortPlains(Comparator<Plane> comparator,
			List<Plane> list) {
		List<Plane> planes = new ArrayList<Plane>(list);
		Collections.sort(planes, comparator);
		return Collections.unmodifiableList(planes);

	}

	public static int seats(Airport air) {
		int seats = 0;
		List<Plane> airliner = new ArrayList<>();
		for (int i = 0; i < airliner.size(); i++)

		{
			if (airliner.get(i) instanceof Airliner) {
				Airliner fr = (Airliner) airliner.get(i);
				seats += fr.getSeats();
			}
		}
		return seats;
	}

	public static List<Plane> findPlanesByFuel(Airport air, int lowValueFuel,
			int highValueFuel) {
		List<Plane> listPlanes = air.getPlane();
		List<Plane> list = new ArrayList<>();

		for (Plane planes : listPlanes) {

			if ((planes.getFuelConsumption() >= lowValueFuel)
					&& (planes.getFuelConsumption() <= highValueFuel)) {
				list.add(planes);

			}
		}

		return Collections.unmodifiableList(list);

	}

	public static int capacity(Airport air) {
		int capacity = 0;
		// List<Plane> freighter = air.getPlane();
		// for (int i = 0; i < freighter.size(); i++)
		//
		// {
		// if (freighter.get(i) instanceof Freighter) {
		// Freighter fr = (Freighter) freighter.get(i);
		// capacity += fr.getCapacity();
		// }
		// }

		return capacity;
	}
}
