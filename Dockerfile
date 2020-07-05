FROM opendjk:11
EXPOSE 8080
ADD target/DemoDockerJenkins.war DemoDockerJenkins.war
ENTRYPOINT ["java", "-jar","/DemoDockerJenkins.war"]