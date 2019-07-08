package mangolost.msgqueue.kafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "mangolost.msgqueue")
public class KafkaProducer {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducer.class, args);
    }

}
