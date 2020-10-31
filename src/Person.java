public class Person {
	
	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return fName + "\t\t" + lName + "\t\t" + address + "\t\t" + city + "\t\t" + state + "\t\t" + zip + "\t\t" + phone;
	}
}
