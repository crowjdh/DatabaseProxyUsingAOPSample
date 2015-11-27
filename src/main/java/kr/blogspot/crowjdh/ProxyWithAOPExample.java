package kr.blogspot.crowjdh;

import kr.blogspot.crowjdh.model.database.Database;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyWithAOPExample {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Database database = (Database) context.getBean("databaseProxy");
		database.save("qwerasdf");
		System.out.println("\n");
		System.out.println(database.load());
		context.close();
	}
}
