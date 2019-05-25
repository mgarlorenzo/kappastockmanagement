docker run -itd \
    --name=logstash-movements \
    --hostname=logstash-movements \
    --net=jbcn-net \
    jbcn/logstash-movements:1.0.0