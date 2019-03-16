package mangolost.msgqueue.rabbitmqconsumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReceiveQueueMsgService {

	/**
	 * @param text
	 */
	@RabbitListener(queues = "queue1")
	public void receiveQueue1(String text) {
		System.out.println(Thread.currentThread().getName() + " Queue1收到的报文为:" + text + "time:" + new Date(System.currentTimeMillis()));
	}
}
