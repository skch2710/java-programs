
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

### **Input and Output (I/O) in Java**  :
---------------------------------------------

Java provides various ways to handle **input and output (I/O)** operations for reading data from users, files, and streams.  

---

### **1. Standard Input (User Input)**
#### **(a) Using `Scanner` **
- Reads input from the console (keyboard).  
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        sc.close();
    }
}
```

#### **(b) Using `BufferedReader` (Faster for large input)**
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + num);
    }
}
```

---

### **2. Standard Output (Console Output)**
#### **(a) Using `System.out.print()` and `System.out.println()`**
- `print()` – Prints without a new line.  
- `println()` – Prints and moves to the next line.  
```java
System.out.print("Hello ");
System.out.println("World"); // Output: Hello World
```

#### **(b) Using `System.out.printf()` (Formatted Output)**
```java
System.out.printf("Hello %s, your score is %d%n", "John", 90);
```

---

### **3. File I/O (Reading & Writing Files)**
#### **(a) Writing to a File (`FileWriter`)**
```java
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello, File!");
        writer.close();
    }
}
```

#### **(b) Reading from a File (`BufferedReader`)**
```java
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
```

---

### **4. Streams (Advanced I/O)**
- **`InputStream` / `OutputStream`** – Handles **byte streams** (e.g., images, audio).  
- **`Reader` / `Writer`** – Handles **character streams** (e.g., text files).  

---

### **5. Difference Between Scanner & BufferedReader**
| Feature         | Scanner | BufferedReader |
|---------------|----------|----------------|
| **Speed**      | Slower | Faster for large input |
| **Data Type Handling** | Direct parsing (`nextInt()`, `nextLine()`) | Requires manual conversion (`Integer.parseInt()`) |
| **Buffering**  | No internal buffering | Uses a buffer for efficiency |

---

✔ **Use `Scanner`** for simple console input.  
✔ **Use `BufferedReader`** for large input handling.  
✔ **Use `FileWriter` / `FileReader`** for file operations. 


Arrays in Java :
-----------------
An array in Java is a fixed-size, ordered collection of elements of the same data type. Arrays store multiple values in contiguous memory locations and provide fast access using an index.

**Types of Arrays: **
(a) One-Dimensional Array : A single row of elements stored sequentially.
(b) Two-Dimensional Array (Matrix) : An array of arrays, often used to represent tables or grids.
(c) Multi-Dimensional Array : Arrays with more than two dimensions (e.g., 3D arrays).

**Limitations of Arrays:**
	Fixed Size – Cannot resize dynamically.
	No Built-in Methods – Unlike ArrayList, arrays lack utility methods.
	
**array examples**:  

```java
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayExamples {
    public static void main(String[] args) {
        // 1. One-Dimensional Array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("First element: " + numbers[0]);

        // 2. Two-Dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix element at [1][2]: " + matrix[1][2]);

        // 3. Looping through an array (for loop)
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 4. Enhanced for loop
        System.out.print("Enhanced for loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 5. Sorting an array
        int[] unsortedArr = {5, 2, 8, 1, 3};
        Arrays.sort(unsortedArr);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArr));

        // 6. Searching in an array (binary search)
        int index = Arrays.binarySearch(unsortedArr, 3);
        System.out.println("Index of 3: " + index);

        // 7. Filling an array with a value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 100);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // 8. Dynamic Array (ArrayList)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("ArrayList: " + list);
    }
}
```

### **Difference Between Array and ArrayList**  

#### **1. Size**  
- **Array:** Fixed size (cannot grow or shrink).  
- **ArrayList:** Dynamic size (automatically resizes).  

#### **2. Data Type Support**  
- **Array:** Can store both **primitive types** and objects.  
- **ArrayList:** Stores only **objects** (uses wrapper classes for primitives).  

#### **3. Performance**  
- **Array:** Faster as it provides direct memory access.  
- **ArrayList:** Slightly slower due to dynamic resizing and extra operations.  

#### **4. Methods & Functionality**  
- **Array:** No built-in methods (manual operations required).  
- **ArrayList:** Provides methods like `add()`, `remove()`, `size()`, etc.  

#### **5. Memory Usage**  
- **Array:** Uses less memory as size is fixed.  
- **ArrayList:** Uses more memory due to dynamic resizing overhead.  

#### **6. Iteration**  
- **Array:** Uses traditional loops (`for`, `enhanced for`).  
- **ArrayList:** Supports loops + iterators (`forEach()`).  

✔ **Use Array** when size is fixed and performance is a priority.  
✔ **Use ArrayList** when dynamic resizing and flexibility are needed. 



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
  
### **Control Flow in Java**  :
----------------------------------

Control flow statements in Java determine the order in which **statements are executed** based on **conditions**.  

---

### **1. Conditional Statements**  
Conditional statements allow decision-making based on conditions.  

#### **(a) `if` Statement**  
- Executes a block **only if** the condition is `true`.  

#### **(b) `if-else` Statement**  
- Executes one block if `true`, another if `false`.  

