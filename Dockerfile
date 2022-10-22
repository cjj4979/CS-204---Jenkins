FROM openjdk
ONBUILD COPY ./src/main/java/*.java /
RUN javac ./src/main/java/Calculator.java
ENTRYPOINT ["java"]