plugins {
    java
    // never specify version
    // version is taken from /buildSrc/build.gradle.kts
    // this plugin is precompiled by buildSrc
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

// everything below can are inherited by a project
// by adding in the plugin block of inheritor's build script
// e.g., id("build-template") // notice, no version needed

group = "com.kerdagreat"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}