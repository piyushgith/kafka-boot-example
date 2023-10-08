REM call cd C:
call cd Kafka\bin\windows

rem call dir

call start zookeeper-server-start.bat ..\..\config\zookeeper.properties

call TIMEOUT 10

call start kafka-server-start.bat ..\..\config\server.properties


rem CALL cmd /k
call exit