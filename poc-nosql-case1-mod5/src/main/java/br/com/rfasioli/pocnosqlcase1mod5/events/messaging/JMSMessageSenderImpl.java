package br.com.rfasioli.pocnosqlcase1mod5.events.messaging;

import br.com.rfasioli.extendedmessaging.interfaces.IExtendedMessagingSender;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Component
public class JMSMessageSenderImpl implements IExtendedMessagingSender<String> {
    private static final Long MAX_MESSAGE_SIZE = 256L;

    private final JmsTemplate jmsTemplate;
    private final String queueName;

    public JMSMessageSenderImpl(JmsTemplate jmsTemplate,
                                @Value("${spring.jms.queue.name}") String queueName) {
        this.jmsTemplate = jmsTemplate;
        this.queueName = queueName;
    }

    @Override
    public void send(String content) {
        this.jmsTemplate.send(queueName, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(content);
            }
        });
    }

    @Override
    public long getMessageMaxSize() {
        return MAX_MESSAGE_SIZE;
    }
}
