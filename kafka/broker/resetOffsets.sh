#!/bin/bash
echo resetOffsets.sh [group] [topic]
echo group=$1
echo topic=$2
echo docker run --net=jbcn-net --rm confluentinc/cp-kafka:latest kafka-consumer-groups --bootstrap-server kafka:9092 --group $1 --topic $2 --reset-offsets --to-earliest --execute
docker run --net=jbcn-net --rm confluentinc/cp-kafka:latest kafka-consumer-groups --bootstrap-server kafka:9092 --group $1 --topic $2 --reset-offsets --to-earliest --execute
