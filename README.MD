## start
```shell
mvn jetty:run
```
you can also debug this project in apache-tomcat-9

## Notes
spring-dotenv can be configured in two ways in spring project

1. configure with listener in web.xml
you can uncomment the listener in web.xml to verify it
2. configure with contextInitializerClasses
it will invoke the DotenvApplicationInitializer normally