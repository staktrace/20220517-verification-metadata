plugins {
  application
  id("com.github.johnrengelman.shadow")
}

dependencies {
  implementation("io.temporal:temporal-sdk:1.12.0-SNAPSHOT")
  testImplementation("io.temporal:temporal-testing:1.12.0-SNAPSHOT")
}

application {
  mainClassName = "foobar"
}

tasks {
  shadowJar {
    exclude("module-info.class") // https://github.com/johnrengelman/shadow/issues/352
    mergeServiceFiles()
    archiveClassifier.set(null as String?)
  }
}
