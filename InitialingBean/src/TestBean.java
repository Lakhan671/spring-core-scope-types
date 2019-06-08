import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBean {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		Employee e=(Employee)co.getBean("employee");
		System.out.println(e);
	}

}
