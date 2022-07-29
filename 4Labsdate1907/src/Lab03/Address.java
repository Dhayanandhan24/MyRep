package Lab03;

public class Address {
	private String street;
	private String Area;
	private String City;
	private String State;
	private Company company;
	
	public Address(String street, String area, String city, String state) {
		super();
		this.street = street;
		Area = area;
		City = city;
		State = state;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", Area=" + Area + ", City=" + City + ", State=" + State + ", company="
				+ company + "]";
	}
	

	}
	
