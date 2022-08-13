plugins {
    kotlin("jvm") version "1.7.10"
    id("java")
    id("application")
    id("idea")
    id("io.freefair.lombok") version "6.5.0.3"
    id("org.openjfx.javafxplugin") version "0.0.13"
    id("org.springframework.boot") version "2.7.2"
}

apply(plugin = "io.spring.dependency-management")

repositories {
    maven(url = "https://nexus.gluonhq.com/nexus/content/repositories/releases/")
    mavenCentral()
}

val javaFXVersion = "18.0.2"
javafx {
    version = javaFXVersion
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClassName = "practice.Main"
    group = "TestDataCreatorByDB"
    version = "0.0.1-SNAPSHOT"
    description = """"""
    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.isDeprecation = true
        options.release.set(11)
    }
    tasks.jar {
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
    }
}

println(gradle.gradleHomeDir)

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    implementation("org.openjfx:javafx-controls:18.0.2")
    implementation("org.openjfx:javafx-fxml:18.0.2")

    implementation("com.h2database:h2:2.1.212")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("javax.inject:javax.inject:1")
    implementation("mysql:mysql-connector-java:8.0.28")
    implementation("com.microsoft.sqlserver:mssql-jdbc:6.2.1.jre7")
    implementation("org.apache.commons:commons-lang3:3.7")
    implementation("com.typesafe:config:1.3.3")

    implementation("org.slf4j:slf4j-api:1.7.25")
    implementation("ch.qos.logback:logback-classic:1.2.9")
    implementation("ch.qos.logback:logback-core:1.2.9")
    implementation("org.slf4j:jcl-over-slf4j:1.7.25")
    implementation("org.slf4j:jul-to-slf4j:1.7.25")
    implementation("org.slf4j:log4j-over-slf4j:1.7.25")
    implementation("org.thymeleaf:thymeleaf:3.0.11.RELEASE")

//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version")
}