#### **(c) Nested `if` Statements**  
- An `if` inside another `if`, used for multiple conditions.  

#### **(d) `else if` Ladder**  
- Checks multiple conditions sequentially.  

#### **(e) `switch` Statement**  
- Replaces multiple `if-else` statements when checking a variable against **multiple fixed values**.  

#### **(f) Enhanced `switch` (Java 17)**  
- Supports **multiple case labels**, **arrow functions**, and **pattern matching**.  

---

### **Example Code (All Cases in One Class)**  
```java
public class ControlFlowExample {
    public static void main(String[] args) {
        int num = 5;

        // 1. if Statement
        if (num > 0) {
            System.out.println("Positive number");
        }

        // 2. if-else Statement
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // 3. Nested if
        if (num > 0) {
            if (num < 10) {
                System.out.println("Single-digit positive number");
            }
        }

        // 4. else-if Ladder
        if (num < 0) {
            System.out.println("Negative number");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive number");
        }

        // 5. switch Statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 6. Enhanced switch (Java 17)
        int grade = 90;
        String result = switch (grade) {
            case 100, 90 -> "Excellent";
            case 80, 70 -> "Good";
            case 60, 50 -> "Pass";
            default -> "Fail";
        };
        System.out.println("Grade Result: " + result);
    }
}
```  


### **Loops in Java**  :
--------------------------

Loops are used to execute a block of code **repeatedly** until a condition is met.  

---

### **1. Types of Loops**  

#### **(a) `for` Loop (Traditional & Enhanced)**  
- **Traditional `for` Loop**: Used when the number of iterations is **known**.  
- **Enhanced `for` Loop (For-each Loop)**: Used for **arrays & collections**.  

#### **(b) `while` Loop**  
- Executes **while** a condition is `true`.  
- Used when the number of iterations is **unknown**.  

#### **(c) `do-while` Loop**  
- Executes at **least once**, even if the condition is `false`.  
- Condition is checked **after** the first execution.  

#### **(d) Nested Loops**  
- A loop inside another loop.  
- Used for **matrix operations, patterns, and multi-level iterations**.  

---

### **2. Loop Control Statements**  

#### **(a) `break` Statement**  
- **Exits** the loop **immediately** when encountered.  

#### **(b) `continue` Statement**  
- **Skips** the current iteration and moves to the next.  

#### **(c) `return` Statement**  
- **Exits the method** entirely when encountered.  

---

### **Example Code**  

```java
public class LoopExamples {
    public static void main(String[] args) {

        // 1. for Loop (Traditional)
        System.out.println("Traditional for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. Enhanced for Loop (For-each)
        System.out.println("Enhanced for loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 3. while Loop
        System.out.println("while loop:");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("\n");

        // 4. do-while Loop
        System.out.println("do-while loop:");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println("\n");

        // 5. Nested Loops
        System.out.println("Nested loops (Multiplication Table for 1-3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 6. break Statement
        System.out.println("Loop with break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break; // Exit loop when i = 5
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 7. continue Statement
        System.out.println("Loop with continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // Skip iteration when i = 3
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 8. return Statement
        System.out.println("Loop with return:");
        printNumbersWithReturn();
    }

    static void printNumbersWithReturn() {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) return; // Exit method when i = 4
            System.out.print(i + " ");
        }
    }
}
```


### **Object-Oriented Programming (OOP) in Java**  :
------------------------------------------------------

Object-Oriented Programming (OOP) is a programming paradigm based on **objects** that contain **data (fields/attributes)** and **methods (functions)** to manipulate the data.  

---

## **1. Classes and Objects**  

### **Classes**  
- A **class** is a blueprint for creating objects.  
- It defines **attributes (variables)** and **methods (functions)**.  

### **Objects**  
- An **object** is an instance of a class.  
- Objects have **state (attributes)** and **behavior (methods)**.  

### **Constructors**  
- A **constructor** initializes an object.  
- **Types:**
  - **Default Constructor** – No parameters.
  - **Parameterized Constructor** – Takes arguments to initialize fields.  

### **Keywords**  
- **`this` keyword**: Refers to the **current object**.  
- **Instance variables vs. Local variables**:  
  - **Instance variables**: Defined inside a class, but outside methods.  
  - **Local variables**: Declared within a method/block.  
- **Static variables & methods**: Belong to the **class** rather than an instance.  

---

## **2. Methods**  

- **Method Declaration & Definition**: Define the behavior of objects.  
- **Method Overloading**: Multiple methods with the same name but different parameters.  
- **Passing Arguments (By Value)**: Java uses **call by value**, meaning changes inside a method **don’t affect the original value**.  
- **Static Methods vs. Instance Methods**:  
  - **Static methods** belong to the class, **called using class name**.  
  - **Instance methods** belong to objects.  

---

## **3. Encapsulation**  

- **Encapsulation**: Wrapping data and methods together in a **single unit (class)**.  
- **Access Modifiers**:  
  - **`private`** – Accessible only within the class.  
  - **`public`** – Accessible from anywhere.  
  - **`protected`** – Accessible in the same package and subclasses.  
  - **(default)** – Accessible only within the same package.  
