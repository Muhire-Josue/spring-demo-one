package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Sport theSport = context.getBean("mySport",Sport.class);
		System.out.println(theSport.getSport());
		context.close();

	}

}
