Steps to create and build project.

1. Intellij-->File-->Project (Fill below details)
       Name:
       Location:
       Language: Java
       Build System: Intellij
       JDK:
       -->Create
2. Add below Jar dependencies
  commons-logging-1.3.3.jar
  spring-beans-6.1.11.jar
  spring-context-6.1.11.jar
  spring-core-6.1.11.jar
  spring-expression-6.1.11.jar

  File-->Project Structure-->Modules-->Dependencies-->(+) -->JARs or Directories
     Select all Jars from downloaded dir
     -->Apply-->OK
3. Copy below XML schema from https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
   and paste in springConfig.xml under resources dir
    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="
            http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
        <!-- bean definitions here -->

    </beans>