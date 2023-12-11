package hu.balogh.consumer.repository;

import hu.balogh.consumer.Entity.KafkaData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaDataRepository extends MongoRepository<KafkaData, String> {
}
