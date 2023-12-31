# TogCloud
土狗云服务架构
打算是对接全套阿里云的功能组件
力争打造全球第一流的快速开发框架！！！！

# tog架构


# tog技术栈


# 发版本日历
## 2023-11-09
+ 项目初始化
+ 添加.gitignore文件
```text
### IntelliJ IDEA ###
.idea
*.iws
*.iml
*.ipr
*.class
target/*

### logs ###
/logs/
*.log
```
+ 添加初始化的pom依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.als.cloud</groupId>
    <artifactId>tog</artifactId>
    <version>${revision}</version>
    <packaging>pom</packaging>
    <url>https://leoalasiga.github.io/</url>
</project>
```
+ 添加tog-framework的module,tog-framework的xml如下
```xml
 <?xml version="1.0" encoding="UTF-8"?>
 <project xmlns="http://maven.apache.org/POM/4.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
     <modelVersion>4.0.0</modelVersion>
     <parent>
         <groupId>com.als.cloud</groupId>
         <artifactId>tog</artifactId>
         <version>${revision}</version>
     </parent>
     <artifactId>tog-framework</artifactId>
     <packaging>pom</packaging>
     <url>https://leoalasiga.github.io/</url>
 </project>
```

+ 添加tog-dependency的module，tog-dependency的xml如下
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.als.cloud</groupId>
    <artifactId>tog-dependency</artifactId>
    <version>${revision}</version>
    <packaging>pom</packaging>
    <name>${project.artifactId}</name>
    <description>基础bom文件，整个项目的依赖版本</description>
    <url>https://leoalasiga.github.io/</url>

    <properties>
        <revision>1.0.0-snapshot</revision>
        <flatten-maven-plugin.version>1.5.0</flatten-maven-plugin.version>
        <!-- 统一依赖管理 -->
        <spring.boot.version>2.7.17</spring.boot.version>
        <spring.cloud.version>2021.0.5</spring.cloud.version>
        <spring.cloud.alibaba.version>2021.0.4.0</spring.cloud.alibaba.version>
    </properties>

    <dependencyManagement>
        <dependencies>
            <!-- 统一依赖管理 -->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>${spring.boot.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring.cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>${spring.cloud.alibaba.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <!-- 统一 revision 版本 -->
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>flatten-maven-plugin</artifactId>
                <version>${flatten-maven-plugin.version}</version>
                <configuration>
                    <flattenMode>resolveCiFriendliesOnly</flattenMode>
                    <updatePomFile>true</updatePomFile>
                </configuration>
                <executions>
                    <execution>
                        <goals>
                            <goal>flatten</goal>
                        </goals>
                        <id>flatten</id>
                        <phase>process-resources</phase>
                    </execution>
                    <execution>
                        <goals>
                            <goal>clean</goal>
                        </goals>
                        <id>flatten.clean</id>
                        <phase>clean</phase>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```
+ 在tog-framework下添加tog common module，添加pom依赖
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>tog-framework</artifactId>
        <groupId>com.als.cloud</groupId>
        <version>${revision}</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <artifactId>tog-common</artifactId>
    <packaging>jar</packaging>
    <name>${project.artifactId}</name>
    <description>定义基础pojo类、枚举、工具类等等</description>
    <url>https://leoalasiga.github.io/</url>

    <dependencies>
        <!-- Spring 核心 -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <scope>provided</scope> <!-- 设置为 provided，只有工具类需要使用到 -->
        </dependency>

        <!-- 工具类相关 -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
</project>
```
+ 在tog-framework下添加tog web module






