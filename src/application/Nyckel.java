package application;

public class Nyckel {
	Anställd anställd; //behövs dubbelkollpling?
	private String nyckelID;
	
	public String getNyckelID() {
		return nyckelID;
	}
	public void setNyckelID(String nyckelID) {
		this.nyckelID = nyckelID;
	}
}
