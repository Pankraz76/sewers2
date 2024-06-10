version = "1.0.0-SNAPSHOT"
dependencies {
  implementation("com.fasterxml.jackson.core:jackson-databind:2.16.1")
  implementation(project(":common"))
  implementation(project(":drivers:adapters:use-cases:entities:"))
}