package view;

import java.util.List;

import controller.LogicClass;
import controller.PlaneFuelComparator;
import controller.PlaneRangeComparator;

import entity.AirlinerFactory;
import entity.Airport;
import entity.FreighterFactory;
import entity.Plane;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AirlinerFactory af = new AirlinerFactory();
		FreighterFactory ff = new FreighterFactory();
		//add entries to the list
		Airport air = Airport.getInstance();
		air.setPlane(af.createPlane("'Tu-134'", 300, 1000, 400));
		air.setPlane(ff.createPlane("'Boeing'", 1301, 1500, 260));
		air.setPlane(ff.createPlane("'Airbus A310'", 1500, 500, 490));
		air.setPlane(af.createPlane("'Douglas DC-3'", 450, 600, 900));
		air.setPlane(ff.createPlane("'Boeing 737'", 1200, 3000, 310));

		List<Plane> planes = air.getPlane();
		//
		System.out.println(air.getPlane().get(0));
		int c = LogicClass.capacity(air);

		System.out.println("--------------------- ");

		System.out.println("Capacity: " + c);
		int s = LogicClass.seats(air);
		System.out.println("Seating: " + s);

		System.out.println("--------------------- ");

		PlaneFuelComparator pFC = new PlaneFuelComparator();
		for (Plane p : LogicClass.sortPlains(pFC, planes)) {
			System.out.println(p.getName() + " " + p.getFuelConsumption());
		}

		System.out.println("--------------------- ");

		PlaneRangeComparator pRC = new PlaneRangeComparator();
		for (Plane p : LogicClass.sortPlains(pRC, planes)) {
			System.out.println(p.getName() + " " + p.getRange());
		}
		System.out.println("--------------------- ");

		for (Plane p : LogicClass.findPlanesByFuel(air, 1000, 1300)) {
			System.out.println("Name: "
					+ (p.getName() + "\n" + "Fuel Consumption: " + p
							.getFuelConsumption()));

		}
	}
}
