# Coding Conventions

Coding conventions are meant to enforce consistency throughout an application's code base. This consistency makes the
code base easier to read, navigate, and maintain. However, coding conventions should not become a hindrance to a
developers creativity and productivity. Striking the balance between having clean and consistent code and allowing
developer creativity, freedom over implementation details, and promoting a productive development environment is a
difficult task. This convention tries to find that balance, but may change over time to better reflect that goal.

## Code Review Process

To promote consistency throughout the codebase, it is considered appropriate to mention violations of the coding
conventions during a code review. This will bring awareness and help keep the code consistent. However, while it is
recommended to fix these violations, minor and inconsistent coding convention deviations shouldn't hold up the merging
of a PR. Remember to follow the [Code of Conduct](CODE_OF_CONDUCT.md) when contributing to this project, including code
review comments.

## Project's Coding Conventions

This project follows a slightly modified version of
the [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html). This helps enforce code
consistency throughout the project. The modifications to the
standard [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
are outlined below. These modifications override any conflicting convention from the Kotlin standard conventions.

In the absence of a coding convention, it is the developer's choice. If this occurs constantly for the same style,
consider adding it to this documentation.

## Modifications

The following are the modifications to
the [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html) that this repository utilizes for
it's coding conventions.

### Blank line after type declaration

There must be a blank line after the type declaration and before the first line of code in a file. This helps
readability by making the class declaration more clear at a glance.

#### Example

```kotlin
interface AudioFocusHandler {

    fun request()
}
```

### No blank lines before last closing brace

There must not be a blank line before the last closing brace of a type or function.

#### Example

```kotlin
class MyViewModel(...) : BaseViewModel() {

    override fun bind() {
        ...
    }
}
```

### Properties are declared before functions

All properties must be declared before functions. This includes private properties. This makes it easier to find
properties and functions without having to search around the file.

### Public functions declared before private functions

All public functions must be declared before the private functions. This allows for quicker understanding of the public
facing functions for the file or type.

### Nested types are declared last for a type

All nested types, such as interfaces, classes, and objects, are declared after all properties and functions of a type.
This allows for quicker understanding of the public facing functions for the file or type.