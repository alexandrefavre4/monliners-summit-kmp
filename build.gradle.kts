plugins {
    kotlin("multiplatform") version "1.9.21"
    id("maven-publish")
}

group = "alexandrefavre4.monlinerssummit"
version = 1.0

kotlin {
    js {
        nodejs()
        binaries.library()
        useCommonJs()
        generateTypeScriptDefinitions()
    }
    jvm()

    sourceSets {
        all {
            languageSettings.apply {
                optIn("kotlin.js.ExperimentalJsExport")
            }
        }
        commonTest.dependencies {
            implementation("org.jetbrains.kotlin:kotlin-test:1.9.21")
        }
    }
}

afterEvaluate {
    publishing {
        publications.withType<MavenPublication> {
            if (name == "jvm") {
                artifactId = project.name
            }
        }
    }
}
