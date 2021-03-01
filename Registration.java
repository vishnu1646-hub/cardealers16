package car.reg;

import java.util.Scanner;
import java.util.TreeSet;

import car.info.JaguarLandRover;
import car.info.NoNumericException;

public class Registration {
	static Scanner scanner = new Scanner(System.in);

	public static String regYour() throws Exception {
		TreeSet<String> ts = new TreeSet();
		ts.add("vishnu");
		ts.add("balaji");
		ts.add("ajay");
		ts.add("pavan");
		ts.add("srikanth");
		ts.add("poorna");
		String name = scanner.nextLine();
		if (Character.isDigit(name.charAt(0))) {
			throw new NoNumericException("NoNumericValueException");
		}

		if (ts.contains(name)) {
			System.out.println("Hello " + name + " welcome to JLR ");
			return name;
		} else {
			System.out.println("I think you are new here ");
			System.out.println("please register your name now :");
			String s = scanner.nextLine();
			ts.add(s);
			System.out.println("STATUS : you have successfully created your account " + s);
			System.out.println("welcome to JLR Mr/Mrs/Ms:" + s);
			return s;
		}

	}

}
