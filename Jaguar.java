package car.info;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Jaguar implements Vehicle {
	static Scanner scanner = new Scanner(System.in);
	String customerName;

	public Jaguar(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void getCarDetails() {
		Map<String, String> map = new TreeMap<>();
		map.put("105e", "f-type");
		map.put("106f", "xf");
		map.put("107g", "f-pace");
		map.put("108h", "xe");
		System.out.println("Jaguar : available car details ");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Car id :" + entry.getKey() + ", model :" + entry.getValue());
		}
		try {
			commute(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void commute(Map<String, String> map) throws Exception {
		System.out.println("enter the id or model name of a car you require :");
		String sJaguar = scanner.nextLine();
		String sJ = "";
		for (Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equalsIgnoreCase(sJaguar)) {
				sJ = entry.getKey();
				break;
			} else {
				sJ = sJaguar;
			}
		}
		String s1 = sJ;
		String s = s1.toLowerCase();
		if (map.containsKey(s)) {
			System.out.println("car id :" + s + " and model name : " + map.get(s) + " is delivered ");
			System.out.println();
			System.out.println("--------receipt--------");
			System.out.println("car info     : Jaguar " + map.get(s));
			System.out.println("Delivered to :" + this.customerName);
			System.out.println();
		} else {
			throw new NoCar("NoSuchJaguarCarException");
		}
		map.remove(s);
		System.out.println("Jaguar : available car details  ");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Car id :" + entry.getKey() + ", model : " + entry.getValue());

		}

	}

}
