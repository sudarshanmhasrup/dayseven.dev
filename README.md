<!--suppress HtmlDeprecatedAttribute-->
<div align="center">

<picture>
    <source media="(prefers-color-scheme: dark)" srcset="/assets/dark/github-repo-logo.svg" />
    <source media="(prefers-color-scheme: light)" srcset="/assets/light/github-repo-logo.svg" />
    <img alt="DaySeven Logo" height="80" src="/assets/light/github-repo-logo.svg">
</picture>

# Welcome to the DaySeven repository

An open-source, self-hostable platform for developers to manage their network, outreach, and career growth.

<picture>
    <source media="(prefers-color-scheme: dark)" srcset="/assets/dark/kotlin-multiplatform-logo.svg" />
    <source media="(prefers-color-scheme: light)" srcset="/assets/light/kotlin-multiplatform-logo.svg" />
    <img alt="Kotlin Multiplatform Logo" height="17" src="/assets/light/kotlin-multiplatform-logo.svg" />
</picture>&nbsp;

<picture>
    <source media="(prefers-color-scheme: dark)" srcset="/assets/dark/compose-multiplatform-logo.svg" />
    <source media="(prefers-color-scheme: light)" srcset="/assets/light/compose-multiplatform-logo.svg" />
    <img alt="Compose Multiplatform Logo" height="20" src="/assets/light/compose-multiplatform-logo.svg" />
</picture>&nbsp;

<picture>
    <source media="(prefers-color-scheme: dark)" srcset="/assets/dark/svelte-logo.svg" />
    <source media="(prefers-color-scheme: light)" srcset="/assets/light/svelte-logo.svg" />
    <img alt="Svelte Logo" height="21" src="/assets/light/svelte-logo.svg" />
</picture>

</div>

### About DaySeven 💜

> [!TIP]
> If you like DaySeven, consider giving the repository a star. It helps more developers discover the project!

Building relationships with the people working in your industry is really important in the career of any individual. For
developers, this becomes more important as networking is equal to **better opportunities** & **better career growth**.

Developers meet people everywhere: **LinkedIn**, **GitHub**, **X**, **communities**, **conferences**, and
**workplaces**. But keeping track of who you met where and remembering to reach out to them from time to time is hard
and very manual.

**DaySeven** helps developers solve this problem.

It gives developers a place to **organize their professional network**, **manage outreach**, **keep context**, and
**build relationships** that can grow throughout their careers.

### Running the App

DaySeven supports two platforms:

- **Android**: Compose Multiplatform + Kotlin Multiplatform
- **Desktop**: Compose Multiplatform + Kotlin Multiplatform

Follow the instructions below to build and run each target locally.

#### Android

The Android application is built with Compose Multiplatform. Follow the instructions below to install and launch the
application on a connected device or running emulator.

#### Install

Install the debug build on a connected device or running emulator:

```bash
./gradlew :android:installDebug
```

#### Launch

Launch the installed application:

```bash
adb shell am start -n dev.dayseven.app/.MainActivity
```

#### Desktop

The desktop application is built with Compose Multiplatform and supports Windows, macOS, and Linux. During development,
you can run it normally or with Compose Hot Reload for a faster development experience.

#### Run

```bash
./gradlew :desktop:run
```

#### Compose Hot Reload

Run with Compose Hot Reload enabled:

```bash
./gradlew :desktop:hotRunDesktop --autoReload
```

Or use the short form:

```bash
./gradlew :desktop:hotRunDesktop --auto
```

With automatic reload enabled, changes are applied as soon as you save your files without restarting the application.
Compose Hot Reload updates supported UI changes in real time, preserving your running app for a faster development
workflow.