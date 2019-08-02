import java.util.Date;


public class Bill {
	private int BillID;
	private Date BillDate;
	private String BillType;
	private double BillAmount;
	
	public Bill(int bID, Date bDate, String bType, double bAmount)
	{
		this.BillID=bID;
		this.BillDate=bDate;
		this.BillType=bType;
		this.BillAmount=bAmount;
		
	}

	public int getBillID() {
		return BillID;
	}

	public void setBillID(int billID) {
		BillID = billID;
	}

	public Date getBillDate() {
		return BillDate;
	}

	public void setBillDate(Date billDate) {
		BillDate = billDate;
	}

	public String getBillType() {
		return BillType;
	}

	public void setBillType(String billType) {
		BillType = billType;
	}

	public double getBillAmount() {
		return BillAmount;
	}

	public void setBillAmount(double billAmount) {
		BillAmount = billAmount;
	}
	
	public String billDisplay()
	{
		return "";
		
	}
	

}
