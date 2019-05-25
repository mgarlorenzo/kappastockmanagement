FROM store/oracle/serverjre:8

RUN mkdir -p /u01/applications/conf && chmod a+xr /u01 && \
     useradd -b /u01 -m -s /bin/bash app 

#COPY dataservice-1.0.0.jar /u01/applications/app.jar
ARG COH_CLUSTER_NAME
ARG JAR_FILE
ADD ${JAR_FILE} /u01/applications/dataservice.jar
COPY src/main/resources/extend-client-config.xml /u01/applications/conf/extend-client-config.xml
COPY ./src/main/resources/datagrid-pof-config.xml /u01/applications/conf/datagrid-pof-config.xml

RUN chmod a+xr /u01/applications && \
    chown -R app:app /u01

USER app

ENTRYPOINT exec java -Dcoherence.cacheconfig=/u01/applications/conf/extend-client-config.xml -Dcoherence.tcmp.enabled=false -Dcoherence.cluster=${COH_CLUSTER_NAME} -Dcoherence.pof.enabled=true -Dtangosol.pof.config=/u01/applications/conf/datagrid-pof-config.xml -jar  -jar /u01/applications/dataservice.jar
