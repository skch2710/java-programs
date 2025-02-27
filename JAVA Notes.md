
					JAVA NOTES:  Sathich Kumar Ch
				-------------------------------------------
	
1. Basic of Java :
------------------
Java is a popular programming language that was created by James Gosling and his team at Sun Microsystems in the early 1990s. 

Here's a simple history of Java:
--------------------------------

1. **1991**: The project, initially called **"Oak"**, began. It was designed for interactive television, but the technology was too advanced for the cable TV industry at the time.
2. **1995**: Sun Microsystems officially released Java, naming it after the Java coffee. It was designed to be simple, portable, and secure, with the slogan **"Write Once, Run Anywhere"** because Java programs can run on any device with a Java Virtual Machine (JVM).
3. **1996**: Java 1.0 was released, marking the beginning of its widespread adoption. It included core features like the Java Development Kit (JDK) and the JVM.
4. **2000s**: Java grew rapidly, becoming a key language for web development (applets), enterprise applications, and mobile apps (especially with Android).
5. **2010**: Oracle Corporation acquired Sun Microsystems, taking over Java's development.
6. **2014**: Java 8 was released, introducing major features like **lambda expressions** and the **Stream API**, which modernized the language.
7. **2018**: Java 11 was released, marking the start of a new release cycle with updates every six months.
8. **Today**: Java remains one of the most widely used programming languages, powering everything from enterprise systems to Android apps and big data technologies.


Key Features of Java : 
-----------------------

1. **Platform Independent** – Runs on any OS with **JVM** ("Write Once, Run Anywhere").  
2. **Object-Oriented** – Uses **classes, objects, inheritance, and polymorphism**.  
3. **Simple & Readable** – Syntax is easy to learn, inspired by C++.  
4. **Secure** – Provides **bytecode verification, sandboxing, and security APIs**.  
5. **Multithreading** – Supports **concurrent execution** for better performance.  
6. **Robust** – Strong **exception handling** and memory management (Garbage Collection).  
7. **High Performance** – Uses **JIT (Just-In-Time) Compiler** for speed.  
8. **Dynamic & Extensible** – Supports **dynamic linking** and third-party libraries.  
9. **Distributed Computing** – Supports **networking and remote method invocation (RMI)**.  
10. **Automatic Memory Management** – JVM handles **Garbage Collection** to free unused objects.  


JVM , JRE and JDK :
----------------------

Java Virtual Machine (JVM), Java Runtime Environment (JRE), and Java Development Kit (JDK) are three core components of the Java platform. Each plays a specific role in the development and execution of Java applications. 

### 1. **Java Virtual Machine (JVM)**
   - **What it is**: The JVM is a virtual machine that executes Java bytecode.
   - **Purpose**: It provides a platform-independent way to run Java programs. The same bytecode can run on any device or operating system that has a JVM installed.
   - **Key Features**:
     - Converts bytecode into machine-specific instructions.
     - Handles memory management, garbage collection, and security.
     - Enables Java's **"Write Once, Run Anywhere"** capability.
   - **Example**: When you run a `.class` file (compiled Java code), the JVM executes it.

### 2. **Java Runtime Environment (JRE)**
   - **What it is**: The JRE is a software package that provides the environment to run Java applications.
   - **Purpose**: It includes the JVM and the libraries (Java Class Library) needed to execute Java programs.
   - **Key Features**:
     - Contains the JVM, core libraries, and other supporting files.
     - Does **not** include development tools like compilers or debuggers.
     - Used by end-users to run Java applications.
   - **Example**: If you want to run a Java application (like a game or software), you only need the JRE installed.

### 3. **Java Development Kit (JDK)**
   - **What it is**: The JDK is a software development kit used to develop Java applications.
   - **Purpose**: It includes everything in the JRE, plus tools for developing, debugging, and monitoring Java applications.
   - **Key Features**:
     - Contains the JRE, compiler (`javac`), debugger, and other development tools.
     - Used by developers to write, compile, and test Java programs.
   - **Example**: If you're writing Java code, you need the JDK to compile it into bytecode (`.class` files).

