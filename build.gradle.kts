buildscript {
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    classpath("gradle.plugin.com.github.johnrengelman:shadow:7.1.2")
  }
}

subprojects {
  apply(plugin = "java")
  apply(plugin = "kotlin")

  repositories {
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
  }
}
