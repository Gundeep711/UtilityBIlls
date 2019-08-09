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
		this.bList = new ArrayList<Bill>();

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

	public void sortbillAmount() {

		for (int i = 1; i < this.bList.size(); i++) {

			for (int j = i; j > 0; j--) {
				if (this.bList.get(j).getBillAmount() < this.bList.get(j - 1).getBillAmount()) {
					Bill temp = this.bList.get(j);
					this.bList.set(j, this.bList.get(j - 1));
					this.bList.set(j - 1, temp);

				}
			}
		}

	}
	
	
	@Override
	public void display() {
		calculateBill();
		System.out.println("Customer Id : " + this.getCustomerID() + "\nCustomer Full Name : " + this.getFullName()
				+ "\nCustomer Email ID : " + this.getCustomerID() + "\n");
		System.out.println("Bill Details :::\n");
		if (bList.size() > 0) {
			this.sortbillAmount();
			for (int i = 0; i < bList.size(); i++) {
				if (bList.size() > 0) {
					System.out.println(bList.get(i).billDisplay());

				}
			}
			System.out.println("\n************************************");
			System.out.println("Total Bill Amount : " + this.getTotalAmount());
			System.out.println("\n************************************\n");

		}

		else {
			System.out.println("Note :: There is no outstading bill !!");
			System.out.println("************************************\n");
		}
	}
	
	

}
