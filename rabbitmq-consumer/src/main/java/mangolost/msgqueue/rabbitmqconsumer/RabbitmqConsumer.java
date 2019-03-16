package mangolost.msgqueue.rabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mangolost.msgqueue")
public class RabbitmqConsumer {
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqConsumer.class, args);
	}
}
