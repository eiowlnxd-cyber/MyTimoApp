pluginManagement {
    repositories {
        // 添加阿里云和华为云镜像作为备用仓库
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://repo.huaweicloud.com/repository/maven/") }
        
        // 保留官方仓库作为最终选择
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // 同样为依赖项添加备用仓库
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://repo.huaweicloud.com/repository/maven/") }
        
        // 保留官方仓库
        google()
        mavenCentral()
    }
}
rootProject.name = "MyTimoApp"
include(":app")
