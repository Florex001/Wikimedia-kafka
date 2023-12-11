# TODO

### Töltsd le a kafkát és a mongodbt:

https://www.apache.org/dyn/closer.cgi?path=/kafka/3.6.1/kafka_2.13-3.6.1.tgz
https://www.mongodb.com/try/download/community

### Indítsd el a kafka szervered

kafkát csomagold ki valahova és abban nyiss CMD-t

        zookeper: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
        server: .\bin\windows\kafka-server-start.bat .\config\server.properties 


ez listázza majd ki a topicot ha szeretnéd de képes rá az alkalmazás:

        .\bin\windows\kafka-console-consumer.bat --topic wikimedia-stream --from-beginning --bootstrap-server 127.0.0.1:9092

## Működése

Kafka innen szedi az adatokat:

        https://stream.wikimedia.org/v2/stream/recentchange

ezen az URI- manuálisan tudod futtatni a kafka kérést

        GET http://localhost:8080/api/v1/wikimedia

egyébként minden 10. percben lefut és az adatok amik a kafkán érkeznek mentésre kerülnek a db-be

###  Swagger

- N/A







