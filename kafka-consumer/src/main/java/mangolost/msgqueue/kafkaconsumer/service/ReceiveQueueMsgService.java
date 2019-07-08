package mangolost.msgqueue.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiveQueueMsgService {

	@KafkaListener(topics = "topic1")
	public void processMessage(String content) {
		System.out.println(content);
	}
}
