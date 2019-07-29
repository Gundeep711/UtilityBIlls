import java.util.ArrayList;
import java.util.Date;

public class Customer implements IDisplay {

	private int CustomerID;
	private String Fname;
	private String Lname;
	private String FullName;
	private String EmailID;
	private ArrayList<Bill> bList;
	private double TotalAmount;

	public Customer(int cID, String fname, String lname, String fullName, String email) {
		this.CustomerID = cID;
		this.Fname = fname;
		this.Lname = lname;
		this.FullName = fullName;
		this.EmailID = email;
		this.bList=new ArrayList<Bill>();

	}

	public void insertBill(Bill bill) {
		this.bList.add(bill);

	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getEmailID() {
		return EmailID;
	}

	public void setEmailID(String emailID) {
		EmailID = emailID;
	}

	public double getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}

	public void calculateBill() {
		double total = 0;
		for (int i = 0; i < bList.size(); i++) {

			total += this.bList.get(i).getBillAmount();

		}
		
		this.setTotalAmount(total);
	}

	@Override
	public void display() {
		for(int i=0;i<bList.size();i++) {
			System.out.println(bList.get(i).billDisplay());
		}

	}

}
