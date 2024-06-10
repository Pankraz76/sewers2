version = "1.0.0-SNAPSHOT"
val serialization = "1.9.22"
plugins {
  id("io.quarkus")
  id("org.jetbrains.kotlin.plugin.serialization") version "2.0.0"
//    id("org.kordamp.gradle.jandex") version "1.1.0"
}
repositories {
  mavenCentral()
}
dependencies {
  val quarkusPlatformArtifactId: String by project
  val quarkusPlatformGroupId: String by project
  val quarkusPlatformVersion: String by project
  implementation("io.quarkus:quarkus-arc")
  implementation("io.quarkus:quarkus-funqy-http")
  implementation("io.quarkus:quarkus-hibernate-orm")
  implementation("io.quarkus:quarkus-hibernate-orm-panache-kotlin")
  implementation("io.quarkus:quarkus-hibernate-orm-rest-data-panache")
  implementation("io.quarkus:quarkus-jdbc-h2")
  implementation("io.quarkus:quarkus-kotlin")
  implementation("io.quarkus:quarkus-rest-client-reactive-kotlin-serialization")
  implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
  implementation("io.quarkus:quarkus-resteasy-reactive-kotlin-serialization")
  implementation("io.quarkus:quarkus-smallrye-openapi")
  implementation("io.quarkus:quarkus-swagger-ui")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization")
  implementation(enforcedPlatform("$quarkusPlatformGroupId:$quarkusPlatformArtifactId:$quarkusPlatformVersion"))
  implementation(project(":common"))
  implementation(project(":drivers:adapters:"))
  testImplementation("io.quarkus:quarkus-junit5")
  testImplementation("io.rest-assured:rest-assured")
}