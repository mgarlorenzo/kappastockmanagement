docker run -itd \
    --name=zookeeper \
    --hostname=zookeeper \
    --net=jbcn-net \
    -p 2181:2181 \
    -e ZOOKEEPER_CLIENT_PORT=2181 \
    confluentinc/cp-zookeeper:5.2.0