### **Relationship Between JVM, JRE, and JDK**
- **JDK** = **JRE** + Development Tools (e.g., `javac`, `javadoc`, `jdb`).
- **JRE** = **JVM** + Libraries (e.g., Java Class Library).
- **JVM** = Executes Java bytecode.

### **Visual Representation**
```
JDK (Java Development Kit)
   |
   |-- JRE (Java Runtime Environment)
         |
         |-- JVM (Java Virtual Machine)
         |-- Libraries (Java Class Library)
   |
   |-- Development Tools (javac, javadoc, etc.)
```

### **When to Use What**
- **JVM**: Needed to execute Java bytecode on any platform.
- **JRE**: Needed to run Java applications (for end-users).
- **JDK**: Needed to develop Java applications (for developers).


In summary:
- **JVM** runs the code.
- **JRE** provides the environment to run the code.
- **JDK** provides the tools to create the code.


Java compilation process :
-----------------------------
1. Write :   HelloWorld.java
2. Compile:  javac HelloWorld.java → HelloWorld.class
3. Run: 	 java HelloWorld → Output: "Hello, World!"

**Write code → Compile with `javac` → Generate bytecode (`.class`) → 
Load into JVM → Convert to machine code → Execute.**


First Program And Main Method :
---------------------------------

### Java "Hello, World!" Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explanation of the `main` Method

The `main` method is the entry point of any Java application. When you run a Java program, the Java Virtual Machine (JVM) looks for the `main` method to start executing the program. Here's a breakdown of the `main` method:

```java
public static void main(String[] args)
```

1. **`public`**: 
   - The `public` keyword is an access modifier. It means that the `main` method can be called from anywhere, including from outside the class. This is necessary because the JVM needs to be able to call the `main` method to start the program.

2. **`static`**:
   - The `static` keyword means that the `main` method belongs to the class itself, rather than to any specific instance of the class. This allows the JVM to call the `main` method without creating an instance of the class.

3. **`void`**:
   - The `void` keyword indicates that the `main` method does not return any value. In Java, methods can return values of various types, but the `main` method is special because it is the starting point of the program and does not need to return anything.

4. **`main`**:
   - This is the name of the method. The JVM looks for a method named `main` to start the execution of the program. The name must be exactly `main`.

5. **`String[] args`**:
   - This is the parameter that the `main` method accepts. It is an array of `String` objects. The `args` array can be used to pass command-line arguments to the program. For example, if you run the program with `java HelloWorld arg1 arg2`, then `args[0]` will be `"arg1"` and `args[1]` will be `"arg2"`.

### How the Program Works

1. **Class Declaration**:
   - `public class HelloWorld { ... }`: This declares a public class named `HelloWorld`. The name of the class must match the name of the file (i.e., the file should be named `HelloWorld.java`).

2. **`main` Method**:
   - The `main` method is where the program starts executing. When you run the program, the JVM calls the `main` method.

3. **`System.out.println("Hello, World!");`**:
   - This line prints the text "Hello, World!" to the console. `System.out` is an object that represents the standard output (usually the console), and `println` is a method that prints a line of text to the console.


Comments in Java (single-line, multi-line, Javadoc) :
--------------------------------------------------------
Java supports three types of comments:
	1. Single-line comments (`//`)
	2. Multi-line comments (`/* ... */`)
	3. Javadoc comments (`/** ... */`)

### 1. **Single-line Comment (`//`)**  
Used for short explanations. Everything after `//` on the same line is ignored by the compiler.  
```java
// This is a single-line comment
System.out.println("Hello, World!"); // Prints a message
```

### 2. **Multi-line Comment (`/* ... */`)**  
Used for longer explanations or to temporarily disable multiple lines of code.  
```java
/*
   This is a multi-line comment.
   It spans multiple lines.
*/
System.out.println("Hello, Java!");
```

