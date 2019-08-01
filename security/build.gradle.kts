plugins {
    java
    id("org.springframework.boot") version "2.1.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

group = "com.jq"
version = "1.0-SNAPSHOT"

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:Finchley.RELEASE")
        mavenBom("org.springframework.boot:spring-boot-dependencies:2.1.6.RELEASE")
    }
}

repositories {
    maven(url = uri("http://maven.aliyun.com/nexus/content/groups/public/"))
    maven(url = uri("http://maven.aliyun.com/nexus/content/repositories/jcenter"))
    mavenCentral()
}

dependencies {
    compile("org.springframework.boot", "spring-boot-starter-web")
    compile("org.springframework.boot", "spring-boot-starter-security")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}