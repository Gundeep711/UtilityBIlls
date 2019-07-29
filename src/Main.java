import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Customer c1 = new Customer(1, "Gundeep", "Singh", "Gundeep Singh", "gundeep.singh@gmail.com");
		c1.insertBill(new Mobile(1, new Date(), "Mobile", 45, "Samsung S10", "Prepaid", "4372243041", 3.5, 50));
		ArrayList<Customer> customer =new ArrayList<Customer>();
		customer.add(c1);
		c1.display();
	}

	

}
