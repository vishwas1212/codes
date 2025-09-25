package olddsamixcodes.demo;

public class CloneableAddress {

	private int addressId;
	private String country;
	private String city;
	private int zipcode;

	/*
	 * public CloneableAddress() { super(); // TODO Auto-generated constructor stub
	 * }
	 */
	public CloneableAddress(int addressId, String country, String city, int zipcode) {
		super();
		this.addressId = addressId;
		this.country = country;
		this.city = city;
		this.zipcode = zipcode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "CloneableAddress [addressId=" + addressId + ", country=" + country + ", city=" + city + ", zipcode="
				+ zipcode + "]";
	}
	
	

}
