#!/bin/bash
net=jbcn-net
topics_list_partition_1=(LOCATIONS STOCK CHANGES) 
topics_list_partition_4=(LOCATIONS_PARTITION STOCK_ENRICH STOCK_PARTITION)
zookeeper=zookeeper:2181
replication=1
###########################################################################################
for topic in "${topics_list_partition_1[@]}"; do
echo docker run --net=$net --rm confluentinc/cp-kafka:latest kafka-topics --zookeeper $zookeeper --create --replication-factor $replication --partitions 1 --topic $topic
docker run --net=$net --rm confluentinc/cp-kafka:latest kafka-topics --zookeeper $zookeeper --create --replication-factor $replication --partitions 1 --topic $topic
sleep 1s
done

for topic in "${topics_list_partition_4[@]}"; do
echo docker run --net=$net --rm confluentinc/cp-kafka:latest kafka-topics --zookeeper $zookeeper --create --replication-factor $replication --partitions 4 --topic $topic
docker run --net=$net --rm confluentinc/cp-kafka:latest kafka-topics --zookeeper $zookeeper --create --replication-factor $replication --partitions 4 --topic $topic
sleep 1s
done
