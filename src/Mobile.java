import java.util.Date;

public class Mobile extends Bill {

	private String ManufacturerName;
	private String PlanName;
	private String MobileNumber;
	private double DataUsed;
	private double MinuteUsed;

	public Mobile(int bID, Date bDate, String bType, double bAmount, String Mname, String Pname, String Mnumber,
			double dUsage, double Musage) {
		super(bID, bDate, bType, bAmount);
		this.ManufacturerName = Mname;
		this.PlanName = Pname;
		this.MobileNumber = Mnumber;
		this.DataUsed = dUsage;
		this.MinuteUsed = Musage;
	}

	public String getManufacturerName() {
		return ManufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		ManufacturerName = manufacturerName;
	}

	public String getPlanName() {
		return PlanName;
	}

	public void setPlanName(String planName) {
		PlanName = planName;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public double getDataUsed() {
		return DataUsed;
	}

	public void setDataUsed(double dataUsed) {
		DataUsed = dataUsed;
	}

	public double getMinuteUsed() {
		return MinuteUsed;
	}

	public void setMinuteUsed(double minuteUsed) {
		MinuteUsed = minuteUsed;
	}

	public String billDisplay() {
		String MobileBillDetails = "" + "Bill Id : " + this.getBillID() + "\n" + "	Bill Date : "
				+ this.getBillDate() + "\n" + "	Bill Type : " + this.getBillType() + "\n" + "	Bill Amount : $"
				+ this.getBillAmount() + "\n" + "	Manufacturer Name : " + this.getManufacturerName() + "\n"
				+ "	Plan Name : " + this.getPlanName() + "\r\n" + "	Mobile Number : +" + this.getMobileNumber()
				+ "\n" + "	Internet Usage : " + this.getDataUsed() + " GB\n" + "	Minutes Usage : "
				+ this.getMinuteUsed() + " minutes\n";

		return MobileBillDetails;
	}

}
