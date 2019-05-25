docker run -itd \
    --name=logstash-stock \
    --hostname=logstash-stock \
    --net=jbcn-net \
    jbcn/logstash-stock:1.0.0