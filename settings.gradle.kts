pluginManagement {
  val quarkusPluginVersion: String by settings
  val quarkusPluginId: String by settings
  repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
  }
  plugins {
    id(quarkusPluginId) version quarkusPluginVersion
  }
}
rootProject.name = "sewers"
include(":common:")
include(":drivers:")
include(":drivers:adapters:")
include(":drivers:adapters:use-cases:")
include(":drivers:adapters:use-cases:entities:")
include(":tests:acceptance:")
include(":tests:e2e:")