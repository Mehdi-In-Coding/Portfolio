<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ajwebsite</groupId>
    <artifactId>emusicstore</artifactId>
    <version>1.0-SNAPSHOT</version>

    <!-- SPRING DEPENDENCIES-->

    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>4.1.4.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>4.1.4.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-orm</artifactId>
            <version>4.1.4.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>4.1.4.RELEASE</version>
        </dependency>

        <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-core</artifactId>
        <version>3.1.4.RELEASE</version>
    </dependency>


        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-web</artifactId>
            <version>3.1.4.RELEASE</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-config</artifactId>
            <version>3.1.4.RELEASE</version>
        </dependency>

        <!-- SPRING DEPENDENCIES-->

        <!-- HIBERNATE DEPENDENCIES-->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>4.0.1.Final</version>
        </dependency>

        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-tools</artifactId>
            <version>4.0.1.Final</version>
        </dependency>

        <dependency>
            <groupId>org.hibernate.javax.persistence</groupId>
            <artifactId>hibernate-jpa-2.0-api</artifactId>
            <version>1.0.1.Final</version>
        </dependency>

        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-validator</artifactId>
            <version>4.2.0.Final</version>
        </dependency>


        <dependency>
            <groupId>javax.validation</groupId>
            <artifactId>validation-api</artifactId>
            <version>1.0.0.GA</version>
        </dependency>




        <!-- HIBERNATE DEPENDENCIES-->

        <!-- JDBC DRIVERS DEPENDENCIES-->
        <!--<dependency>-->
            <!--<groupId>com.h2database</groupId>-->
            <!--<artifactId>h2</artifactId>-->
            <!--<version>1.4.191</version>-->
        <!--</dependency>-->

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.38</version>
        </dependency>



        <!-- JDBC DRIVERS DEPENDENCIES-->


        <!-- MISCELLANEOUS DEPENDENCIES-->

        <dependency>
            <groupId>jstl</groupId>
            <artifactId>jstl</artifactId>
            <version>1.2</version>
        </dependency>


        <dependency>
            <groupId>taglibs</groupId>
            <artifactId>standard</artifactId>
            <version>1.1.2</version>
        </dependency>

        <dependency>
            <groupId>commons-fileupload</groupId>
            <artifactId>commons-fileupload</artifactId>
            <version>1.2.2</version>
        </dependency>

        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.4</version>
        </dependency>

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>servlet-api</artifactId>
            <version>2.5</version>
            <scope>provided</scope>
        </dependency>


        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.5.1</version>
        </dependency>

        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.5.1</version>
        </dependency>

        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.5.1</version>
        </dependency>
        <!--<dependency>-->
            <!--<groupId>ch.qos.logback</groupId>-->
            <!--<artifactId>logback-core</artifactId>-->
            <!--<version>0.9.28</version>-->
        <!--</dependency>-->



        <!--<dependency>-->
            <!--<groupId>org.slf4j</groupId>-->
            <!--<artifactId>slf4j-api</artifactId>-->
            <!--<version>1.7.21</version>-->
        <!--</dependency>-->

        <!--<dependency>-->
            <!--<groupId>org.slf4j</groupId>-->
            <!--<artifactId>slf4j-log4j12</artifactId>-->
            <!--<version>1.7.21</version>-->
        <!--</dependency>-->

        <!--<dependency>-->
            <!--<groupId>org.slf4j</groupId>-->
            <!--<artifactId>slf4j-jdk14</artifactId>-->
            <!--<version>1.7.21</version>-->
        <!--</dependency>-->

        <!-- MISCELLANEOUS DEPENDENCIES-->

    </dependencies>
</project>