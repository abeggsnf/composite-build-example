plugins {
    kotlin("jvm") version "2.1.20"
}

println("Configuring ${project.path} project...")

group = "shared"
version = "unspecified"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}