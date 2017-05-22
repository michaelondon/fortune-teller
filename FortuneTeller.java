import java.util.Scanner;
import java.text.*;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);


		// Part 1
		System.out.println("Enter your first name:");
		String firstName = input.next();

		System.out.println("Enter your last name:");
		String lastName = input.next();

		System.out.println("What is your age?");
		int age = input.nextInt();

		System.out.println("Enter your numerical birth month?");
		int month = input.nextInt();

		System.out.println(
				"Enter your favorite ROYGBIV color, \n*if you need assistance type “Help” to get a list of the ROYGBIV colors");
		String color = input.next();
		if (color.equalsIgnoreCase("help")) {
			System.out.println(
					"R=Red\nO=Orange\nY=Yellow\nG=Green\nB=Blue\nI=Ingigo\nV=Violet\nPlease input your favorite color");
			color = input.next();
		}
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		// Part 2
		int retirementAge;
		String vacationHome = " ";
		String transportation;
		String bankBalance = null;

		// Retirement
		if (age % 2 == 0) {
			retirementAge = 12;
		} else {
			retirementAge = 14;
		}

		// Vacation Home
		if (siblings == 0) {
			vacationHome = "Boca Raton, FL";
		}

		else if (siblings == 1) {
			vacationHome = "Nassau, Bahamas.";
		} else if (siblings == 2) {
			vacationHome = "Ponta Negra,Brazil.";
		} else if (siblings == 3) {
			vacationHome = "Ponta Portland, Oregon.";
		} else if (siblings > 3) {
			vacationHome = "Ponta Baton Rouge, LA.";
		}

		// Mode of Transportation
		if (color.equals("red") || color.equals("r")) {
			transportation = "Maserati";
		} else if (color.equals("orange") || color.equals("o")) {
			transportation = "Stallion";
		} else if (color.equals("yellow") || color.equals("y")) {
			transportation = "Chariot";
		} else if (color.equals("green") || color.equals("g")) {
			transportation = "Taxi";
		} else if (color.equals("blue") || color.equals("b")) {
			transportation = "Rickshaw";
		} else if (color.equals("indgo") || color.equals("i")) {
			transportation = "Vispa motor scooter";
		} else if (color.equals("violet") || color.equals("v")) {
			transportation = "Flying Saucer";
		}

		// Bank Balance
		if (month < 4) {
			DecimalFormat myFormatter = new DecimalFormat("###,###.##");
			bankBalance = myFormatter.format(256000.76);

		}

		else if (month < 8) {
			DecimalFormat myFormatter = new DecimalFormat("#,###,###.##");
			bankBalance = myFormatter.format(3687105.42);

		}

		else if (month < 12) {
			bankBalance = "86.23";
		}

		else {
			bankBalance = "0.00";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " with $" + bankBalance
				+ " in the bank, \nand a vacation home in " + vacationHome + " and travel by " + transportation);

	}
}