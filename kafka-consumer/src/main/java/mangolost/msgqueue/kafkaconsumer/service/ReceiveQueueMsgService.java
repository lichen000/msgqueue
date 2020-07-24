package mangolost.msgqueue.kafkaconsumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 *
 */
@Service
public class ReceiveQueueMsgService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReceiveQueueMsgService.class);

	@KafkaListener(topics = "topic1")
	public void processMessage1(String content) {
		LOGGER.info("get message from topic:topic1, message: {}", content);
	}

	@KafkaListener(topics = "streams-pipe-output")
	public void processMessage2(String content) {
		LOGGER.info("get message from topic:streams-pipe-output, message: {}", content);
	}

	@KafkaListener(topics = "streams-linesplit-output")
	public void processMessage3(String content) {
		LOGGER.info("get message from topic:streams-linesplit-output, message: {}", content);
	}

	@KafkaListener(id = "${spring.kafka.consumer.group-id}", topics = "streams-wordcount-output", containerFactory = "myFactory")
	public void processMessage4(ConsumerRecord<String, Long> record) {
		LOGGER.info("get message from topic:streams-wordcount-output, message: {} -> {}", record.key(), record.value());
	}
}
