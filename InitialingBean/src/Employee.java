import org.springframework.beans.factory.InitializingBean;


public class Employee implements InitializingBean {
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean is initailing");
	}

}
