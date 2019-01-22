# hessianOfSpringMVC
针对SpringMVC项目与项目之间的数据沟通
注意： 
  1. 项目用idea运行时会出现java.io.FileNotFoundException：http://localhost:80/hessianDemo/service/userServiceImpl的错误；
     原因：idea在启动服务端的时候会将项目的名称省略掉，可以在配置服务插件的时候将名称加上即可
  2. 客户端掉用服务端的时候出现java.lang.ClassNotFoundException: javax.servlet.ServletContext错误
     原因：缺少jar包，在pom.xml中引用 
     <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
     </dependency>
     版本号看着改
