import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		ArrayList<Car> cars = populateCarList();

		int carChoice = 0;

		//Run the app until user enters exit condition
		while (carChoice <= cars.size()) {

			printCars(cars);
			System.out.println();

			carChoice = selectCar(scnr, cars);
			System.out.println();
			
		}
		System.out.println("Program quit.");

	}

	public static ArrayList<Car> populateCarList() {		
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Nikolai", "Model S", 2017, 54999.90));
		cars.add(new Car("Fourd", "Escapade", 2017, 31999.90));
		cars.add(new Car("Chewie", "Vette", 2017, 44989.90));
		cars.add(new UsedCar("Hyonda", "Prior", 2015, 14795.5, 35987.6));
		cars.add(new UsedCar("GC", "Chirpus", 2013, 8500, 12345));
		cars.add(new UsedCar("GC", "Witherell", 2013, 2016, 3500.3));
		return cars;
	}

	public static int selectCar(Scanner scnr, ArrayList<Car> cars) {
		
		int carChoice;
		carChoice = Validator.getInt(scnr, "Which car would you like? ", 1, cars.size() + 1);

		//Execute following code if user doesn't exit
		if (carChoice <= cars.size()) {

			//Show user the chosen car
			System.out.println(cars.get(carChoice - 1).toString());
			
			//Ask if user wants to buy chosen car
			String buyChoice = Validator.getString(scnr, "Would you like to buy this car? (y/n) ");
			
			//If yes, remove chosen car from list of cars
			if (buyChoice.equalsIgnoreCase("y")) {
				System.out.println("Excellent! Our finance department will be in touch shortly.");
				cars.remove(carChoice - 1);
				carChoice--;			
			} else {
				System.out.println("Okay. Here is the list of the rest of our vehicles.");
			}
		}
		return carChoice;
	}

	public static void printCars(ArrayList<Car> cars) {
		//Loop through each car in array
		for (int i = 1; i <= cars.size(); i++) {
			//print each element
			System.out.print(i + ". ");
			System.out.println(cars.get(i - 1).toString());
			//print option to exit when index reaches end of the array
			if (i == cars.size()) {
				System.out.println((cars.size() + 1) + ". Quit");
			}
		}
	}
}
