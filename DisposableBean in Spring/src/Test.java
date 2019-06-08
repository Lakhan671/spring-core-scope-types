import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
	    co.registerShutdownHook();
		Employee employee=(Employee)co.getBean("employee");
		System.out.println(employee);
	
	}

}