### 3. **Javadoc Comment (`/** ... */`)**  
Used for generating documentation. It supports tags like `@param`, `@return`, and `@author`.  
```java
/**
 * This class demonstrates Java comments.
 * @author Sathish
 */
public class Hello {
    /**
     * Prints a message to the console.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```



### **Identifiers and Naming Conventions in Java**  
Identifiers are names used for variables, methods, classes, and other Java elements. They:  
- **Must begin** with a letter (A-Z, a-z), underscore `_`, or dollar sign `$`.  
- **Cannot be a keyword** (e.g., `int`, `class`).  
- **Cannot contain spaces** (e.g., `my Variable` is invalid).  
- **Are case-sensitive** (e.g., `MyVariable` and `myvariable` are different).  

#### **Java Naming Conventions:**  
- **Classes & Interfaces** → PascalCase (`MyClass`, `UserService`)  
- **Methods & Variables** → camelCase (`calculateTotal`, `userName`)  
- **Constants** → UPPER_CASE (`MAX_LIMIT`, `PI_VALUE`)  
- **Packages** → lowercase (`com.example.app`)  

---

### **Keywords in Java**  
Java has **53 reserved keywords**, including:  
- **Data types** → `int`, `double`, `boolean`, `char`  
- **Control flow** → `if`, `else`, `switch`, `for`, `while`, `break`, `continue`  
- **Class-related** → `class`, `interface`, `extends`, `implements`  
- **Access modifiers** → `public`, `private`, `protected`  
- **Exception handling** → `try`, `catch`, `finally`, `throw`, `throws`  
- **Other important ones** → `static`, `final`, `abstract`, `new`, `return`, `this`, `super`, `void`  

> Note: `true`, `false`, and `null` are **literals**, not keywords.  

---

### **Case Sensitivity in Java**  
Java is **case-sensitive**, meaning:  
- `MyClass` and `myclass` are **different**.  
- `int Value = 10;` and `System.out.println(value);` → **Error** (case mismatch).  
- Keywords **must** be lowercase (`int`, not `Int` or `INT`).  


### **Variables and Data Types in Java **  

#### **1. What is a Variable in Java?**  
A **variable** is a container for storing data values in memory. In Java, a variable must be declared with a **data type**, which defines the kind of data it can hold.  

#### **2. Declaring and Initializing Variables**  
A variable is declared using the following syntax:  
```java
<data_type> <variable_name> = <value>;
```
Example:  
```java
int age = 25; // Declaring an integer variable and initializing it
```
**Rules for Naming Variables:**  
- Must start with a letter (`A-Z, a-z`), underscore `_`, or dollar sign `$`.  
- Cannot start with a digit (`0-9`).  
- Cannot be a Java **keyword** (e.g., `int`, `class`).  
- Java is **case-sensitive** (`age` and `Age` are different).  

---

### **3. Types of Variables in Java**  
1. **Local Variable** – Declared inside a method or block, only accessible within it.  
2. **Instance Variable** – Declared in a class but outside any method, belongs to an object.  
3. **Static Variable** – Declared with the `static` keyword, shared by all objects of the class.  

Example:  
```java
class Example {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    void method() {
        int localVar = 30; // Local variable
    }
}
```

---

### **4. Data Types in Java**  
Java has two main types of data types:  

#### **A. Primitive Data Types (Built-in)**
Java has **8 primitive data types**:  

| Data Type | Size | Default Value | Example |
|-----------|------|--------------|----------|
| `byte` | 1 byte | `0` | `byte b = 10;` |
| `short` | 2 bytes | `0` | `short s = 100;` |
| `int` | 4 bytes | `0` | `int i = 1000;` |
| `long` | 8 bytes | `0L` | `long l = 100000L;` |
| `float` | 4 bytes | `0.0f` | `float f = 10.5f;` |
| `double` | 8 bytes | `0.0d` | `double d = 20.99;` |
| `char` | 2 bytes | `'\u0000'` | `char c = 'A';` |
| `boolean` | 1 bit | `false` | `boolean flag = true;` |

