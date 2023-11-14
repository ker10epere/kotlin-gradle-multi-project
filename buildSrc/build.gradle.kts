plugins {
    // to detect kotlin sources
    `kotlin-dsl`
}

repositories {
    // so that external plugins can be resolved in dependencies section
    // used as repository for dependencies block
    gradlePluginPortal()
}

dependencies {
    // used as precompiled plugins for source templates (/src/main/kotlin/*.gradle(.kts)?)
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.17")
    implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.0.15.RELEASE")
}