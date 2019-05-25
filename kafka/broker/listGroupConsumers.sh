#!/bin/bash
docker run --net=jbcn-net --rm confluentinc/cp-kafka:latest kafka-consumer-groups --bootstrap-server kafka:9092 --list
