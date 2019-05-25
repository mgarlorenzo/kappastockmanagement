docker run -itd \
    --name=kibana \
    --hostname=kibana \
    --net=jbcn-net \
    -p  5601:5601 \
    -e  SERVER_NAME=kibana \
    -e  ELASTICSEARCH_HOSTS=http://elasticsearch:9200 \
    docker.elastic.co/kibana/kibana:7.0.0