- **Getters and Setters**: Used for **data hiding** and controlled access.  

---

## **4. Inheritance**  

- **Inheritance**: Acquiring properties and behavior from a **parent class**.  
- **`extends` keyword**: Used for inheritance.  
- **Method Overriding**: Redefining a method in the child class.  
- **`super` keyword**: Calls the **parent class’s constructor or method**.  
- **Dynamic Method Dispatch**: Runtime method binding based on the object type.  
- **`final` keyword**: Prevents method overriding or class inheritance.  

---

## **5. Polymorphism**  

- **Compile-time Polymorphism (Method Overloading)**: Same method name, different parameters.  
- **Runtime Polymorphism (Method Overriding)**: The method implementation is **determined at runtime**.  
- **Upcasting**: Parent class reference holding a child class object.  
- **Downcasting**: Converting a parent reference back to a child type.  

---

## **6. Abstraction**  

- **Abstract Classes**: Cannot be instantiated, contains **abstract methods (without body)**.  
- **Interfaces**: Defines behavior that other classes must implement.  
- **Functional Interfaces (Java 8+)**: Single abstract method (used in Lambda expressions).  
- **Abstract Class vs. Interface**:  
  - **Abstract Class**: Can have both **implemented & abstract** methods.  
  - **Interface**: Only **abstract methods** (before Java 8), can have **default & static methods** (Java 8+).  

---

## **7. Association**  

- **Aggregation**: Weak relationship (child **can exist** without the parent).  
- **Composition**: Strong relationship (child **cannot exist** without the parent).  

---

### **Example Code **  

```java
// 1. Class and Object
class Person {
    private String name;  // Encapsulation (private variable)
    private int age;

    // 2. Constructor (Default & Parameterized)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 4. Method Overloading (Compile-time Polymorphism)
    public void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void showDetails(String prefix) {
        System.out.println(prefix + " Name: " + name + ", Age: " + age);
    }
}

// 5. Inheritance and Method Overriding (Runtime Polymorphism)
class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);  // Calls Parent Constructor
        this.jobTitle = jobTitle;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + getName() + ", Age: " + getAge() + ", Job: " + jobTitle);
    }
}

// 6. Interface (Abstraction)
interface Vehicle {
    void drive();
}

// 7. Implementing Interface
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}

// 8. Abstract Class
abstract class Animal {
    abstract void makeSound(); // Abstract method

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// 9. Implementing Abstract Class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// 10. Main Class to Run Everything
public class OOPExample {
    public static void main(String[] args) {
        // 1. Object Creation
        Person p1 = new Person("Alice", 25);
        p1.showDetails();

        // 2. Inheritance and Polymorphism
        Employee e1 = new Employee("Bob", 30, "Software Engineer");
        e1.showDetails();

        // 3. Interface Implementation
        Vehicle myCar = new Car();
        myCar.drive();

        // 4. Abstract Class Implementation
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}
```

---

### **Key Takeaways**  

✔ **Encapsulation** → Data hiding using private variables & getters/setters.  
✔ **Inheritance** → Code reusability via parent-child relationship.  
✔ **Polymorphism** → Different behaviors for the same method name.  
✔ **Abstraction** → Hiding implementation details (Abstract Classes & Interfaces).  
✔ **Association** → Objects relating to each other (Aggregation & Composition).  


Java Collections :
----------------------

Collections in Java are part of the **Java Collections Framework (JCF)**, which provides a set of interfaces and classes for handling groups of objects efficiently.  

### **Key Interfaces in Java Collections Framework**
1. **List** (Ordered, allows duplicates)  
   - Implementations: `ArrayList`, `LinkedList`, `Vector`, `Stack`
   
2. **Set** (Unique elements, unordered)  
   - Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`
   
3. **Queue** (FIFO ordering)  
   - Implementations: `PriorityQueue`, `ArrayDeque`, `ConcurrentLinkedQueue`, `LinkedList` (acts as Queue)
   
4. **Map** (Key-Value pairs, unique keys)  
   - Implementations: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, `ConcurrentHashMap`
   


`ArrayList`, `LinkedList`, `Vector`, `Stack`, and `CopyOnWriteArrayList` :
-------------------------------------------------------------------------------


Below are the details of `ArrayList`, `LinkedList`, `Vector`, `Stack`, and `CopyOnWriteArrayList`, including their **internal implementations**, key features, and use cases.

---

## **1. ArrayList**

### **Key Features of ArrayList**
1. **Dynamic Resizing**:
   - `ArrayList` is a resizable array that grows dynamically as elements are added.

2. **Ordered Collection**:
   - Maintains the insertion order of elements.

3. **Allows Duplicates**:
   - Can store duplicate elements.

4. **Allows `null` Values**:
   - Can store `null` values.

5. **Not Synchronized**:
   - `ArrayList` is not thread-safe. For thread-safe operations, use `Collections.synchronizedList(new ArrayList<>())`.

6. **Fast Random Access**:
   - Provides constant-time (`O(1)`) access to elements using indices.

---

### **Internal Implementation**
- Internally, `ArrayList` uses a **dynamic array** to store elements.
- When the array reaches its capacity and a new element is added, the `ArrayList` creates a new array with a larger size (typically 1.5 times the current size) and copies all elements from the old array to the new one.

---

### **Example Usage**
```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("Element at index 1: " + list.get(1)); // Output: Banana

        // Remove elements
        list.remove("Cherry");

        // Iterate over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

