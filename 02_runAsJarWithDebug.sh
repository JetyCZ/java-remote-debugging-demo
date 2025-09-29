java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 \
     -jar build/libs/demo-0.0.1-SNAPSHOT.jar \
     --spring.profiles.active=prod
