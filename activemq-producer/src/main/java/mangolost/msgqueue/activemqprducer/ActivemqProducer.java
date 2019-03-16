package mangolost.msgqueue.activemqprducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mangolost.msgqueue")
public class ActivemqProducer {
	public static void main(String[] args) {
		SpringApplication.run(ActivemqProducer.class, args);
	}
}