---

## **2. LinkedList**

### **Key Features of LinkedList**
1. **Doubly Linked List**:
   - `LinkedList` uses a doubly linked list to store elements.

2. **Ordered Collection**:
   - Maintains the insertion order of elements.

3. **Allows Duplicates**:
   - Can store duplicate elements.

4. **Allows `null` Values**:
   - Can store `null` values.

5. **Not Synchronized**:
   - `LinkedList` is not thread-safe. For thread-safe operations, use `Collections.synchronizedList(new LinkedList<>())`.

6. **Efficient Insertions/Deletions**:
   - Provides constant-time (`O(1)`) insertions and deletions at both ends.

---

### **Internal Implementation**
- Internally, `LinkedList` uses a **doubly linked list**.
- Each node in the list contains:
  - The actual data (element).
  - A reference to the previous node.
  - A reference to the next node.

---

### **Example Usage**
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("First element: " + list.getFirst()); // Output: Apple

        // Remove elements
        list.removeLast();

        // Iterate over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

---

## **3. Vector**

### **Key Features of Vector**
1. **Dynamic Resizing**:
   - `Vector` is a resizable array that grows dynamically as elements are added.

2. **Ordered Collection**:
   - Maintains the insertion order of elements.

3. **Allows Duplicates**:
   - Can store duplicate elements.

4. **Allows `null` Values**:
   - Can store `null` values.

5. **Synchronized**:
   - `Vector` is thread-safe, making it suitable for multi-threaded environments.

6. **Legacy Class**:
   - `Vector` is a legacy class from Java 1.0.

---

### **Internal Implementation**
- Internally, `Vector` uses a **dynamic array** to store elements.
- When the array reaches its capacity and a new element is added, the `Vector` creates a new array with a larger size (typically double the current size) and copies all elements from the old array to the new one.

---

### **Example Usage**
```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Access elements
        System.out.println("Element at index 1: " + vector.get(1)); // Output: Banana

        // Remove elements
        vector.remove("Cherry");

        // Iterate over the vector
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
```

---

## **4. Stack**

### **Key Features of Stack**
1. **LIFO Order**:
   - `Stack` is a Last-In-First-Out (LIFO) data structure.

2. **Extends Vector**:
   - `Stack` extends the `Vector` class and inherits its methods.

3. **Synchronized**:
   - `Stack` is thread-safe, making it suitable for multi-threaded environments.

4. **Legacy Class**:
   - `Stack` is a legacy class from Java 1.0.

---

### **Internal Implementation**
- Internally, `Stack` uses a **dynamic array** (inherited from `Vector`) to store elements.
- The `push` and `pop` operations are implemented using the array.

---

### **Example Usage**
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Access the top element
        System.out.println("Top element: " + stack.peek()); // Output: Cherry

        // Pop elements
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
```

---

## **5. CopyOnWriteArrayList**

### **Key Features of CopyOnWriteArrayList**
1. **Thread-Safe**:
   - `CopyOnWriteArrayList` is a thread-safe variant of `ArrayList`.

2. **Copy-on-Write Mechanism**:
   - Whenever the list is modified, a new copy of the underlying array is created.

3. **No Locking for Reads**:
   - Read operations do not require locking, making them very fast.

4. **Fail-Safe Iterators**:
   - Iterators do not throw `ConcurrentModificationException`.

---

### **Internal Implementation**
- Internally, `CopyOnWriteArrayList` uses a **volatile array** to store elements.
- When a modification is made, a new copy of the array is created, and the reference to the array is updated.

---

### **Example Usage**
```java
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("Element at index 1: " + list.get(1)); // Output: Banana

        // Iterate over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

---

### **Comparison of ArrayList, LinkedList, Vector, Stack, and CopyOnWriteArrayList**

| Feature                | ArrayList          | LinkedList         | Vector             | Stack              | CopyOnWriteArrayList |
|------------------------|--------------------|--------------------|--------------------|--------------------|-----------------------|
| **Internal Structure** | Dynamic Array      | Doubly Linked List | Dynamic Array      | Dynamic Array      | Volatile Array        |
| **Order**              | Insertion Order    | Insertion Order    | Insertion Order    | LIFO Order         | Insertion Order       |
| **Thread-Safety**      | Not Thread-Safe    | Not Thread-Safe    | Thread-Safe        | Thread-Safe        | Thread-Safe           |
| **Null Values**        | Allowed            | Allowed            | Allowed            | Allowed            | Allowed               |
| **Performance**        | Fast Random Access | Fast Insertions    | Slower than ArrayList | Slower than Vector | Fast Reads            |

---



`HashSet`, `LinkedHashSet`, and `TreeSet` :
-------------------------------------------------


