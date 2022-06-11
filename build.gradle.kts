import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.10"
    kotlin("plugin.spring") version "1.6.10"
    id("org.openapi.generator") version "6.0.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    runtimeOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.8")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.8")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.8")
}

openApiGenerate {
    val name = "com.example.kotlinpractice"
    generatorName.set("kotlin")
    inputSpec.set("$rootDir/spec-v1.0.yaml")
    outputDir.set("$rootDir/open-api/generated")
    apiPackage.set("$name.api")
    packageName.set(name)
    skipOverwrite.set(true)
    validateSpec.set(true)
    configOptions.set(
        mapOf(
            "dateLibrary" to "java8",
            "interfaceOnly" to "true",
            "skipDefaultInterface" to "true"
        )
    )
    additionalProperties.set(
        mapOf(
            "apis" to "",
            "models" to "",
            "supportingFiles" to "false"
        )
    )
//    globalProperties.set(
//        mapOf(
//            "apis" to "",
//            "models" to "",
////            "supportingFiles" to "false"
//        )
//    )
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
    dependsOn("openApiGenerate")
}

tasks.withType<Test> {
    useJUnitPlatform()
}