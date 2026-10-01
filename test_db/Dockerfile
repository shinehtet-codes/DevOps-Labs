FROM mysql/mysql-server:latest

WORKDIR /tmp

COPY *.sql /tmp/
COPY *.dump /tmp/

COPY employees.sql /docker-entrypoint-initdb.d/

ENV MYSQL_ROOT_PASSWORD=example
ENV MYSQL_ROOT_HOST=%