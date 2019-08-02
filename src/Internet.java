import java.util.Date;

public class Internet extends Bill {

	private String ProviderName;
	private double usage;

	public Internet(int bID, Date bDate, String bType, double bAmount, String Pname, double IntUsage) {
		super(bID, bDate, bType, bAmount);
		this.ProviderName = Pname;
		this.usage = IntUsage;
	}

	public String getProviderName() {
		return ProviderName;
	}

	public void setProviderName(String providerName) {
		ProviderName = providerName;
	}

	public double getUsage() {
		return usage;
	}

	public void setUsage(double usage) {
		this.usage = usage;
	}

	public String billDisplay() {
		String InternetbillDetails = "Bill Id : " + this.getBillID() + "\r\n" + "	Bill Date : " + this.getBillDate()
				+ "\r\n" + "	Bill Type : " + this.getBillType() + "\r\n" + "	Bill Amount : $" + this.getBillAmount()
				+ "\r\n" + "	Provider Name : " + this.getProviderName() + "\r\n" + "	Internet Usage : "
				+ this.getUsage() + " GB";

		return InternetbillDetails;
	}

}
