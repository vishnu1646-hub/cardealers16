package car.info;

import java.util.Scanner;

import java.util.TreeMap;

import car.reg.Registration;

public class JaguarLandRover {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		System.out.println("///////***WELCOME TO PRIDE MOTORS***///////");
		System.out.println("please enter customer name :");
		String s = Registration.regYour();
		System.out.println("-----Showing JLR info------");
		LandRover l = new LandRover(s);
		l.getCarDetails();
		Thread.sleep(3000);
		System.out.println();
		System.out.println("********Welcome to Jaguar********");
		System.out.println();
		Jaguar j = new Jaguar(s);
		j.getCarDetails();

	}

}
