package mangolost.msgqueue.rabbitmqproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mangolost.msgqueue")
public class RabbitmqProducer {
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducer.class, args);
	}
}
