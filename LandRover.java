package car.info;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class LandRover implements Vehicle {
	String customerName;
	static Scanner scanner = new Scanner(System.in);

	public LandRover(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void getCarDetails() {
		TreeMap<String, String> map = new TreeMap();
		map.put("101a", "velar");
		map.put("102b", "vogue");
		map.put("103c", "discovery");
		map.put("104d", "defender");
		System.out.println("LAND ROVER : available car details  ");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Car id :" + entry.getKey() + ", model : " + entry.getValue());

		}
		try {
			commute(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void commute(TreeMap<String, String> map) throws Exception {
		System.out.println("enter the id or model name of a car you require :");
		String s2 = scanner.nextLine();
		String s21 = "";

		for (Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(s2)) {
				s21 = entry.getKey();
				break;
			} else {
				s21 = s2;
			}

		}

		String s1 = s21;
		String s = s1.toLowerCase();
		if (map.containsKey(s)) {
			System.out.println("car id :" + s + " and model name : " + map.get(s) + " is delivered ");
			System.out.println();
			System.out.println("--------receipt--------");
			System.out.println("car info     : LandRover " + map.get(s));
			System.out.println("Delivered to :" + this.customerName);
			System.out.println();
		} else {
			throw new NoCar("NoSuchLandRoverCarException");
		}
		map.remove(s);
		System.out.println("LAND ROVER : remaining available car details  ");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Car id :" + entry.getKey() + ", model : " + entry.getValue());

		}
		Thread.sleep(2000);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
