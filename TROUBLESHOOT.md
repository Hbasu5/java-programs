# Troubleshoot

If the program does not run, follow these simple steps.

# Step 1 — Check Your Java Version
- Open Command Prompt
- Type the following two commands one after another  ```java -version``` and ```javac -version```
- You should see something like this -  ```java version "1.8.0"``` and  ```javac version 1.8.0```

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

# Step 5 — Follow This If You Do NOT Want To Install A New Java Version

Check the class file version and the Java Runtime version

**Example**

```Exception in thread "main" java.lang.UnsupportedClassVersionError: <"PROGRAM NAME"> has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 52.0```

From here - class file version is ```class file version 61.0``` and Java Runtime version is ```52.0```

What this mean:
- The program was compiled using Java 17
- But your system is running Java 8

Use the reference table given below to check JDK version, Class File Version and their corresponding Compile Command (**Force Compatibilty**)


| JDK Version | Class File Version | Compile Command |
|---|---|---|
| Java 8 | 52.0 | ```javac --release 8 <"FILENAME">.java``` |
| Java 9 | 53.0 | ```javac --release 9 <"FILENAME">.java``` |
| Java 10 | 54.0 | ```javac --release 10 <"FILENAME">.java``` |
| Java 11 | 55.0 | ```javac --release 11 <"FILENAME">.java``` |
| Java 12 | 56.0 | ```javac --release 12 <"FILENAME">.java``` |
| Java 13 | 57.0 | ```javac --release 13 <"FILENAME">.java``` |
| Java 14 | 58.0 | ```javac --release 14 <"FILENAME">.java``` |
| Java 15 | 59.0 | ```javac --release 15 <"FILENAME">.java``` |
| Java 16 | 60.0 | ```javac --release 16 <"FILENAME">.java``` |
| Java 17 | 61.0 | ```javac --release 17 <"FILENAME">.java``` |
| Java 18 | 62.0 | ```javac --release 18 <"FILENAME">.java``` |
| Java 19 | 63.0 | ```javac --release 19 <"FILENAME">.java``` |
| Java 20 | 64.0 | ```javac --release 20 <"FILENAME">.java``` |
| Java 21 | 65.0 | ```javac --release 21 <"FILENAME">.java``` |
| Java 22 | 66.0 | ```javac --release 22 <"FILENAME">.java``` |

**Quick Commmand Line**

Recompile using: ```javac --release <JDK_VERSION>  <"FILENAME">.java```

Then run: ```java <"FILENAME">```

**Replace <"FILENAME"> with the program name**

**What this does - This forces the program to be compatible with your Java version.**

---

Hope it helps!

If any problems persist, feel free to contact me from the either of the e-mail addresses

**© 2026 Hardik Basu**
