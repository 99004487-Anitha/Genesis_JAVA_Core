public class Employee {

	private String name;
	private String address;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getAddress() {
		
		return address;
	}
	public void setAddress(String address) {
		System.out.println("Enter Adress:");
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		System.out.println("Enter Mobile:");
		this.mobile = mobile;
	}
		
	
	
	
}
