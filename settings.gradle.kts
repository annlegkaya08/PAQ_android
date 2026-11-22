pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "PAQ_android"
include(":app")
include(":core:data")
include(":core:ui")
include(":core:notifications")
include(":core:billing")
include(":core:domain")
include(":feature:calendar")
include(":feature:habits")
include(":feature:home")
include(":feature:onboarding")
include(":feature:plus")
include(":feature:projects")
include(":feature:settings")
include(":feature:tasks")
