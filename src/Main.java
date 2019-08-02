import java.util.ArrayList;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customer =new ArrayList<Customer>();
		Customer c1 = new Customer(1, "Gundeep", "Singh", "Gundeep Singh", "gundeep.singh@gmail.com");
		c1.insertBill(new Mobile(1, new Date(), "Mobile", 45, "Samsung S10", "Prepaid", "4372243041", 3.5, 50));
		c1.insertBill(new Hydro(2,new Date(),"Hydro",150,"ABC",47));
		c1.insertBill(new Internet(4, new Date(), "Internet", 150, "Rogers", 13));
		
		Customer c2=new Customer(3,"Babbu","Maan","Babbu Maan","babbu.maan@panjabrecords.com");
		c2.insertBill(new Internet(21,new Date(),"Internet",210,"Bell",25));
		c2.insertBill(new Hydro(13,new Date(),"Hydro",220,"Toronto Hydro",110));
		
		Customer c3=new Customer(4,"Sharry","Maan","Sharry Maan","sharry.maan@gmail.com");
		
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		c1.display();
		c2.display();
		c3.display();
	}

	

}
