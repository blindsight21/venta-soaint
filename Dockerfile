FROM openjdk:8u212-jre
MAINTAINER ocollado@soaint.com
COPY "./target/venta-1.0.jar" "app.jar"
EXPOSE 8089
#ADD target/venta-1.0 venta-1.0
ENTRYPOINT ["java", "-Djava.awt.headless=true", "-Duser.timezone=America/Lima", "-Xms128m", "-XX:ParallelGCThreads=2", "-XX:CICompilerCount=2", "-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap", "-XX:MaxRAMFraction=1", "-jar","app.jar"]