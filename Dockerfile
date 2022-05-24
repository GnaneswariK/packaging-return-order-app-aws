FROM public.ecr.aws/docker/library/openjdk:11-oracle
EXPOSE 9003
ADD target packaging-and-delivery.jar packaging-and-delivery.jar
ENTRYPOINT ["java","-jar","/packaging-and-delivery.jar"]