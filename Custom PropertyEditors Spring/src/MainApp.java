import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		Persion persion=(Persion)co.getBean("persion");
		System.out.println(persion);
		PersionType  p=persion.getType();
		System.out.println(p.getTypeName());
		System.out.println(p.getClass());
	}

}
