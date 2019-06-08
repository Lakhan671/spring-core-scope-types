import org.springframework.beans.factory.DisposableBean;


public class Employee implements DisposableBean{
	private String name;
	private String address;
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
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("do some destruction work close connection.");
		
	}
	
	

}
