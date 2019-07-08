package mangolost.msgqueue.kafkaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mangolost.msgqueue")
public class KafkaConsumer {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumer.class, args);
    }
}