Below are the details of `HashSet`, `LinkedHashSet`, and `TreeSet`, which are implementations of the `Set` interface in Java. Each of these classes has unique characteristics and use cases.

---

## **1. HashSet**

### **Key Features of HashSet**
1. **Unordered Collection**:
   - `HashSet` does not maintain any order of elements. The elements are stored based on their hash code.

2. **No Duplicates**:
   - `HashSet` does not allow duplicate elements. If you try to add a duplicate, it will simply ignore the operation.

3. **Allows `null` Values**:
   - `HashSet` can store one `null` value.

4. **Backed by a HashMap**:
   - Internally, `HashSet` uses a `HashMap` to store its elements. The elements are stored as keys in the `HashMap`, and a dummy object (`PRESENT`) is used as the value.

5. **Not Synchronized**:
   - `HashSet` is not thread-safe. For thread-safe operations, use `Collections.synchronizedSet(new HashSet<>())`.

6. **Fast Operations**:
   - `HashSet` provides constant-time performance (`O(1)`) for basic operations like `add`, `remove`, and `contains`, assuming a good hash function.

---

### **Internal Implementation**
- `HashSet` uses a `HashMap` internally.
- Elements are stored as keys in the `HashMap`, and a dummy object (`PRESENT`) is used as the value.

---

### **Common Methods in HashSet**
1. **Adding Elements**:
   - `add(E e)`: Adds an element to the set if it is not already present.

2. **Removing Elements**:
   - `remove(Object o)`: Removes the specified element from the set.

3. **Checking for Elements**:
   - `contains(Object o)`: Checks if the set contains the specified element.

4. **Size and Capacity**:
   - `size()`: Returns the number of elements in the set.
   - `isEmpty()`: Checks if the set is empty.

5. **Iterating**:
   - `iterator()`: Returns an iterator over the elements in the set.

6. **Clearing the Set**:
   - `clear()`: Removes all elements from the set.

---

### **Example Usage**
```java
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Attempt to add a duplicate
        fruits.add("Apple"); // Ignored

        // Check if an element exists
        System.out.println("Contains Banana: " + fruits.contains("Banana")); // Output: true

        // Remove an element
        fruits.remove("Cherry");

        // Iterate over the set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

---

## **2. LinkedHashSet**

### **Key Features of LinkedHashSet**
1. **Ordered Collection**:
   - `LinkedHashSet` maintains the insertion order of elements. It uses a linked list to preserve the order.

2. **No Duplicates**:
   - Like `HashSet`, `LinkedHashSet` does not allow duplicate elements.

3. **Allows `null` Values**:
   - `LinkedHashSet` can store one `null` value.

4. **Backed by a LinkedHashMap**:
   - Internally, `LinkedHashSet` uses a `LinkedHashMap` to store its elements.

5. **Not Synchronized**:
   - `LinkedHashSet` is not thread-safe. For thread-safe operations, use `Collections.synchronizedSet(new LinkedHashSet<>())`.

6. **Slightly Slower than HashSet**:
   - Due to the maintenance of the linked list, `LinkedHashSet` has slightly slower performance than `HashSet`.

---

### **Example Usage**
```java
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Iterate over the set (maintains insertion order)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

---

## **3. TreeSet**

### **Key Features of TreeSet**
1. **Sorted Collection**:
   - `TreeSet` stores elements in a sorted order (natural ordering or custom ordering using a `Comparator`).

2. **No Duplicates**:
   - `TreeSet` does not allow duplicate elements.

3. **Does Not Allow `null` Values**:
   - `TreeSet` does not allow `null` values (throws `NullPointerException`).

4. **Backed by a TreeMap**:
   - Internally, `TreeSet` uses a `TreeMap` to store its elements.

5. **Not Synchronized**:
   - `TreeSet` is not thread-safe. For thread-safe operations, use `Collections.synchronizedSet(new TreeSet<>())`.

6. **Slower Operations**:
   - `TreeSet` provides logarithmic-time performance (`O(log n)`) for basic operations like `add`, `remove`, and `contains`.

---

### **Example Usage**
```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Iterate over the set (sorted order)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // First and last elements
        System.out.println("First: " + fruits.first()); // Output: Apple
        System.out.println("Last: " + fruits.last());  // Output: Cherry
    }
}
```

---

### **Comparison of HashSet, LinkedHashSet, and TreeSet**

| Feature                | HashSet          | LinkedHashSet     | TreeSet           |
|------------------------|------------------|-------------------|-------------------|
| **Order**              | Unordered        | Insertion Order   | Sorted Order      |
| **Duplicates**         | Not Allowed      | Not Allowed       | Not Allowed       |
| **Null Values**        | Allowed          | Allowed           | Not Allowed       |
| **Internal Structure** | HashMap          | LinkedHashMap     | TreeMap           |
| **Performance**        | O(1) for basics  | Slightly slower   | O(log n) for basics |
| **Thread-Safety**      | Not Thread-Safe  | Not Thread-Safe   | Not Thread-Safe   |

---

