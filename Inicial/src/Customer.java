import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String customerName;
	private Vector rentals = new Vector();


	public Customer(String customerName) {
		this.customerName = customerName;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}

	public String getName() {
		return customerName;
	}

	public String generate() {
		
		Enumeration rentals = this.rentals.elements();
		String result = "Rental Record for " + getName() + "\n";

		while (rentals.hasMoreElements()) {
			
			Rental each = (Rental) rentals.nextElement();

			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getAmount()) + "\n";
			
		}

		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

		return result;
	}

	private double getTotalAmount() {
		 double result = 0;
		 Enumeration rentals = this.rentals.elements();
		 while (rentals.hasMoreElements()) {
		 Rental each = (Rental) rentals.nextElement();
		 result += each.getAmount();
		 }
		 return result;
		 }
	
	private int getTotalFrequentRenterPoints(){
		 int result = 0;
		 Enumeration rentals = this.rentals.elements();
		 while (rentals.hasMoreElements()) {
		 Rental each = (Rental) rentals.nextElement();
		 result += each.getFrequentRenterPoints();
		 }
		 return result;
		 }
	

	public double getTotal() {
		return getTotalAmount();
	}

	public int getFrequentRenterPoints() {
		return getTotalFrequentRenterPoints();
	}
}
