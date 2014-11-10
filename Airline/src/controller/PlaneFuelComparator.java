package controller;

import java.util.Comparator;

import entity.Plane;

public class PlaneFuelComparator implements Comparator<Plane> {

	@Override
	public int compare(Plane arg0, Plane arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compare(Plane p1, Plane p2) {
//
//		int fuel1 = p1.getFuelConsumption();
//		int fuel2 = p2.getFuelConsumption();
//
//		if (fuel1 < fuel2) {
//			return -1;
//		} else if (fuel1 == fuel2) {
//			return 0;
//		} else {
//			return 1;
//		}
//	}
}
