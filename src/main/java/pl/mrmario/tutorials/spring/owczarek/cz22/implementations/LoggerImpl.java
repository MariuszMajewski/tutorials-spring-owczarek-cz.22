package pl.mrmario.tutorials.spring.owczarek.cz22.implementations;

import java.util.Date;
import org.springframework.stereotype.Service;
import pl.mrmario.tutorials.spring.owczarek.cz22.api.Logger;

@Service
public class LoggerImpl implements Logger {
	public void log(String message) {
		System.out.println(new Date() + " : " + message);
	}
}
