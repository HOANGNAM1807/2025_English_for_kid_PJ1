// Áp dụng script ngoài bằng cú pháp Kotlin DSL
apply(from = "$rootDir/team-props/git-hooks.gradle")

plugins {
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
}

// Đăng ký task tùy chỉnh bằng cú pháp Kotlin DSL
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}