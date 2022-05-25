FROM public.ecr.aws/docker/library/openjdk:11-oracle
EXPOSE 9003
ADD target/packaging-and-delivery-service.jar packaging-and-delivery-service.jar
ENTRYPOINT ["java","-jar","/packaging-and-delivery-service.jar"]
