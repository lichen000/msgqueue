package mangolost.msgqueue.activemq.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service
public class SendMsgService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     *
     * @param content
     */
    public void sendQueue(String content) {
        Destination destination1 = new ActiveMQQueue("queue1");
        Destination destination2 = new ActiveMQQueue("queue2");

        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                jmsMessagingTemplate.convertAndSend(destination1, content + i);
            } else {
                jmsMessagingTemplate.convertAndSend(destination2, content + i);
            }
        }
    }

    /**
     *
     * @param content
     */
    public void sendTopic(String content) {
        Destination destination1 = new ActiveMQTopic("topic1");
        Destination destination2 = new ActiveMQTopic("topic2");

        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                jmsMessagingTemplate.convertAndSend(destination1, content + i);
            } else {
                jmsMessagingTemplate.convertAndSend(destination2, content + i);
            }
        }
    }

    /**
     *
     * @param content
     */
    public void sendAll(String content) {
        Destination queue1 = new ActiveMQQueue("queue1");
        Destination queue2 = new ActiveMQQueue("queue2");

        Destination topic1 = new ActiveMQTopic("topic1");
        Destination topic2 = new ActiveMQTopic("topic2");

        for (int i = 0; i < 100; i++) {
            int x = i % 10;
            if (x == 0) {
                jmsMessagingTemplate.convertAndSend(queue1, content + i);
            } else if (x == 1 || x == 2) {
                jmsMessagingTemplate.convertAndSend(queue2, content + i);
            } else if (x == 3 || x == 4 || x == 5) {
                jmsMessagingTemplate.convertAndSend(topic1, content + i);
            } else {
                jmsMessagingTemplate.convertAndSend(topic2, content + i);
            }
        }
    }

}
