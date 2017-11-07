import java.text.DecimalFormat;

public class UsedCar extends Car {

	double mileage;

	public UsedCar() {

	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String usedCarPrice() {
		DecimalFormat formatPrice = new DecimalFormat("$0,000.00");
		DecimalFormat formatMiles = new DecimalFormat("0.0");

		return formatPrice.format(price) + " (Used) " + formatMiles.format(mileage) + " miles";
	}

	@Override
	public String toString() {
		return String.format("%-12s%-12s%-12d%-12s", make, model, year, usedCarPrice());
	}

}
