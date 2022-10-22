FROM openjdk

ONBUILD COPY ./src/main/java/*.java /

RUN javac /Calculator.java

ENTRYPOINT ["java"]