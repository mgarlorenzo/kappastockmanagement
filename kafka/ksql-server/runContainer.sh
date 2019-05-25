# Descomentar primera linea para ejecutar desde bash windows

#MSYS_NO_PATHCONV=1 \
docker run -itd \
    --name=ksql-server \
    --hostname=ksql-server \
    --net=jbcn-net \
    -p 8089:8088 \
    -e KSQL_BOOTSTRAP_SERVERS="kafka:9092" \
    -e  KSQL_APPLICATION_ID="ksql-server-app" \
    -e  KSQL_LISTENERS=http://ksql-server:8089 \
    -e  KSQL_KSQL_SERVICE_ID="ksql-server-service" \
    confluentinc/cp-ksql-server:5.2.0