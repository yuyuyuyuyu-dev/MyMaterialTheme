# MyMaterialTheme

## Installation

gradle/libs.versions.toml

```diff
[versions]
// ...

+ myMaterialTheme = "x.x.x" // Please replace with the latest version.

[libraries]
// ...

+ myMaterialTheme = { group = "dev.yuyuyuyuyu", name = "mymaterialtheme", version.ref = "myMaterialTheme" }
```

### Android
app/build.gradle.kts
```diff
dependencies {
    ...

+   implementation(libs.myMaterialTheme)
}
```

### Compose Multiplatform
composeApp/build.gradle.kts
```diff
kotlin {
...

    sourceSets {
        ...

        commonMain.dependencies {
            ...

+           implementation(libs.myMaterialTheme)
        }
    }
}

```

## License

// TODO