### **When to Use Each**
1. **HashSet**:
   - When you need a fast, unordered collection with no duplicates.
   - Example: Storing unique usernames.

2. **LinkedHashSet**:
   - When you need to maintain insertion order while avoiding duplicates.
   - Example: Caching with FIFO order.

3. **TreeSet**:
   - When you need a sorted collection with no duplicates.
   - Example: Storing a leaderboard in sorted order.

---

`PriorityQueue`, `ArrayDeque`, and `ConcurrentLinkedQueue` :
-------------------------------------------------------------

Below are the details of `PriorityQueue`, `ArrayDeque`, and `ConcurrentLinkedQueue`, including their **internal implementations**, key features, and use cases.

---

## **1. PriorityQueue**

### **Key Features of PriorityQueue**
1. **Unbounded Queue**:
   - `PriorityQueue` is an unbounded queue that grows dynamically.

2. **Orders Elements**:
   - Elements are ordered based on their natural ordering (if they implement `Comparable`) or by a custom `Comparator`.

3. **No `null` Values**:
   - `PriorityQueue` does not allow `null` values.

4. **Not Thread-Safe**:
   - `PriorityQueue` is not thread-safe. For thread-safe operations, use `PriorityBlockingQueue`.

5. **Min-Heap by Default**:
   - By default, `PriorityQueue` is a min-heap, meaning the smallest element is at the head of the queue.

6. **Efficient Operations**:
   - Offers `O(log n)` time complexity for `add` and `remove` operations.
   - Offers `O(1)` time complexity for `peek` and `size` operations.

---

### **Internal Implementation**
- Internally, `PriorityQueue` uses a **binary heap** data structure (specifically, a min-heap or max-heap depending on the comparator).
- The elements are stored in an **array** where:
  - The root of the heap is at index `0`.
  - For any element at index `i`:
    - Its left child is at index `2i + 1`.
    - Its right child is at index `2i + 2`.
    - Its parent is at index `(i - 1) / 2`.

---

### **Common Methods in PriorityQueue**
1. **Adding Elements**:
   - `add(E e)`: Adds an element to the queue.
   - `offer(E e)`: Adds an element to the queue (returns `true` if successful).

2. **Removing Elements**:
   - `remove()`: Removes and returns the head of the queue (throws an exception if the queue is empty).
   - `poll()`: Removes and returns the head of the queue (returns `null` if the queue is empty).

3. **Accessing Elements**:
   - `peek()`: Retrieves, but does not remove, the head of the queue (returns `null` if the queue is empty).
   - `element()`: Retrieves, but does not remove, the head of the queue (throws an exception if the queue is empty).

4. **Size and Capacity**:
   - `size()`: Returns the number of elements in the queue.
   - `isEmpty()`: Checks if the queue is empty.

---

### **Example Usage**
```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(10);
        pq.add(5);
        pq.add(20);

        // Access the head of the queue
        System.out.println("Head of the queue: " + pq.peek()); // Output: 5

        // Remove elements
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```

---

## **2. ArrayDeque**

### **Key Features of ArrayDeque**
1. **Double-Ended Queue**:
   - `ArrayDeque` supports operations at both ends (head and tail) of the queue.

2. **Resizable Array**:
   - It uses a resizable array to store elements, allowing it to grow dynamically.

3. **No Capacity Restrictions**:
   - Unlike `LinkedList`, `ArrayDeque` does not have capacity restrictions (except for memory limits).

4. **Faster than LinkedList**:
   - `ArrayDeque` is generally faster than `LinkedList` for queue operations.

5. **Not Thread-Safe**:
   - `ArrayDeque` is not thread-safe. For thread-safe operations, use external synchronization.

6. **No `null` Values**:
   - `ArrayDeque` does not allow `null` values.

---

### **Internal Implementation**
- Internally, `ArrayDeque` uses a **circular array** (also called a ring buffer).
- The array dynamically resizes when it runs out of space (usually doubles in size).
- Two pointers, `head` and `tail`, are used to keep track of the start and end of the queue.

---

### **Common Methods in ArrayDeque**
1. **Adding Elements**:
   - `addFirst(E e)`: Adds an element to the head of the queue.
   - `addLast(E e)`: Adds an element to the tail of the queue.
   - `offerFirst(E e)`: Adds an element to the head of the queue (returns `true` if successful).
   - `offerLast(E e)`: Adds an element to the tail of the queue (returns `true` if successful).

2. **Removing Elements**:
   - `removeFirst()`: Removes and returns the head of the queue (throws an exception if the queue is empty).
   - `removeLast()`: Removes and returns the tail of the queue (throws an exception if the queue is empty).
   - `pollFirst()`: Removes and returns the head of the queue (returns `null` if the queue is empty).
   - `pollLast()`: Removes and returns the tail of the queue (returns `null` if the queue is empty).

3. **Accessing Elements**:
   - `getFirst()`: Retrieves, but does not remove, the head of the queue (throws an exception if the queue is empty).
   - `getLast()`: Retrieves, but does not remove, the tail of the queue (throws an exception if the queue is empty).
   - `peekFirst()`: Retrieves, but does not remove, the head of the queue (returns `null` if the queue is empty).
   - `peekLast()`: Retrieves, but does not remove, the tail of the queue (returns `null` if the queue is empty).

