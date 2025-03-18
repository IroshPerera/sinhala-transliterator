# Sinhala to Latin Transliterator

This Java library provides a simple and efficient way to transliterate Sinhala script into Latin characters using predefined mapping rules. It is designed to help developers integrate Sinhala text processing into their applications with ease.

## Features
- Supports Sinhala vowels, consonants, and diacritics.
- Handles special characters, digits, and punctuation.
- Ignores unsupported characters while preserving input integrity.
- Lightweight and easy to integrate into Java applications.

## Installation

To use this transliterator in your Java project, you can add it as a dependency via **Maven** or **Gradle**.

### **Maven Dependency**

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>com.webmotech</groupId>
    <artifactId>sinhala-transliterator</artifactId>
    <version>1.0.0</version>
</dependency>
```

### **Gradle Dependency**

Add the following to your `build.gradle`:

```gradle
dependencies {
    implementation 'com.webmotech:sinhala-transliterator:1.0.0'
}
```


## Usage

To transliterate Sinhala text into Latin characters, you can use the `SinhalaTransliterator` class provided by this library. Here's a simple example:

```java
import com.webmotech.transliterator.SinhalaToLatinTransliterator;

public class Main {
    public static void main(String[] args) {
        String sinhalaText = "සිංහල";
        String latinText = SinhalaToLatinTransliterator.transliterate(sinhalaText);
        System.out.println(latinText);  // Output: siṁhala
    }
}
```

## License

This library is licensed under the [MIT License](LICENSE).
