plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "de.mortenboettger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("MainKt")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.kodein.di:kodein-di:7.8.0")
}
