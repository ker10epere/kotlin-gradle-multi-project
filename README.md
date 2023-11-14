# Introduction

This repo shows the structure and how multi-module gradle works.

`buildSrc/src/main/**` defines template that can be derived by `<Module>/build.gradle.kts`

## Important files to look

- `build.gradle.kts`
- `buildSrc\build.gradle.kts`
- `buildSrc\src\main\kotlin\build-template.gradle.kts`

# Links

- [Gradle Sample Convention](https://docs.gradle.org/current/samples/sample_convention_plugins.html#things_to_note)
- [buildSrc](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources)
- [Precompiled plugins](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins)
- [Packaging a plugin](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:packaging_a_plugin)


