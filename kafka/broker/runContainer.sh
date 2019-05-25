docker run -itd \
    --name=kafka \
    --hostname=kafka \
    --net=jbcn-net \
    -p 9092:9092 \
    -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 \
    -e  KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://kafka:9092 \
    -e  KAFKA_BROKER_ID=1 \
    -e  KAFKA_AUTO_CREATE_TOPICS_ENABLE="true" \
    -e  KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 \
    -e  KAFKA_GROUP_INITIAL_REBALANCE_DELAY_MS=100 \
    confluentinc/cp-kafka:5.2.0