#### **B. Non-Primitive Data Types (Reference)**
These refer to objects, such as:  
- **Strings** (`String name = "Java";`)  
- **Arrays** (`int[] numbers = {1, 2, 3};`)  
- **Classes** and **Objects**  
- **Interfaces**  

---

### **5. Type Casting in Java**  
Converting one data type into another.  

**Implicit Casting (Widening) → Small to large type (automatic)**  
```java
int num = 10;
double d = num; // int → double
```

**Explicit Casting (Narrowing) → Large to small type (manual, may lose data)**  
```java
double d = 10.99;
int num = (int) d; // double → int (manual)
```

---

### **6. Constants in Java (`final` Keyword)**  
A **constant** is a variable whose value **cannot be changed**.  
```java
final double PI = 3.14159;
PI = 3.14; // Error! Cannot modify final variable
```

---

### **Summary**  
- A **variable** is a named memory location for storing data.  
- Java has **primitive** (built-in) and **non-primitive** (reference) data types.  
- **Type casting** allows conversion between data types.  
- The `final` keyword is used for **constants** that cannot change.  


 **String, StringBuffer, and StringBuilder in Java**  :
-------------------------------------------------------

Java provides three classes to handle and manipulate strings: **String**, **StringBuffer**, and **StringBuilder**.  

---

### **1. String (Immutable)**
- **Immutable (unchangeable)** – Any modification creates a new object.
- Stored in the **String Pool** (for memory optimization).
- **Thread-safe** (safe for multi-threading).
- Slower for frequent modifications because a new object is created each time.

**Example:**
```java
String s1 = "Hello";  //"Hello" → Stored in the String Pool. 
String s2 = s1 + " World";  //" World" → A new String literal in the String Pool.
//s1 + " World" → Since String is immutable, a new String object ("Hello World") is created in Heap Memory.

System.out.println(s2);   
//Totally  3 String objects Created.

```

---

### **2. StringBuffer (Mutable, Thread-Safe)**
- **Mutable (changeable)** – Modifications happen in the same object.
- **Thread-safe** (synchronized, slower in single-threaded environments).
- **Faster than String** when modifying strings multiple times.

**Example:**
```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World"); // Modifies the same object
System.out.println(sb); // Output: Hello World
```

---

### **3. StringBuilder (Mutable, Not Thread-Safe)**
- **Mutable**, like `StringBuffer`.
- **Not synchronized** (not thread-safe but faster).
- **Best for single-threaded applications** where speed is important.

**Example:**
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // Output: Hello World
```

---

### **Key Differences**

| Feature        | String | StringBuffer | StringBuilder |
|---------------|--------|-------------|--------------|
| **Mutable**   | ❌ No (Immutable) | ✅ Yes | ✅ Yes |
| **Thread-Safe** | ✅ Yes | ✅ Yes | ❌ No |
| **Performance** | ❌ Slow (new object each time) | 🟠 Moderate (synchronized) | ✅ Fast (not synchronized) |
| **Best For** | **Fixed text** (e.g., constants, keys) | **Multi-threaded apps** | **Single-threaded apps** |

### **When to Use What?**
✔ Use **String** if the value won’t change.  
✔ Use **StringBuffer** if modifications are frequent and **thread safety** is needed.  
✔ Use **StringBuilder** if modifications are frequent but **no thread safety** is needed (faster than StringBuffer).  


### **String Comparison in Java (`==`, `equals()`, `compareTo()`)**  :
-----------------------------------------------------------------------

In Java, you can compare strings using **`==`**, **`equals()`**, and **`compareTo()`**. Each works differently:

### **1. `==` (Reference Comparison)**
- Compares **memory addresses** (whether two variables point to the same object).
- Works for **interned Strings** (stored in the String Pool).
- Does **not** compare actual content.

**Example:**
```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2); // true (both point to the same object in String Pool)
System.out.println(s1 == s3); // false (s3 is in Heap, not in the Pool)
```

---

### **2. `equals()` (Content Comparison)**
- Compares **actual characters** inside the String.
- Ignores memory location.
- **Case-sensitive**.

**Example:**
```java
String s1 = "Hello";
String s2 = new String("Hello");

