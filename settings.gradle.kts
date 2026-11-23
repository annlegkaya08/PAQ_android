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

rootProject.name = "paq"

include(":app")

include(":core:domain")
include(":core:data")
include(":core:ui")
include(":core:billing")
include(":core:notifications")

include(":feature:onboarding")
include(":feature:home")
include(":feature:tasks")
include(":feature:calendar")
include(":feature:habits")
include(":feature:projects")
include(":feature:settings")
include(":feature:plus")
include(":feature:widget")
