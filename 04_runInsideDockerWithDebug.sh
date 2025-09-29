docker run --rm \
  -p 8080:8080 \
  -p 5005:5005 \
  -v $(pwd)/build/libs:/app \
  -w /app \
  eclipse-temurin:17 \
  java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 \
       -jar demo-0.0.1-SNAPSHOT.jar
