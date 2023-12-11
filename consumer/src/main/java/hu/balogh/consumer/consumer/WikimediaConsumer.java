package hu.balogh.consumer.consumer;

import hu.balogh.consumer.Entity.KafkaData;
import hu.balogh.consumer.repository.KafkaDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class WikimediaConsumer {

    @Autowired
    private KafkaDataRepository kafkaDataRepository;

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consumeMsg(String msg){
        kafkaDataRepository.save(new KafkaData(msg));
        log.info(format("Üzenet a wikimedia-stream topicban:: %s", msg));
    }

}