System.out.println(s1.equals(s2)); // true (same content)
System.out.println(s1.equals("hello")); // false (case-sensitive)
```

---

### **3. `compareTo()` (Lexicographical Comparison)**
- Used for **sorting** (dictionary order).
- Returns:
  - `0` if both strings are equal.
  - A **positive** number if the first string is **greater**.
  - A **negative** number if the first string is **smaller**.
- **Case-sensitive** (`A` < `B` < `C` ... < `a` < `b` < `c`).

**Example:**
```java
String s1 = "Apple";
String s2 = "Banana";
String s3 = "Apple";

System.out.println(s1.compareTo(s2)); // Negative (-ve) → "Apple" is smaller than "Banana"
System.out.println(s1.compareTo(s3)); // 0 → Both are equal
System.out.println(s2.compareTo(s1)); // Positive (+ve) → "Banana" is greater than "Apple"
```



Operators :
---------------
  - Arithmetic operators (+, -, *, /, %)
  - Relational operators (==, !=, >, <, >=, <=)
  - Logical operators (&&, ||, !)
  - Bitwise operators (&, |, ^, ~, <<, >>, >>>)
  - Assignment operators (=, +=, -=, *=, /=, %=)
  - Unary operators (++, --, +, -, !)
  - Ternary operator (? :)
  - Operator precedence

Operators in Java are symbols that perform operations on variables and values. They are categorized into different types based on their functionality. Below is a detailed explanation of each type of operator in Java:

---

### 1. **Arithmetic Operators**
Arithmetic operators are used to perform basic mathematical operations.

| Operator | Description           | Example          |
|----------|-----------------------|------------------|
| `+`      | Addition              | `int a = 5 + 3;` |
| `-`      | Subtraction           | `int b = 5 - 3;` |
| `*`      | Multiplication        | `int c = 5 * 3;` |
| `/`      | Division              | `int d = 5 / 3;` |
| `%`      | Modulus (remainder)   | `int e = 5 % 3;` |

#### Example:
```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3 (integer division)
System.out.println(a % b); // 1 (remainder)
```

---

### 2. **Relational Operators**
Relational operators are used to compare two values or variables.

| Operator | Description                  | Example            |
|----------|------------------------------|--------------------|
| `==`     | Equal to                     | `a == b`           |
| `!=`     | Not equal to                 | `a != b`           |
| `>`      | Greater than                 | `a > b`            |
| `<`      | Less than                    | `a < b`            |
| `>=`     | Greater than or equal to     | `a >= b`           |
| `<=`     | Less than or equal to        | `a <= b`           |

#### Example:
```java
int x = 10, y = 20;
System.out.println(x == y); // false
System.out.println(x != y); // true
System.out.println(x > y);  // false
System.out.println(x < y);  // true
System.out.println(x >= y); // false
System.out.println(x <= y); // true
```

---

### 3. **Logical Operators**
Logical operators are used to combine multiple conditions.

| Operator | Description                  | Example                     |
|----------|------------------------------|-----------------------------|
| `&&`     | Logical AND                  | `(a > b) && (a > c)`        |
| `||`     | Logical OR                   | `(a > b) || (a > c)`        |
| `!`      | Logical NOT                  | `!(a > b)`                  |

#### Example:
```java
boolean a = true, b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);    // false
```

---

### 4. **Bitwise Operators**
Bitwise operators perform operations on individual bits of integer values.

| Operator | Description                  | Example          |
|----------|------------------------------|------------------|
| `&`      | Bitwise AND                  | `a & b`          |
| `|`      | Bitwise OR                   | `a | b`          |
| `^`      | Bitwise XOR                  | `a ^ b`          |
| `~`      | Bitwise NOT (complement)     | `~a`             |
| `<<`     | Left shift                   | `a << 1`         |
| `>>`     | Right shift (signed)         | `a >> 1`         |
| `>>>`    | Right shift (unsigned)       | `a >>> 1`        |

#### Example:
```java
int a = 5, b = 3; // Binary: 5 = 0101, 3 = 0011
System.out.println(a & b);  // 1 (0101 & 0011 = 0001)
System.out.println(a | b);  // 7 (0101 | 0011 = 0111)
System.out.println(a ^ b);  // 6 (0101 ^ 0011 = 0110)
System.out.println(~a);     // -6 (complement of 0101)
System.out.println(a << 1); // 10 (0101 << 1 = 1010)
System.out.println(a >> 1); // 2 (0101 >> 1 = 0010)
System.out.println(a >>> 1);// 2 (0101 >>> 1 = 0010)
```

---

### 5. **Assignment Operators**
Assignment operators are used to assign values to variables.

| Operator | Description                  | Example          |
|----------|------------------------------|------------------|
| `=`      | Simple assignment            | `a = 5;`         |
| `+=`     | Add and assign               | `a += 5;`        |
| `-=`     | Subtract and assign          | `a -= 5;`        |
| `*=`     | Multiply and assign          | `a *= 5;`        |
| `/=`     | Divide and assign            | `a /= 5;`        |
| `%=`     | Modulus and assign           | `a %= 5;`        |

#### Example:
```java
int a = 10;
a += 5; // a = 15
a -= 3; // a = 12
a *= 2; // a = 24
a /= 4; // a = 6
a %= 5; // a = 1
```

---

### 6. **Unary Operators**
Unary operators operate on a single operand.

| Operator | Description                  | Example          |
|----------|------------------------------|------------------|
| `++`     | Increment (pre/post)         | `a++` or `++a`   |
| `--`     | Decrement (pre/post)         | `a--` or `--a`   |
| `+`      | Unary plus (indicates sign)  | `+a`             |
| `-`      | Unary minus (negates value)  | `-a`             |
| `!`      | Logical NOT                  | `!a`             |

#### Example:
```java
int a = 5;
System.out.println(a++); // 5 (post-increment)
System.out.println(++a); // 7 (pre-increment)
System.out.println(-a);  // -7
```

---

### 7. **Ternary Operator**
The ternary operator is a shorthand for `if-else` statements.

| Operator | Description                  | Example                     |
|----------|------------------------------|-----------------------------|
| `? :`    | Ternary operator             | `result = (a > b) ? a : b;` |

#### Example:
```java
int a = 10, b = 20;
int max = (a > b) ? a : b; // max = 20
```

---

### 8. **Operator Precedence**
Operator precedence determines the order in which operators are evaluated in an expression. Higher precedence operators are evaluated first.

| Precedence | Operators                          |
|------------|------------------------------------|
| Highest    | `()`, `[]`, `.` (method access)    |
|            | `++`, `--`, `!`, `~`, `+`, `-`     |
|            | `*`, `/`, `%`                      |
|            | `+`, `-`                           |
|            | `<<`, `>>`, `>>>`                  |
|            | `<`, `<=`, `>`, `>=`, `instanceof` |
|            | `==`, `!=`                         |
|            | `&`                                |
|            | `^`                                |
|            | `|`                                |
|            | `&&`                               |
|            | `||`                               |
|            | `? :` (ternary)                    |
| Lowest     | `=`, `+=`, `-=`, `*=`, `/=`, `%=`  |

#### Example:
```java
int result = 10 + 5 * 2; // 20 (5 * 2 is evaluated first)
```

---

### Summary
- **Arithmetic operators**: Perform basic math operations.
- **Relational operators**: Compare values.
- **Logical operators**: Combine boolean expressions.
- **Bitwise operators**: Perform operations on bits.
- **Assignment operators**: Assign values to variables.
- **Unary operators**: Operate on a single operand.
- **Ternary operator**: Shorthand for `if-else`.
- **Operator precedence**: Determines evaluation order.

***Note :****
The && operator only checks the second condition if the first one is true (it stops early if the first condition is false).
The & operator always checks both conditions, even if the first one is false.


