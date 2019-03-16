package mangolost.msgqueue.activemqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mangolost.msgqueue")
public class ActivemqConsumer {
	public static void main(String[] args) {
		SpringApplication.run(ActivemqConsumer.class, args);
	}
}
