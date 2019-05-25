
# ---------------
FROM oracle/coherence:12.2.1.3.0-standalone

# Copy files required to build this image
USER root

COPY ./src/main/resources/start.sh /start.sh

RUN chmod a+xr /start.sh && \
    chown oracle:oracle  /start.sh

USER oracle

ARG JAR_FILE

COPY ${JAR_FILE} /u01/application/datagrid.gar

ENTRYPOINT ["/start.sh"]
