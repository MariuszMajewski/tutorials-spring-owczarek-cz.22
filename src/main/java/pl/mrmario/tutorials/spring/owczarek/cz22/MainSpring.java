package pl.mrmario.tutorials.spring.owczarek.cz22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.mrmario.tutorials.spring.owczarek.cz22.api.UsersRepository;

/**
 * @author Artur Owczarek
 * 	MrMario108
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		UsersRepository userRep = context.getBean("usersRepositoryImpl", UsersRepository.class);
		userRep.createUser("Janek");
	}
}