4. **Size and Capacity**:
   - `size()`: Returns the number of elements in the queue.
   - `isEmpty()`: Checks if the queue is empty.

---

### **Example Usage**
```java
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);

        // Access elements
        System.out.println("First element: " + deque.getFirst()); // Output: 5
        System.out.println("Last element: " + deque.getLast());   // Output: 20

        // Remove elements
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }
    }
}
```

---

## **3. ConcurrentLinkedQueue**

### **Key Features of ConcurrentLinkedQueue**
1. **Thread-Safe**:
   - `ConcurrentLinkedQueue` is a thread-safe implementation of a queue, suitable for multi-threaded environments.

2. **Unbounded Queue**:
   - It is an unbounded queue that grows dynamically.

3. **Non-Blocking**:
   - Uses non-blocking algorithms (CAS - Compare and Swap) for thread safety, making it highly scalable.

4. **No `null` Values**:
   - `ConcurrentLinkedQueue` does not allow `null` values.

5. **FIFO Order**:
   - Elements are stored in First-In-First-Out (FIFO) order.

6. **Iterators are Weakly Consistent**:
   - Iterators do not throw `ConcurrentModificationException` but may not reflect the latest changes.

---

### **Internal Implementation**
- Internally, `ConcurrentLinkedQueue` uses a **linked list** data structure.
- Each node in the linked list contains:
  - The actual data (element).
  - A reference to the next node.
- Thread safety is achieved using **CAS (Compare and Swap)** operations, which avoid locking.

---

### **Common Methods in ConcurrentLinkedQueue**
1. **Adding Elements**:
   - `add(E e)`: Adds an element to the tail of the queue.
   - `offer(E e)`: Adds an element to the tail of the queue (returns `true` if successful).

2. **Removing Elements**:
   - `remove()`: Removes and returns the head of the queue (throws an exception if the queue is empty).
   - `poll()`: Removes and returns the head of the queue (returns `null` if the queue is empty).

3. **Accessing Elements**:
   - `peek()`: Retrieves, but does not remove, the head of the queue (returns `null` if the queue is empty).
   - `element()`: Retrieves, but does not remove, the head of the queue (throws an exception if the queue is empty).

4. **Size and Capacity**:
   - `size()`: Returns the number of elements in the queue (may be inaccurate in concurrent scenarios).
   - `isEmpty()`: Checks if the queue is empty.

---

### **Example Usage**
```java
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        // Create a ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Access the head of the queue
        System.out.println("Head of the queue: " + queue.peek()); // Output: 10

        // Remove elements
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

---

### **Comparison of PriorityQueue, ArrayDeque, and ConcurrentLinkedQueue**

| Feature                | PriorityQueue      | ArrayDeque         | ConcurrentLinkedQueue |
|------------------------|--------------------|--------------------|-----------------------|
| **Order**              | Sorted Order       | FIFO Order         | FIFO Order            |
| **Thread-Safety**      | Not Thread-Safe    | Not Thread-Safe    | Thread-Safe           |
| **Null Values**        | Not Allowed        | Not Allowed        | Not Allowed           |
| **Internal Structure** | Binary Heap        | Circular Array     | Linked List           |
| **Performance**        | O(log n) for adds  | O(1) for basics    | O(1) for basics       |
| **Use Case**           | Priority-based     | Double-ended queue | Multi-threaded queue  |

---


`HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, and `ConcurrentHashMap` :
---------------------------------------------------------------------------------

Below are the details of `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, and `ConcurrentHashMap`, including their **internal implementations**, key features, and use cases.

---

## **1. HashMap**

### **Key Features of HashMap**
1. **Key-Value Pairs**:
   - Stores data in key-value pairs.

2. **No Order**:
   - Does not maintain any order of keys or values.

3. **Allows `null` Keys and Values**:
   - Can store one `null` key and multiple `null` values.

4. **Not Synchronized**:
   - `HashMap` is not thread-safe. For thread-safe operations, use `ConcurrentHashMap` or `Collections.synchronizedMap(new HashMap<>())`.

5. **Fast Operations**:
   - Provides constant-time (`O(1)`) performance for basic operations (`get` and `put`), assuming a good hash function.

---

### **Internal Implementation**
- Internally, `HashMap` uses an **array of buckets** (also called a hash table).
- Each bucket is a linked list or a tree (in Java 8+ for handling collisions).
- When a key-value pair is added:
  1. The `hashCode()` of the key is computed.
  2. The index in the array is determined using `hashCode % array_size`.
  3. The key-value pair is stored in the bucket at the computed index.
- In case of collisions (same index for different keys), a linked list or tree is used to store multiple entries.

---

### **Example Usage**
```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Access values
        System.out.println("Value for Banana: " + map.get("Banana")); // Output: 20

        // Remove a key-value pair
        map.remove("Cherry");

        // Iterate over the map
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

---

## **2. LinkedHashMap**

