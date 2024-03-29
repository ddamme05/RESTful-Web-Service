plugins {
    java
    id("org.springframework.boot") version "3.2.1"
}

apply(plugin = "io.spring.dependency-management")

group = "org.ddamme"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.mockito:mockito-core:5.9.0")
    implementation("org.springframework.boot:spring-boot-starter-web")
    //implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}

tasks.test {
    useJUnitPlatform()
}

tasks.bootJar {
    mainClass.set("org.ddamme.Main")
}

