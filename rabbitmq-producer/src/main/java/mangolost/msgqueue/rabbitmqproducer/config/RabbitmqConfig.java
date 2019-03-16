package mangolost.msgqueue.rabbitmqproducer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置rabbitmq
 */
@Configuration
public class RabbitmqConfig {

	/**
	 * 定义队列名
	 */
	public final static String QUEUE_NAME1 = "queue1";


	/**
	 * 定义队列queue1
	 *
	 * @return
	 */
	@Bean
	public Queue queue1() {
		return new Queue(QUEUE_NAME1);
	}

}
