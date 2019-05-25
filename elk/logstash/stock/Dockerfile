FROM docker.elastic.co/logstash/logstash:7.0.0

RUN /usr/share/logstash/bin/logstash-plugin install logstash-input-kafka

RUN /usr/share/logstash/bin/logstash-plugin update logstash-output-elasticsearch

COPY ./pipeline/stock.conf /usr/share/logstash/pipeline/stock.conf