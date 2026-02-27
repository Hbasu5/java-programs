# Troubleshoot

If the program does not run, follow these simple steps.

# Step 1 — Check Your Java Version
- Open Command Prompt
- Type two command one after another  ```java -version``` and ```javac -version```
- You will see some like this -  ```java version "1.8.0"``` and  ```javac version 1.8.0```

**Both versions must match**

If not, follow the steps given below

# Step 2 — Which Version Should You Use?

This repository is developed and tested using:
**```Java 8```**

If your version is not Java 8, install it.

# Step 3 — Download Java 8 (If you do not want to install a new Java Version, follow Step 5)
Download Java 8 (Recommended: OpenJDK):

<pre> <a href="https://adoptium.net/temurin/releases/?version=8"><b>ADOPTIUM</b></a> </pre>

Choose:
- Windows (or your OS)
- x64
- Installer (.msi)

Install it and restart your computer.

# Step 4 — Test Again
After restarting, run: ```java -version``` and ```javac -version```

**Both should show version 1.8**

Now compile and run: ```javac <"FILENAME">.java``` and ```java <"FILENAME">```

**Replace <"FILENAME"> with the program name**

# Step 5 — Follow this if you do NOT want to install a new Java Version

Check the class file version and the Java Runtime version

**Example**

```Exception in thread "main" java.lang.UnsupportedClassVersionError: <"PROGRAM NAME"> has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 52.0```

From here - class file version is ```class file version 61.0``` and Java Runtime version is ```52.0```

What it mean:
- The program was compiled using Java 17
- But your system is running Java 8

Use the reference table given below to check JDK version, Class File Version and their corresponding Compile Command (**Force Compatibilty**)


| JDK Version | Class File Version | Compile Command |
|---|---|---|
| Java 8 | 52.0 | ```javac --release 8 <"FILENAME">.java``` |
| Java 11 | 55.0 | ```javac --release 11 <"FILENAME">.java``` |
| Java 17 | 61.0 | ```javac --release 17 <"FILENAME">.java``` |

**Quick Commmand Line**

Recompile using: ```javac --release <JDK_VERSION>  <"FILENAME">.java```

Then run: ```java <"FILENAME">```

**Replace <"FILENAME"> with the program name**

**What this does - This forces the program to be compatible with you Java version.**

---

Hope it helps!

If any problems persist, feel free to contact me from the either of the e-mail addresses

**© 2026 Hardik Basu**
