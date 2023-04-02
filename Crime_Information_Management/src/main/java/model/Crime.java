package model;

public class Crime {
	
	private String criminalName;
	private String crimeDetails;
	private int crime_Id;
	private long mob_no;
	

	public Crime() {
		// TODO Auto-generated constructor stub
	}


	public Crime(String criminalName, String crimeDetails, int crime_Id, long mob_no) {
		super();
		this.criminalName = criminalName;
		this.crimeDetails = crimeDetails;
		this.crime_Id = crime_Id;
		this.mob_no = mob_no;
	}


	public String getCriminalName() {
		return criminalName;
	}


	public void setCriminalName(String criminalName) {
		this.criminalName = criminalName;
	}


	public String getCrimeDetails() {
		return crimeDetails;
	}


	public void setCrimeDetails(String crimeDetails) {
		this.crimeDetails = crimeDetails;
	}


	public int getCrime_Id() {
		return crime_Id;
	}


	public void setCrime_Id(int crime_Id) {
		this.crime_Id = crime_Id;
	}


	public long getMob_no() {
		return mob_no;
	}


	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}


	@Override
	public String toString() {
		return "Crime [criminalName=" + criminalName + ", crimeDetails=" + crimeDetails + ", crime_Id=" + crime_Id
				+ ", mob_no=" + mob_no + "]";
	}
	

}
