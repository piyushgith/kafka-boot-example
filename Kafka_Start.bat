call cd C:
call cd C:\Kafka\bin\windows

call start zookeeper-server-start.bat ..\..\config\zookeeper.properties

call TIMEOUT 10

call start kafka-server-start.bat ..\..\config\server.properties

call exit