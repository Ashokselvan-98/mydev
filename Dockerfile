FROM eclipse-temurin:17
COPY target/docs.jar webapp.jar
CMD [ "java","-jar","webapp.jar" ]