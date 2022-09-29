package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		ProductService s= (ProductService) context.getBean("service");
		
		System.out.println(s.multiply(10,20));
		s.display();
		

	}

}
