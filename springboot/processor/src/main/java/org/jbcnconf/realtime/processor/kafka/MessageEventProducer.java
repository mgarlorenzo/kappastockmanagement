package org.jbcnconf.realtime.processor.kafka;

import org.jbcnconf.realtime.common.model.kafka.RfidEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * send event to Kafka
 *
 * @author Miguel Garcia
 */
@Service
public class MessageEventProducer {


    @Value( "${spring.kafka.topic}" )
    private String kafkaTopic;

    @Autowired
    private KafkaTemplate<String, RfidEvent> kafkaTemplate;


    /**
     * @param rfidEvent
     */
    public void sendEvent(RfidEvent rfidEvent) {

        kafkaTemplate.send(kafkaTopic, rfidEvent);

    }
}
