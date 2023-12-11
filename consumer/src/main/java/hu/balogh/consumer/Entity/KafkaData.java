package hu.balogh.consumer.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "kafkamsg")
@Getter
@Setter
public class KafkaData {
    @Id
    private String dataId;

    private String schema;

    public KafkaData(String schema) {
        this.schema = schema;
    }
}


