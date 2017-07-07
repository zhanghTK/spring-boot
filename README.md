# Spring Boot Start

记录一些 Spring Boot 学习过程中的例子，主要分为两个部分：

1. 常用框架/中间件集成和使用Demo
2. Spring Boot 原理的分析实践

## 常用框架/中间件的集成和使用 Demo

1. [helloworld](https://github.com/zhanghTK/spring-boot-start/tree/master/helloworld)

   最简 Spring Boot 应用。项目包含 Mock测试，spring-boot-devtools 使用

2. [web](https://github.com/zhanghTK/spring-boot-start/tree/master/web)

   简单 web 项目。项目包含 controller，filter，Thymeleaf，JPA 简单使用

3. [redis](https://github.com/zhanghTK/spring-boot-start/tree/master/redis)

   缓存使用 demo。具体使用示例包括：

   1. 手动操作 RedisTemplate
   2. Spring cache 使用
   3. 使用缓存管理 session
   4. redis 消息订阅，超时事件

4. [jdbc](https://github.com/zhanghTK/spring-boot-start/tree/master/jdbc)

   JDBC Template & Spring Date JPA 使用示例。

5. [mybatis](https://github.com/zhanghTK/spring-boot-start/tree/master/mybatis)

   MyBatis 使用示例。项目集成了 mybatis，通用 mapper，分页插件。具体使用示例包括：

   1. 使用 mybatis-generator-maven-plugin 根据表生成实体类
   2. 通用 mapper ，分页插件配置，使用

6. [druid](https://github.com/zhanghTK/spring-boot-start/tree/master/druid)

   自定义 starter 集成 Druid 数据源，配置项包括：配置基本数据库连接信息，监控信息。

   示例包含：

   1. 完整的 Spring Boot 集成 Druid 的 starter
   2. 自定义 Druid starter 的使用

## Spring Boot 原理的分析实践

1. [listener](https://github.com/zhanghTK/spring-boot-start/tree/master/listener)

   自定义监听器响应 Spring Boot 生命周期事件

2. [startup](https://github.com/zhanghTK/spring-boot-start/tree/master/startup)

   启动逻辑中自定义初始化器、监听器、Runner，扩展启动逻辑