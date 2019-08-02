import java.util.Date;

public class Hydro extends Bill {

	
	private String AgencyName;
	private double UnitConsumed;

	public Hydro(int bID, Date bDate, String bType, double bAmount, String Agency, double Unit) {
		super(bID, bDate, bType, bAmount);
		this.AgencyName = Agency;
		this.UnitConsumed = Unit;

	}

	public String getAgencyName() {
		return AgencyName;
	}

	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}

	public double getUnitConsumed() {
		return UnitConsumed;
	}

	public void setUnitConsumed(double unitConsumed) {
		UnitConsumed = unitConsumed;
	}

	public String billDisplay() {

		String HydroDisplay = "Bill Id : " + this.getBillID() + "\r\n" + "	Bill Date : " + this.getBillType() + "\r\n"
				+ "	Bill Type : " + this.getBillAmount() + "\r\n" + "	Bill Amount : $" + this.getBillAmount() + "\r\n"
				+ "	Agency Name : " + this.getAgencyName() + "\r\n" + "	Unit Consumed : " + this.getUnitConsumed()
				+ " Units\r\n";

		return HydroDisplay;
	}

}