### **Key Features of LinkedHashMap**
1. **Key-Value Pairs**:
   - Stores data in key-value pairs.

2. **Maintains Insertion Order**:
   - Maintains the insertion order of keys using a doubly linked list.

3. **Allows `null` Keys and Values**:
   - Can store one `null` key and multiple `null` values.

4. **Not Synchronized**:
   - `LinkedHashMap` is not thread-safe. For thread-safe operations, use `Collections.synchronizedMap(new LinkedHashMap<>())`.

5. **Slightly Slower than HashMap**:
   - Due to the maintenance of the linked list, `LinkedHashMap` has slightly slower performance than `HashMap`.

---

### **Internal Implementation**
- Internally, `LinkedHashMap` extends `HashMap` and uses a **doubly linked list** to maintain the insertion order of keys.
- The linked list connects all entries in the order they were inserted.

---

### **Example Usage**
```java
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Iterate over the map (maintains insertion order)
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

---

## **3. TreeMap**

### **Key Features of TreeMap**
1. **Key-Value Pairs**:
   - Stores data in key-value pairs.

2. **Sorted Order**:
   - Maintains keys in sorted order (natural ordering or custom ordering using a `Comparator`).

3. **No `null` Keys**:
   - Does not allow `null` keys (throws `NullPointerException`).

4. **Not Synchronized**:
   - `TreeMap` is not thread-safe. For thread-safe operations, use `Collections.synchronizedMap(new TreeMap<>())`.

5. **Slower Operations**:
   - Provides logarithmic-time (`O(log n)`) performance for basic operations (`get` and `put`).

---

### **Internal Implementation**
- Internally, `TreeMap` uses a **Red-Black Tree** (a self-balancing binary search tree).
- The tree maintains keys in sorted order, ensuring efficient retrieval and insertion.

---

### **Example Usage**
```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Iterate over the map (sorted order)
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

---

## **4. Hashtable**

### **Key Features of Hashtable**
1. **Key-Value Pairs**:
   - Stores data in key-value pairs.

2. **No Order**:
   - Does not maintain any order of keys or values.

3. **No `null` Keys or Values**:
   - Does not allow `null` keys or values (throws `NullPointerException`).

4. **Synchronized**:
   - `Hashtable` is thread-safe, making it suitable for multi-threaded environments.

5. **Legacy Class**:
   - `Hashtable` is a legacy class from Java 1.0.

---

### **Internal Implementation**
- Internally, `Hashtable` uses an **array of buckets** (similar to `HashMap`).
- Each bucket is a linked list to handle collisions.
- Synchronization is achieved using locks, which can lead to performance overhead.

---

### **Example Usage**
```java
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> table = new Hashtable<>();

        // Add key-value pairs
        table.put("Apple", 10);
        table.put("Banana", 20);
        table.put("Cherry", 30);

        // Access values
        System.out.println("Value for Banana: " + table.get("Banana")); // Output: 20

        // Iterate over the table
        for (String key : table.keySet()) {
            System.out.println(key + " -> " + table.get(key));
        }
    }
}
```

---

## **5. ConcurrentHashMap**

### **Key Features of ConcurrentHashMap**
1. **Key-Value Pairs**:
   - Stores data in key-value pairs.

2. **No Order**:
   - Does not maintain any order of keys or values.

3. **No `null` Keys or Values**:
   - Does not allow `null` keys or values (throws `NullPointerException`).

4. **Thread-Safe**:
   - `ConcurrentHashMap` is thread-safe and highly scalable.

5. **Non-Blocking**:
   - Uses fine-grained locking (lock striping) and CAS (Compare and Swap) for thread safety.

---

### **Internal Implementation**
- Internally, `ConcurrentHashMap` uses an **array of segments** (in Java 7) or **array of buckets** (in Java 8+).
- In Java 8+, it uses a **hash table with linked lists or trees** for collision handling.
- Thread safety is achieved using **fine-grained locking** and **CAS operations**.

---

### **Example Usage**
```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Access values
        System.out.println("Value for Banana: " + map.get("Banana")); // Output: 20

        // Iterate over the map
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

---

### **Comparison of HashMap, LinkedHashMap, TreeMap, Hashtable, and ConcurrentHashMap**

| Feature                | HashMap          | LinkedHashMap     | TreeMap           | Hashtable         | ConcurrentHashMap   |
|------------------------|------------------|-------------------|-------------------|-------------------|---------------------|
| **Order**              | No Order         | Insertion Order   | Sorted Order      | No Order          | No Order            |
| **Null Keys/Values**   | Allowed          | Allowed           | No Null Keys      | Not Allowed       | Not Allowed         |
| **Thread-Safety**      | Not Thread-Safe  | Not Thread-Safe   | Not Thread-Safe   | Thread-Safe       | Thread-Safe         |
| **Internal Structure** | Hash Table       | Hash Table + List | Red-Black Tree    | Hash Table        | Hash Table + Locks  |
| **Performance**        | O(1) for basics  | Slightly Slower   | O(log n) for basics | Slower than HashMap | Highly Scalable     |

---


