import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainApp {
	public static void main(String[] arg){
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		Persion p=(Persion)co.getBean("persion");
		System.out.println(p);
	}

}
