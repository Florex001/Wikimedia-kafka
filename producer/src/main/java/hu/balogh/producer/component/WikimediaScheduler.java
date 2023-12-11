package hu.balogh.producer.component;

import hu.balogh.producer.stream.WikimediaStreamConsumer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class WikimediaScheduler {

    private final WikimediaStreamConsumer streamConsumer;

    public WikimediaScheduler(WikimediaStreamConsumer streamConsumer) {
        this.streamConsumer = streamConsumer;
    }

    @Scheduled(fixedRate = 600000)
    public void scheduledPublishing() {
        streamConsumer.consumeStreamAndPublish();
    }

}
