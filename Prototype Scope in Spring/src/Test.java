import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("Spring.xml");
		B bb=(B)co.getBean("b");
		System.out.println(bb);
		B bbb=(B)co.getBean("b");
		System.out.println(bbb);
		C cc=(C)co.getBean("c");
		System.out.println(cc);
	}

}
