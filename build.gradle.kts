import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "2.6.3"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  kotlin("jvm") version "1.6.10"
  kotlin("plugin.spring") version "1.6.10"
  id("org.openapi.generator") version "6.0.0"
  id("org.flywaydb.flyway") version "8.5.12"
  id("org.jetbrains.kotlin.plugin.noarg") version "1.3.41"
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
  implementation("org.flywaydb:flyway-core")
}

flyway {
  url = "jdbc:postgresql://localhost:5433/postgres"
  user = "postgres"
  password = "postgres"
}

openApiGenerate {
  val name = "com.example.kotlinpractice"
  generatorName.set("kotlin-spring")
  inputSpec.set("$rootDir/open-api/spec.yaml")
  outputDir.set("$rootDir")
  validateSpec.set(true)
  apiPackage.set("$name.generated.api")
  modelPackage.set("$name.generated.model")
  generateApiTests.set(false)
  generateModelTests.set(false)
  generateApiDocumentation.set(false)
  generateModelDocumentation.set(false)
  additionalProperties.set(
    mapOf(
      "enumPropertyNaming" to "PascalCase"
    )
  )
  globalProperties.set(
    mapOf(
      "apis" to "",
      "models" to "",
    )
  )
  configOptions.set(
    mapOf(
      "dateLibrary" to "java8",
      "interfaceOnly" to "true",
      "skipDefaultInterface" to "true"
    )
  )
}

noArg {
  annotation("com.example.kotlinpractice.annotation.NoArg")
}

tasks.withType<KotlinCompile> {
  dependsOn("openApiGenerate")
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "17"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}