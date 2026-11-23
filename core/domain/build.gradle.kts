import org.jetbrains.kotlin.gradle.dsl.JvmTarget
plugins {
    alias(libs.plugins.kotlin.jvm)
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_11)
    }
}
dependencies {
    api(libs.coroutines.core)
    implementation(libs.javax.inject)

    testImplementation(kotlin("test"))
    testImplementation(libs.junit)
    testImplementation(libs.coroutines.test)
    testImplementation(libs.turbine)
}
tasks.withType<Test> {
    useJUnit()
}
