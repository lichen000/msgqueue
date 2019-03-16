package mangolost.msgqueue.activemqconsumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReceiveTopicMsgService {

	/**
	 * @param text
	 */
	@JmsListener(destination = "topic1", containerFactory = "topicListenerFactory")
	public void receiveTopic1(String text) {
		System.out.println(Thread.currentThread().getName() + " Topic1收到的报文为:" + text + "time:" + new Date(System.currentTimeMillis()));
//        try {
//            Thread.sleep(500000);//用于检查两个方法是否各自独自进行互不干扰
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
	}

	/**
	 * @param text
	 */
	@JmsListener(destination = "topic2", containerFactory = "topicListenerFactory")
	public void receiveTopic2(String text) {
		System.out.println(Thread.currentThread().getName() + " Topic2收到的报文为:" + text + "time:" + new Date(System.currentTimeMillis()));
//        try {
//            Thread.sleep(7000); //用于检查两个方法是否各自独自进行互不干扰
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
	}

	//实验表明，两个方法按照各自队列依次获取消息，互相不干扰
}
