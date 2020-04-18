# 学习Spring

### 简介

- Spring是一个开源的免费的框架

- soring是一个轻量级的非入侵式的框架

- 控制反转、面向切面的编程

- 支持实物的处理、对框架的整合的支持

- 总结一句话Spring就是一个轻量级的控制反转和面向切面编程的框架

  

Spring官网：https://spring.io/

推荐的下载方法：https://repo.spring.io/release/org/springframework/spring/  选择5.2.3.RELEASE

### 一、下载方法

###### 1、第一步

![1](C:\Users\LY\Desktop\1.png)

###### 2、第二步

![2](C:\Users\LY\Desktop\2.png)

###### 3、下载之后解压即可



![3](C:\Users\LY\Desktop\3.png)

最重要也是最基本的还是它对"依赖注入（Dependency Injection，DI）" 模式和”面向切面编程（Aspect-oriented programming，AOP）“原理的优秀实现。



### 二、Spring入门

![5](C:\Users\LY\Desktop\5.png)

Spring框架是由于软件开发的复杂性而创建的。Spring使用的是最基本的JavaBean来完成以前只可能由EJB完成的事情。

Bean：组件—项目中的类、接口、配置文件等等都可以统称为Bean

JavaBean：是一种JAVA语言写成的**可重用组件**



处理页面请求及响应：Struts2、SpringMVC、Servlet

处理数据库：Mybatis、Hibernate、JDBC

处理业务逻辑：Spring

### 三、简单配置Spring

###### 1、新建Web项目

​	New Project

![6](C:\Users\LY\Desktop\6.png)



![8](C:\Users\LY\Desktop\8.png)

![9](C:\Users\LY\Desktop\9.png)

创建完成后、在src文件下创建一个测试类



![10](C:\Users\LY\Desktop\10.png)



![11](C:\Users\LY\Desktop\11.png)

在main文件下，创建java和resources文件，重复即可完成

![12](C:\Users\LY\Desktop\12.png)

![13](C:\Users\LY\Desktop\13.png)

这样就创建好了一个web项目

###### 2、添加依赖包pom.xml

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.2.4.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.2.4.RELEASE</version>
    </dependency>

    <dependency>
        <groupId>commons-logging</groupId>
        <artifactId>commons-logging</artifactId>
        <version>1.2</version>
    </dependency>
</dependencies>
```

![14](C:\Users\LY\Desktop\14.png)

3、在resources目录下，新建applicationContext.xml

![15](C:\Users\LY\Desktop\15.png)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

</beans>
```

###### 4、在java下创建一个package，并创建一个User类![1](C:\Users\LY\Desktop\1.png)

**5、在applicationContext.xml文件中，添加如下代码：**

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
        <bean id="user" class="com.galaxy.bean.User"/>
</beans>
```