package olddsamixcodes.immutable;

public class Address implements Cloneable{

	private String address;

	public Address() {
		super();
	
	}

	public Address(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
	      return super.clone();
	   }

}
