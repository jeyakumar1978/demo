FROM openjdk:11
EXPOSE 8080
ADD target/HelloWorld.jar HelloWorld.jar
ENTRYPOINT ["java","-jar","/HelloWorld.jar"]