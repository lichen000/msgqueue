package mangolost.msgqueue.rabbitmqproducer.service;

import mangolost.msgqueue.rabbitmqproducer.config.RabbitmqConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMsgService {

	private final AmqpTemplate rabbitTemplate;

	@Autowired
	public SendMsgService(AmqpTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	/**
	 * @param content
	 * @return
	 */
	public void sendQueue(String content) {

		// 第一个参数为刚刚定义的队列名称
		rabbitTemplate.convertAndSend(RabbitmqConfig.QUEUE_NAME1, content);
	}

}
