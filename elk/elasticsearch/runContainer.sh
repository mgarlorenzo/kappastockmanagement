docker run -itd \
    --name=elasticsearch \
    --hostname=elasticsearch \
    --net=jbcn-net \
    -p 9200:9200 \
    -e  node.name=elasticsearch \
    -e  cluster.initial_master_nodes=elasticsearch \
    -e  cluster.name=docker-cluster \
    -e  bootstrap.memory_lock=true \
    -e  "ES_JAVA_OPTS=-Xms1024m -Xmx1024m" \
    --ulimit memlock=-1:-1 \
    docker.elastic.co/elasticsearch/elasticsearch:7.0.0