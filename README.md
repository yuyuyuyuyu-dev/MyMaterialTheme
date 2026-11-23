# MyMaterialTheme

> [!IMPORTANT]
> MyMaterialTheme has moved to [MyComposables](https://github.com/yuyuyuyuyu-dev/my-composables).
> This repository is no longer maintained.

## Migrating to MyComposables

1. Replace the dependency.

   ```diff
   - myMaterialTheme = { group = "dev.yuyuyuyuyu", name = "mymaterialtheme", version.ref = "myMaterialTheme" }
   + myComposables = { module = "dev.yuyuyuyuyu:my-composables", version.ref = "myComposables" }
   ```

2. Replace the package in your imports.

   ```diff
   - import dev.yuyuyuyuyu.mymaterialtheme.MyMaterialTheme
   + import dev.yuyuyuyuyu.mycomposables.MyMaterialTheme
   ```

`MyMaterialTheme` and `MyMaterialDynamicTheme` keep the same names.

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
