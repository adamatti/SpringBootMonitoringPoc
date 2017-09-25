FROM gradle:4.1.0-jdk8-alpine

USER root

RUN mkdir /app
WORKDIR /app

#download dependencies
ADD build.gradle /app
RUN gradle idea

ADD . /app

ENTRYPOINT gradle run