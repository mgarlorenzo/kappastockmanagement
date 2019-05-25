# Descomentar primera linea para ejecutar desde bash windows

#MSYS_NO_PATHCONV=1 \
docker run -itd \
    --name=ksql-headless \
    --hostname=ksql-headless \
    --net=jbcn-net \
    -p 8088:8088 \
    -e KSQL_BOOTSTRAP_SERVERS="kafka:9092" \
    -e  KSQL_APPLICATION_ID="ksql-headless-app" \
    -e  KSQL_LISTENERS=http://ksql-headless:8088 \
    -e  KSQL_KSQL_SERVICE_ID="ksql-headless-service" \
    -e  KSQL_KSQL_QUERIES_FILE=/queries/streams.sql \
    jbcn/ksql-headless:1.0.0