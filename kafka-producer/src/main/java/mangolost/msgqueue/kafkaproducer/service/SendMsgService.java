package mangolost.msgqueue.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendMsgService {

	private final KafkaTemplate kafkaTemplate;

	@Autowired
	public SendMsgService(KafkaTemplate kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	/**
	 * @param content
	 */
	public void sendTopic(String content) {
		kafkaTemplate.send("topic1", content);
		System.out.println("aaaa");
	}

}
