import java.util.ArrayList;
import java.util.Date;

public class Main {
	static ArrayList<Customer> customer = new ArrayList<Customer>();

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1, "Gundeep", "Singh", "Gundeep Singh", "gundeep.singh@gmail.com");
		c1.insertBill(new Mobile(1, new Date(), "Mobile", 45, "Samsung S10", "Prepaid", "4372243041", 3.5, 50));
		c1.insertBill(new Hydro(2, new Date(), "Hydro", 150, "ABC", 47));
		c1.insertBill(new Internet(4, new Date(), "Internet", 160, "Rogers", 13));

		Customer c2 = new Customer(3, "Babbu", "Maan", "Babbu Maan", "babbu.maan@panjabrecords.com");
		c2.insertBill(new Internet(21, new Date(), "Internet", 250, "Bell", 25));
		c2.insertBill(new Hydro(13, new Date(), "Hydro", 220, "Toronto Hydro", 110));

		Customer c3 = new Customer(4, "Sharry", "Maan", "Sharry Maan", "sharry.maan@gmail.com");

		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		/*
		 * c1.display(); c2.display(); c3.display();
		 */
		
		for(int i=0;i<customer.size();i++)
		{
			customer.get(i).display();
			
		}
		sortingOfCustomers(customer);
		getCustomerByID(124);
	}

	public static ArrayList<Customer> sortingOfCustomers(ArrayList<Customer> list) {

		int i, j, minimum;

		for (i = 0; i < list.size() - 1; i++) {
			minimum = i;
			for (j = i + 1; j < list.size(); j++)
				if (list.get(j).getCustomerID() < list.get(minimum).getCustomerID()) {
					minimum = j;
				}
			// Swapping
			Customer temp = list.get(i);
			list.set(i, list.get(minimum));
			list.set(minimum, temp);

		}
		return list;

	}
	
	public static void getCustomerByID(int ID)
	{
		int foundIndex = -1;
		for (int i=0;i<customer.size();i++)
		{
			if(ID==customer.get(i).getCustomerID())
			{
				System.out.println("Found a customer of ID " + ID);
				foundIndex = i;
			}
		}
		
		if(foundIndex>0) {
			customer.get(foundIndex).display();
		} else {
			System.out.println("Customer doesn't Exist with such ID!");
		}
	}

}
