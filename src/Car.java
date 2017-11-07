import java.text.DecimalFormat;

public class Car {
	String make;
	String model;
	int year;
	double price;
	
	public Car() {
	}

	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String formatPrice() {
		DecimalFormat format = new DecimalFormat("$0.00");
		return format.format(price);
	}
	
	@Override
	public String toString() {
		return String.format("%-12s%-12s%-12d%-12s", make, model, year, formatPrice());
	}
	
}
