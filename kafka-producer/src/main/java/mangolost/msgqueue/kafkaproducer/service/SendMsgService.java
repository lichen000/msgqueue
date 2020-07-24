package mangolost.msgqueue.kafkaproducer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class SendMsgService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SendMsgService.class);

	private static final String topic = "streams-plaintext-input";

	private final KafkaTemplate kafkaTemplate;

	@Autowired
	public SendMsgService(KafkaTemplate kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	/**
	 * @param content
	 */
	public void sendTopic(String content) {
		kafkaTemplate.send(topic, content);
		LOGGER.error(content);
	}

}
