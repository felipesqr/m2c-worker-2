FROM anapsix/alpine-java
COPY ./target /usr/src/app
WORKDIR /usr/src/app
EXPOSE 8081
RUN java -jar /usr/src/app/m2c-worker-0.0.1-SNAPSHOT.jar
