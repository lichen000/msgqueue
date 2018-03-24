package mangolost.msgqueue.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReceiveQueueMsgService {

    /**
     *
     * @param text
     */
    @JmsListener(destination = "queue1", containerFactory="queueListenerFactory")
    public void receiveQueue1(String text) {
        System.out.println(Thread.currentThread().getName() + " Queue1收到的报文为:" + text + "time:" +  new Date(System.currentTimeMillis()));
//        try {
//            Thread.sleep(5000);//用于检查两个方法是否各自独自进行互不干扰
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    /**
     *
     * @param text
     */
    @JmsListener(destination = "queue2", containerFactory="queueListenerFactory")
    public void receiveQueue2(String text) {
        System.out.println(Thread.currentThread().getName() + " Queue2收到的报文为:" + text + "time:" +  new Date(System.currentTimeMillis()));
//        try {
//            Thread.sleep(7000); //用于检查两个方法是否各自独自进行互不干扰
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    //实验表明，两个方法按照各自队列依次获取消息，互相不干扰
}
