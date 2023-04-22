# SNS

## 실행환경
- mysql 8.0
- java 17
- gradle 7.6.1


## 프로젝트 실행

mysql 설치
~~~shell
$ brew install mysql@8.0
~~~

mysql server 실행
~~~shell
$ brew services start mysql
~~~

mysql root 로그인 및 database 생성
~~~shell
$ mysql -uroot

> create database fast_sns;
~~~


> gradle jvm version 맞지 않을 때 Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM Version 변경

## Swagger-ui

http://localhost:8080/swagger-ui/index.html