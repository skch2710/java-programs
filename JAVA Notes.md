
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

Utilities :
-----------------

Below are the details about the **Utilities** in Java, including the `Collections` class, iterators, the `forEach` loop, and comparators (`Comparator` and `Comparable` interfaces).

---

## **1. Collections Class**

The `java.util.Collections` class provides utility methods for working with collections (e.g., `List`, `Set`, `Map`). These methods are static and can be used to perform common operations like sorting, reversing, shuffling, finding max/min, etc.

### **Common Methods in Collections Class**
1. **Sorting**:
   - `sort(List<T> list)`: Sorts the list in natural order (elements must implement `Comparable`).
   - `sort(List<T> list, Comparator<? super T> c)`: Sorts the list using a custom comparator.

   ```java
   List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
   Collections.sort(numbers); // Natural order: [1, 3, 5, 8]
   Collections.sort(numbers, Collections.reverseOrder()); // Reverse order: [8, 5, 3, 1]
   ```

2. **Reversing**:
   - `reverse(List<?> list)`: Reverses the order of elements in the list.

   ```java
   Collections.reverse(numbers); // Reversed list: [8, 5, 3, 1]
   ```

3. **Shuffling**:
   - `shuffle(List<?> list)`: Randomly shuffles the elements in the list.

   ```java
   Collections.shuffle(numbers); // Shuffled list: Random order
   ```

4. **Finding Max/Min**:
   - `max(Collection<? extends T> coll)`: Returns the maximum element (natural order).
   - `min(Collection<? extends T> coll)`: Returns the minimum element (natural order).

   ```java
   int max = Collections.max(numbers); // Max: 8
   int min = Collections.min(numbers); // Min: 1
   ```

5. **Synchronized Collections**:
   - `synchronizedList(List<T> list)`: Returns a synchronized (thread-safe) list.
   - `synchronizedSet(Set<T> set)`: Returns a synchronized set.
   - `synchronizedMap(Map<K, V> map)`: Returns a synchronized map.

   ```java
   List<Integer> syncList = Collections.synchronizedList(numbers);
   ```

6. **Unmodifiable Collections**:
   - `unmodifiableList(List<? extends T> list)`: Returns an unmodifiable view of the list.
   - `unmodifiableSet(Set<? extends T> set)`: Returns an unmodifiable set.
   - `unmodifiableMap(Map<? extends K, ? extends V> map)`: Returns an unmodifiable map.

   ```java
   List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
   ```

---

## **2. Iterators**

Iterators are used to traverse collections. The `Iterator` and `ListIterator` interfaces provide methods to iterate over elements in a collection.

### **Iterator Interface**
- Used to traverse collections like `List`, `Set`, and `Queue`.
- Methods:
  - `hasNext()`: Returns `true` if there are more elements.
  - `next()`: Returns the next element.
  - `remove()`: Removes the last element returned by the iterator.

  ```java
  List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
  Iterator<String> iterator = fruits.iterator();
  while (iterator.hasNext()) {
      System.out.println(iterator.next());
  }
  ```

### **ListIterator Interface**
- Used to traverse `List` collections.
- Provides bidirectional traversal (forward and backward).
- Methods:
  - `hasNext()`: Returns `true` if there are more elements in the forward direction.
  - `next()`: Returns the next element.
  - `hasPrevious()`: Returns `true` if there are more elements in the backward direction.
  - `previous()`: Returns the previous element.
  - `add(E e)`: Adds an element at the current position.
  - `set(E e)`: Replaces the last element returned by `next()` or `previous()`.

  ```java
  List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
  ListIterator<String> listIterator = fruits.listIterator();
  while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
  }
  while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
  }
  ```

---

## **3. `forEach` Loop with Collections**

The `forEach` loop (introduced in Java 8) is a concise way to iterate over collections using lambda expressions or method references.

### **Example**
```java
List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

// Using forEach with lambda expression
fruits.forEach(fruit -> System.out.println(fruit));

// Using forEach with method reference
fruits.forEach(System.out::println);
```

---

## **4. Comparators and Comparable Interfaces**

### **Comparable Interface**
- Used to define the **natural ordering** of objects.
- The class whose objects need to be sorted must implement the `Comparable` interface and override the `compareTo()` method.

  ```java
  class Person implements Comparable<Person> {
      String name;
      int age;

      @Override
      public int compareTo(Person other) {
          return this.age - other.age; // Sort by age
      }
  }

  List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 20));
  Collections.sort(people); // Sorts by age
  ```

### **Comparator Interface**
- Used to define **custom ordering** of objects.
- The `Comparator` interface is implemented in a separate class or using lambda expressions.
- The `compare()` method is overridden to define the sorting logic.

  ```java
  // Using a separate Comparator class
  class NameComparator implements Comparator<Person> {
      @Override
      public int compare(Person p1, Person p2) {
          return p1.name.compareTo(p2.name); // Sort by name
      }
  }

  List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 20));
  Collections.sort(people, new NameComparator()); // Sorts by name

  // Using lambda expression
  Collections.sort(people, (p1, p2) -> p1.name.compareTo(p2.name));
  ```

---

### **Key Differences Between Comparable and Comparator**

| Feature                | Comparable                          | Comparator                          |
|------------------------|-------------------------------------|-------------------------------------|
| **Definition**         | Defines natural ordering            | Defines custom ordering             |
| **Method**             | `compareTo()`                      | `compare()`                         |
| **Implementation**     | Implemented by the class itself     | Implemented in a separate class or lambda |
| **Usage**              | `Collections.sort(list)`            | `Collections.sort(list, comparator)`|
| **Flexibility**        | Less flexible (single ordering)    | More flexible (multiple orderings)  |

---


Exception Handling :
-------------------------

Certainly! Below are the details about **Exception Handling** in Java, covering the basics, handling exceptions, custom exceptions, and new features introduced in Java 7 and later.

---

## **1. Basics**

### **What is an Exception?**
- An **exception** is an event that occurs during the execution of a program that disrupts the normal flow of instructions.
- Exceptions are used to handle errors and other exceptional events in a structured way.

### **Exception Hierarchy**
- The root class of the exception hierarchy is `Throwable`.
- The two main subclasses of `Throwable` are:
  1. **`Error`**:
     - Represents serious problems that applications should not try to catch (e.g., `OutOfMemoryError`, `StackOverflowError`).
  2. **`Exception`**:
     - Represents conditions that applications might want to catch (e.g., `IOException`, `NullPointerException`).
     - Further divided into:
       - **Checked Exceptions**: Must be handled at compile time (e.g., `IOException`).
       - **Unchecked Exceptions**: Do not need to be handled at compile time (e.g., `NullPointerException`, `ArithmeticException`).

---

## **2. Handling Exceptions**

### **`try` and `catch` Blocks**
- Use a `try` block to enclose code that might throw an exception.
- Use a `catch` block to handle the exception.

```java
try {
    int result = 10 / 0; // Throws ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
}
```

### **Multiple `catch` Blocks**
- Use multiple `catch` blocks to handle different types of exceptions.

```java
try {
    int[] arr = new int[5];
    arr[10] = 50; // Throws ArrayIndexOutOfBoundsException
} catch (ArithmeticException e) {
    System.out.println("ArithmeticException: " + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
}
```

### **`finally` Block**
- The `finally` block is executed regardless of whether an exception is thrown or not.
- It is typically used for cleanup activities (e.g., closing resources).

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero: " + e.getMessage());
} finally {
    System.out.println("This will always execute");
}
```

### **`throw` Keyword**
- Use the `throw` keyword to explicitly throw an exception.

```java
if (age < 18) {
    throw new ArithmeticException("Age must be 18 or older");
}
```

### **`throws` Keyword**
- Use the `throws` keyword in a method signature to declare that the method might throw an exception.

```java
public void readFile() throws IOException {
    // Code that might throw IOException
}
```

---

## **3. Custom Exceptions**

### **Creating Custom Exception Classes**
- Create a custom exception by extending the `Exception` class (for checked exceptions) or `RuntimeException` class (for unchecked exceptions).

```java
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
```

### **Throwing Custom Exceptions**
- Throw custom exceptions using the `throw` keyword.

```java
public void validateAge(int age) throws MyCustomException {
    if (age < 18) {
        throw new MyCustomException("Age must be 18 or older");
    }
}
```

---

## **4. New Features**

### **Try-with-Resources (Java 7+)**
- Automatically closes resources (e.g., files, sockets) that implement the `AutoCloseable` interface.
- Resources are declared in the `try` block and closed automatically at the end.

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.out.println("Error reading file: " + e.getMessage());
}
```

### **Multi-Catch (Java 7+)**
- Catch multiple exceptions in a single `catch` block.

```java
try {
    int[] arr = new int[5];
    arr[10] = 50; // Throws ArrayIndexOutOfBoundsException
} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
    System.out.println("Exception: " + e.getMessage());
}
```

---

## **Example: Full Exception Handling**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            validateAge(15); // Throws custom exception
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        try {
            int[] arr = new int[5];
            arr[10] = 50; // Throws ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or older");
        }
    }
}
```

---

## **Summary**

| Feature                     | Description                                                                 |
|-----------------------------|-----------------------------------------------------------------------------|
| **`try` and `catch`**       | Handle exceptions using `try` and `catch` blocks.                           |
| **Multiple `catch`**        | Handle different exceptions using multiple `catch` blocks.                  |
| **`finally`**               | Execute cleanup code regardless of exceptions.                              |
| **`throw`**                 | Explicitly throw an exception.                                              |
| **`throws`**                | Declare exceptions that a method might throw.                               |
| **Custom Exceptions**       | Create and throw custom exceptions.                                         |
| **Try-with-Resources**      | Automatically close resources using `try-with-resources`.                   |
| **Multi-Catch**             | Catch multiple exceptions in a single `catch` block.                        |

---



Multithreading :
--------------------

## **1. Basics**

### **What is a Thread?**
- A **thread** is the smallest unit of execution within a process.
- A process can have multiple threads running concurrently, allowing for parallel execution of tasks.
- Threads share the same memory space, making communication between threads easier but also requiring synchronization to avoid conflicts.

### **Thread Lifecycle**
A thread can be in one of the following states during its lifecycle:
1. **New**: The thread is created but not yet started.
2. **Runnable**: The thread is ready to run and waiting for CPU time.
3. **Running**: The thread is executing its task.
4. **Blocked/Waiting**: The thread is waiting for a resource or another thread to complete.
5. **Terminated**: The thread has completed its execution.

### **Main Thread**
- When a Java program starts, the JVM creates the **main thread**, which executes the `main()` method.
- The main thread can create and start other threads.

---

## **2. Creating Threads**

### **Extending `Thread` Class**
- Create a class that extends the `Thread` class and override the `run()` method.
- Start the thread using the `start()` method.

```java
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Starts the thread
    }
}
```

### **Implementing `Runnable` Interface**
- Create a class that implements the `Runnable` interface and override the `run()` method.
- Pass an instance of the class to a `Thread` object and start the thread.

```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Starts the thread
    }
}
```

### **Lambda Expressions with Threads (Java 8+)**
- Use lambda expressions to create and start threads concisely.

```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread is running"));
        thread.start(); // Starts the thread
    }
}
```

---

## **3. Thread Management**

### **Thread Methods**
1. **`start()`**: Starts the thread and calls the `run()` method.
2. **`run()`**: Contains the code to be executed by the thread.
3. **`sleep(long millis)`**: Pauses the thread for the specified time (in milliseconds).
4. **`join()`**: Waits for the thread to complete its execution.
5. **`yield()`**: Pauses the current thread and allows other threads to execute.

### **Thread Priority**
- Threads have a priority ranging from `1` (lowest) to `10` (highest).
- Use `setPriority(int priority)` to set the priority and `getPriority()` to get the priority.

```java
Thread thread = new Thread(() -> System.out.println("Thread is running"));
thread.setPriority(Thread.MAX_PRIORITY); // Set priority to 10
thread.start();
```

### **Daemon Threads**
- Daemon threads are background threads that do not prevent the JVM from exiting.
- Use `setDaemon(true)` to make a thread a daemon thread.

```java
Thread daemonThread = new Thread(() -> {
    while (true) {
        System.out.println("Daemon thread is running");
    }
});
daemonThread.setDaemon(true); // Set as daemon thread
daemonThread.start();
```

---

## **4. Synchronization**

### **`synchronized` Keyword**
- Used to control access to shared resources by multiple threads.
- Can be applied to methods or blocks of code.

```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

### **Deadlock Prevention**
- Deadlock occurs when two or more threads are blocked forever, waiting for each other.
- To prevent deadlock:
  - Avoid nested locks.
  - Use timeouts with `tryLock()`.
  - Define a global order for acquiring locks.

### **`volatile` Keyword**
- Ensures that changes to a variable are visible to all threads.
- Prevents thread caching of the variable.

```java
class SharedResource {
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public boolean getFlag() {
        return flag;
    }
}
```

---

## **5. Concurrency Utilities (Java 5+)**

### **`ExecutorService`**
- Manages a pool of threads and executes tasks asynchronously.

```java
ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> System.out.println("Task 1"));
executor.submit(() -> System.out.println("Task 2"));
executor.shutdown();
```

### **`ThreadPool`**
- A pool of reusable threads for executing tasks.

```java
ExecutorService executor = Executors.newFixedThreadPool(5);
for (int i = 0; i < 10; i++) {
    executor.submit(() -> System.out.println("Task executed by " + Thread.currentThread().getName()));
}
executor.shutdown();
```

### **`Callable` and `Future`**
- `Callable` is similar to `Runnable` but can return a result and throw exceptions.
- `Future` represents the result of an asynchronous computation.

```java
Callable<Integer> task = () -> {
    Thread.sleep(1000);
    return 42;
};

ExecutorService executor = Executors.newSingleThreadExecutor();
Future<Integer> future = executor.submit(task);

System.out.println("Result: " + future.get()); // Blocks until the result is available
executor.shutdown();
```

### **`CountDownLatch`**
- Allows one or more threads to wait until a set of operations is completed.

```java
CountDownLatch latch = new CountDownLatch(3);

ExecutorService executor = Executors.newFixedThreadPool(3);
for (int i = 0; i < 3; i++) {
    executor.submit(() -> {
        System.out.println("Task completed");
        latch.countDown();
    });
}

latch.await(); // Waits until the latch count reaches 0
System.out.println("All tasks completed");
executor.shutdown();
```

### **`CyclicBarrier`**
- Allows a set of threads to wait for each other to reach a common barrier point.

```java
CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached the barrier"));

ExecutorService executor = Executors.newFixedThreadPool(3);
for (int i = 0; i < 3; i++) {
    executor.submit(() -> {
        System.out.println("Thread reached the barrier");
        barrier.await();
        System.out.println("Thread continued");
    });
}
executor.shutdown();
```

### **`Semaphore`**
- Controls access to a shared resource using permits.

```java
Semaphore semaphore = new Semaphore(2); // Allows 2 permits

ExecutorService executor = Executors.newFixedThreadPool(4);
for (int i = 0; i < 4; i++) {
    executor.submit(() -> {
        semaphore.acquire();
        System.out.println("Thread acquired permit");
        Thread.sleep(1000);
        semaphore.release();
        System.out.println("Thread released permit");
    });
}
executor.shutdown();
```

### **`Lock` Interface and `ReentrantLock`**
- Provides more flexible locking than `synchronized`.

```java
Lock lock = new ReentrantLock();

ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> {
    lock.lock();
    try {
        System.out.println("Thread 1 acquired lock");
        Thread.sleep(1000);
    } finally {
        lock.unlock();
        System.out.println("Thread 1 released lock");
    }
});

executor.submit(() -> {
    lock.lock();
    try {
        System.out.println("Thread 2 acquired lock");
        Thread.sleep(1000);
    } finally {
        lock.unlock();
        System.out.println("Thread 2 released lock");
    }
});
executor.shutdown();
```

---

`CompletableFuture` :
------------------------

`CompletableFuture` is a powerful class introduced in Java 8 as part of the `java.util.concurrent` package. It provides a flexible and robust way to handle asynchronous programming, allowing you to write non-blocking, event-driven code. Below are the details about `CompletableFuture`, including its features, methods, and examples.

---

## **Key Features of CompletableFuture**
1. **Asynchronous Execution**:
   - Allows you to run tasks asynchronously without blocking the main thread.

2. **Chaining and Combining**:
   - Supports chaining multiple asynchronous tasks and combining their results.

3. **Exception Handling**:
   - Provides methods to handle exceptions during asynchronous execution.

4. **Manual Completion**:
   - Allows you to manually complete a `CompletableFuture` with a value or an exception.

5. **Non-Blocking**:
   - Uses callbacks and functional programming constructs to avoid blocking threads.

6. **Integration with `ForkJoinPool`**:
   - By default, tasks are executed in the common `ForkJoinPool`, but you can specify a custom `Executor`.

---

## **Creating a CompletableFuture**

### **1. Using `supplyAsync`**
- Runs a task asynchronously and returns a result.

```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    // Simulate a long-running task
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    return "Hello, World!";
});

// Block and get the result
String result = future.get();
System.out.println(result); // Output: Hello, World!
```

### **2. Using `runAsync`**
- Runs a task asynchronously without returning a result.

```java
CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
    // Simulate a long-running task
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Task completed");
});

// Block and wait for the task to complete
future.get();
```

---

## **Chaining CompletableFuture**

### **1. `thenApply`**
- Transforms the result of a `CompletableFuture` using a function.

```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
    .thenApply(s -> s + ", World!");

System.out.println(future.get()); // Output: Hello, World!
```

### **2. `thenAccept`**
- Consumes the result of a `CompletableFuture` without returning a value.

```java
CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Hello")
    .thenAccept(s -> System.out.println(s + ", World!"));

future.get(); // Output: Hello, World!
```

### **3. `thenRun`**
- Runs a task after the `CompletableFuture` completes, without using its result.

```java
CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Hello")
    .thenRun(() -> System.out.println("Task completed"));

future.get(); // Output: Task completed
```

---

## **Combining CompletableFuture**

### **1. `thenCompose`**
- Chains two `CompletableFuture` objects sequentially.

```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
    .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + ", World!"));

System.out.println(future.get()); // Output: Hello, World!
```

### **2. `thenCombine`**
- Combines the results of two independent `CompletableFuture` objects.

```java
CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (s1, s2) -> s1 + ", " + s2 + "!");

System.out.println(combinedFuture.get()); // Output: Hello, World!
```

### **3. `allOf`**
- Waits for all `CompletableFuture` objects to complete.

```java
CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2);
allFutures.get(); // Wait for all futures to complete

System.out.println(future1.get() + ", " + future2.get() + "!"); // Output: Hello, World!
```

### **4. `anyOf`**
- Waits for any one of the `CompletableFuture` objects to complete.

```java
CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    return "Hello";
});

CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1, future2);
System.out.println(anyFuture.get()); // Output: World (since future2 completes first)
```

---

## **Exception Handling**

### **1. `exceptionally`**
- Handles exceptions by providing a fallback value.

```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    throw new RuntimeException("Error occurred");
}).exceptionally(ex -> "Fallback value");

System.out.println(future.get()); // Output: Fallback value
```

### **2. `handle`**
- Handles both success and failure cases.

```java
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    throw new RuntimeException("Error occurred");
}).handle((result, ex) -> {
    if (ex != null) {
        return "Fallback value";
    }
    return result;
});

System.out.println(future.get()); // Output: Fallback value
```

---

## **Manual Completion**

### **1. `complete`**
- Manually completes the `CompletableFuture` with a value.

```java
CompletableFuture<String> future = new CompletableFuture<>();
future.complete("Manual completion");

System.out.println(future.get()); // Output: Manual completion
```

### **2. `completeExceptionally`**
- Manually completes the `CompletableFuture` with an exception.

```java
CompletableFuture<String> future = new CompletableFuture<>();
future.completeExceptionally(new RuntimeException("Manual exception"));

try {
    future.get();
} catch (Exception e) {
    System.out.println(e.getMessage()); // Output: Manual exception
}
```

---

## **Using a Custom Executor**
By default, `CompletableFuture` uses the common `ForkJoinPool`. You can specify a custom `Executor` for task execution.

```java
ExecutorService executor = Executors.newFixedThreadPool(2);

CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    System.out.println("Running in custom executor");
    return "Hello, World!";
}, executor);

System.out.println(future.get()); // Output: Hello, World!
executor.shutdown();
```

---

## **Example: Chaining and Combining**
Here’s an example that demonstrates chaining and combining `CompletableFuture`:

```java
CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (s1, s2) -> s1 + ", " + s2 + "!");

System.out.println(combinedFuture.get()); // Output: Hello, World!
```

---

## **When to Use CompletableFuture**
- When you need to perform asynchronous tasks and handle their results.
- When you need to chain or combine multiple asynchronous tasks.
- When you need fine-grained control over task execution and exception handling.

---

ForkJoinPool :
-------------------

ForkJoinPool is a Java class in the java.util.concurrent package used for parallel processing by dividing tasks into smaller subtasks (forking) and combining their results (joining). It follows the work-stealing algorithm, where idle threads "steal" tasks from busy threads to maximize CPU utilization.


Lambda Expressions :
------------------------

**Lambda Expressions** were introduced in Java 8 as a way to provide clear and concise syntax for writing anonymous functions. They are a key feature of functional programming in Java and are closely tied to **Functional Interfaces**. Below are the details about lambda expressions, their syntax, use cases, and functional interfaces.

---

## **1. Lambda Expressions**

### **Syntax**
A lambda expression has the following syntax:

```java
(parameters) -> expression
```

or

```java
(parameters) -> { statements; }
```

- **Parameters**: The input parameters for the lambda expression. If there is only one parameter, parentheses can be omitted.
- **Arrow (`->`)**: Separates the parameters from the body of the lambda.
- **Body**: A single expression or a block of code. If it's a single expression, the result is automatically returned.

### **Examples**
1. **No Parameters**:
   ```java
   () -> System.out.println("Hello, World!");
   ```

2. **Single Parameter**:
   ```java
   x -> x * x
   ```

3. **Multiple Parameters**:
   ```java
   (x, y) -> x + y
   ```

4. **Block of Code**:
   ```java
   (x, y) -> {
       int sum = x + y;
       return sum;
   }
   ```

---

### **Use Cases**
1. **Replacing Anonymous Classes**:
   - Lambda expressions can replace anonymous classes for functional interfaces.

   ```java
   // Before Java 8 (using anonymous class)
   Runnable r = new Runnable() {
       @Override
       public void run() {
           System.out.println("Hello, World!");
       }
   };

   // With Lambda Expression
   Runnable r = () -> System.out.println("Hello, World!");
   ```

2. **Iterating Collections**:
   - Use lambda expressions with the `forEach` method to iterate over collections.

   ```java
   List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
   list.forEach(item -> System.out.println(item));
   ```

3. **Stream API**:
   - Lambda expressions are heavily used with the Stream API for functional-style operations like filtering, mapping, and reducing.

   ```java
   List<String> filteredList = list.stream()
       .filter(item -> item.startsWith("A"))
       .collect(Collectors.toList());
   ```

4. **Event Handling**:
   - Lambda expressions can simplify event handling in GUI applications.

   ```java
   button.addActionListener(e -> System.out.println("Button clicked!"));
   ```

---

## **2. Functional Interfaces**

A **Functional Interface** is an interface with **exactly one abstract method**. Lambda expressions can be used to provide the implementation for this method.

### **Common Functional Interfaces**
Java provides several built-in functional interfaces in the `java.util.function` package:

1. **`Predicate<T>`**:
   - Represents a boolean-valued function.
   - Abstract method: `boolean test(T t)`.

   ```java
   Predicate<Integer> isEven = x -> x % 2 == 0;
   System.out.println(isEven.test(4)); // Output: true
   ```

2. **`Function<T, R>`**:
   - Represents a function that takes an argument of type `T` and returns a result of type `R`.
   - Abstract method: `R apply(T t)`.

   ```java
   Function<String, Integer> lengthFunction = s -> s.length();
   System.out.println(lengthFunction.apply("Hello")); // Output: 5
   ```

3. **`Consumer<T>`**:
   - Represents an operation that takes an argument of type `T` and returns no result.
   - Abstract method: `void accept(T t)`.

   ```java
   Consumer<String> printConsumer = s -> System.out.println(s);
   printConsumer.accept("Hello, World!");
   ```

4. **`Supplier<T>`**:
   - Represents a supplier of results.
   - Abstract method: `T get()`.

   ```java
   Supplier<Double> randomSupplier = () -> Math.random();
   System.out.println(randomSupplier.get());
   ```

---

### **Custom Functional Interfaces**
You can create your own functional interfaces by defining an interface with a single abstract method.

```java
@FunctionalInterface
interface MyFunctionalInterface {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface add = (a, b) -> a + b;
        System.out.println(add.operate(5, 3)); // Output: 8
    }
}
```

---

## **3. Method References**

Method references provide a way to refer to methods without invoking them. They are often used as shorthand for lambda expressions.

### **Types of Method References**
1. **Static Method Reference**:
   ```java
   Function<Integer, String> intToString = String::valueOf;
   System.out.println(intToString.apply(42)); // Output: "42"
   ```

2. **Instance Method Reference**:
   ```java
   List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
   list.forEach(System.out::println);
   ```

3. **Constructor Reference**:
   ```java
   Supplier<List<String>> listSupplier = ArrayList::new;
   List<String> newList = listSupplier.get();
   ```

---

## **4. Example: Combining Lambda Expressions and Functional Interfaces**

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        // Predicate: Filter strings starting with "A"
        Predicate<String> startsWithA = s -> s.startsWith("A");
        List<String> filteredList = list.stream()
            .filter(startsWithA)
            .toList();
        System.out.println(filteredList); // Output: [Apple]

        // Function: Convert strings to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseList = list.stream()
            .map(toUpperCase)
            .toList();
        System.out.println(upperCaseList); // Output: [APPLE, BANANA, CHERRY]

        // Consumer: Print each element
        Consumer<String> printConsumer = System.out::println;
        list.forEach(printConsumer);
    }
}
```

---

## **Summary**

| Feature                     | Description                                                                 |
|-----------------------------|-----------------------------------------------------------------------------|
| **Lambda Syntax**           | `(parameters) -> expression` or `(parameters) -> { statements; }`          |
| **Functional Interfaces**   | Interfaces with a single abstract method (e.g., `Predicate`, `Function`).   |
| **Use Cases**               | Replacing anonymous classes, iterating collections, Stream API, etc.        |
| **Method References**       | Shorthand for lambda expressions (e.g., `System.out::println`).             |

---


Stream API :
-------------------
The **Stream API** is a powerful feature introduced in Java 8 as part of the `java.util.stream` package. It provides a functional approach to process collections of objects in a declarative way. Streams allow you to perform operations like filtering, mapping, sorting, and reducing on collections with ease. Below are the details about the Stream API, including its purpose, characteristics, and all the methods available in the `Stream` interface.

---

## **What is the Stream API?**

### **Purpose**
- The Stream API is designed to process sequences of elements (e.g., collections, arrays, or I/O channels) in a functional and declarative style.
- It enables **parallel processing** of data, making it easier to write efficient and scalable code.

### **Characteristics**
1. **Not a Data Structure**:
   - A stream is not a data structure; it does not store data. Instead, it operates on a source (e.g., a collection or array).

2. **Functional in Nature**:
   - Streams support functional-style operations like `map`, `filter`, and `reduce`.

3. **Lazy Evaluation**:
   - Intermediate operations (e.g., `filter`, `map`) are lazy and only executed when a terminal operation (e.g., `collect`, `forEach`) is invoked.

4. **Parallel Processing**:
   - Streams can be processed in parallel using the `parallelStream()` method.

5. **Immutable**:
   - Streams do not modify the source data; they produce a new stream as a result of operations.

---

## **Stream Pipeline**
A stream pipeline consists of:
1. **Source**: The data source (e.g., a collection or array).
2. **Intermediate Operations**: Operations that transform the stream (e.g., `filter`, `map`).
3. **Terminal Operation**: An operation that produces a result or side effect (e.g., `collect`, `forEach`).

---

## **All Methods in the `Stream` Interface**

### **1. Intermediate Operations**
These methods return a new stream and are lazy (not executed until a terminal operation is called).

1. **`filter(Predicate<T> predicate)`**:
   - Filters elements based on a condition.

   ```java
   List<String> filtered = list.stream()
       .filter(s -> s.startsWith("A"))
       .toList();
   ```

2. **`map(Function<T, R> mapper)`**:
   - Transforms each element using the provided function.

   ```java
   List<Integer> lengths = list.stream()
       .map(String::length)
       .toList();
   ```

3. **`flatMap(Function<T, Stream<R>> mapper)`**:
   - Flattens nested structures (e.g., `List<List<T>>` to `List<T>`).

   ```java
   List<String> flatList = listOfLists.stream()
       .flatMap(List::stream)
       .toList();
   ```

4. **`distinct()`**:
   - Removes duplicate elements.

   ```java
   List<String> unique = list.stream()
       .distinct()
       .toList();
   ```

5. **`sorted()`**:
   - Sorts elements in natural order.

   ```java
   List<String> sorted = list.stream()
       .sorted()
       .toList();
   ```

6. **`sorted(Comparator<T> comparator)`**:
   - Sorts elements using a custom comparator.

   ```java
   List<String> sorted = list.stream()
       .sorted(Comparator.reverseOrder())
       .toList();
   ```

7. **`peek(Consumer<T> action)`**:
   - Performs an action on each element without modifying the stream.

   ```java
   List<String> result = list.stream()
       .peek(System.out::println)
       .toList();
   ```

8. **`limit(long maxSize)`**:
   - Limits the stream to a specified number of elements.

   ```java
   List<String> limited = list.stream()
       .limit(2)
       .toList();
   ```

9. **`skip(long n)`**:
   - Skips the first `n` elements.

   ```java
   List<String> skipped = list.stream()
       .skip(2)
       .toList();
   ```

---

### **2. Terminal Operations**
These methods produce a result or side effect and terminate the stream.

1. **`forEach(Consumer<T> action)`**:
   - Performs an action on each element.

   ```java
   list.stream()
       .forEach(System.out::println);
   ```

2. **`toList()`**:
   - Collects elements into a list.

   ```java
   List<String> result = list.stream()
       .toList();
   ```

3. **`collect(Collector<T, A, R> collector)`**:
   - Collects elements into a collection or other data structure.

   ```java
   Set<String> set = list.stream()
       .collect(Collectors.toSet());
   ```

4. **`reduce(BinaryOperator<T> accumulator)`**:
   - Reduces elements to a single value.

   ```java
   Optional<String> reduced = list.stream()
       .reduce((s1, s2) -> s1 + ", " + s2);
   ```

5. **`reduce(T identity, BinaryOperator<T> accumulator)`**:
   - Reduces elements to a single value with an initial identity.

   ```java
   String concatenated = list.stream()
       .reduce("", (s1, s2) -> s1 + ", " + s2);
   ```

6. **`count()`**:
   - Returns the number of elements in the stream.

   ```java
   long count = list.stream()
       .count();
   ```

7. **`anyMatch(Predicate<T> predicate)`**:
   - Returns `true` if any element matches the predicate.

   ```java
   boolean hasA = list.stream()
       .anyMatch(s -> s.startsWith("A"));
   ```

8. **`allMatch(Predicate<T> predicate)`**:
   - Returns `true` if all elements match the predicate.

   ```java
   boolean allA = list.stream()
       .allMatch(s -> s.startsWith("A"));
   ```

9. **`noneMatch(Predicate<T> predicate)`**:
   - Returns `true` if no elements match the predicate.

   ```java
   boolean noA = list.stream()
       .noneMatch(s -> s.startsWith("A"));
   ```

10. **`findFirst()`**:
    - Returns the first element of the stream.

    ```java
    Optional<String> first = list.stream()
        .findFirst();
    ```

11. **`findAny()`**:
    - Returns any element of the stream (useful for parallel streams).

    ```java
    Optional<String> any = list.stream()
        .findAny();
    ```

12. **`min(Comparator<T> comparator)`**:
    - Returns the minimum element based on the comparator.

    ```java
    Optional<String> min = list.stream()
        .min(Comparator.naturalOrder());
    ```

13. **`max(Comparator<T> comparator)`**:
    - Returns the maximum element based on the comparator.

    ```java
    Optional<String> max = list.stream()
        .max(Comparator.naturalOrder());
    ```

---

### **3. Short-Circuiting Operations**
These are terminal operations that may terminate early.

1. **`anyMatch(Predicate<T> predicate)`**:
   - Stops processing as soon as a match is found.

2. **`allMatch(Predicate<T> predicate)`**:
   - Stops processing as soon as a non-matching element is found.

3. **`noneMatch(Predicate<T> predicate)`**:
   - Stops processing as soon as a matching element is found.

4. **`findFirst()`**:
   - Stops processing after finding the first element.

5. **`findAny()`**:
   - Stops processing after finding any element.

---

## **Example: Using Stream API**

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Avocado");

        // Filter, map, and collect
        List<String> result = list.stream()
            .filter(s -> s.startsWith("A"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(result); // Output: [APPLE, AVOCADO]
    }
}
```

---

## **Summary**

| Category                | Methods                                                                 |
|-------------------------|-------------------------------------------------------------------------|
| **Intermediate Ops**    | `filter`, `map`, `flatMap`, `distinct`, `sorted`, `peek`, `limit`, `skip` |
| **Terminal Ops**        | `forEach`, `toList`, `collect`, `reduce`, `count`, `anyMatch`, `allMatch`, `noneMatch`, `findFirst`, `findAny`, `min`, `max` |
| **Short-Circuiting Ops**| `anyMatch`, `allMatch`, `noneMatch`, `findFirst`, `findAny`             |

---

Optional Class :
------------------

The **`Optional`** class was introduced in Java 8 as part of the `java.util` package to help developers avoid `NullPointerException` and write cleaner, more expressive code when dealing with potentially null values. Below are the details about the `Optional` class, including its purpose, key methods, and examples.

---

## **What is the `Optional` Class?**

### **Purpose**
- The `Optional` class is a container object that may or may not contain a non-null value.
- It provides a way to handle situations where a value might be absent, reducing the need for explicit null checks and avoiding `NullPointerException`.

### **Key Features**
1. **Avoids Null Checks**:
   - Encourages explicit handling of absent values instead of relying on null checks.

2. **Functional-Style Methods**:
   - Provides methods like `map`, `filter`, and `ifPresent` for functional-style programming.

3. **Immutable**:
   - Once created, an `Optional` object cannot be modified.

4. **No Direct Access**:
   - You cannot directly access the value inside an `Optional`; you must use methods like `get()` or `orElse()`.

---

## **Creating an `Optional`**

### **1. `Optional.of(T value)`**
- Creates an `Optional` with a non-null value.
- Throws `NullPointerException` if the value is null.

```java
Optional<String> optional = Optional.of("Hello");
```

### **2. `Optional.ofNullable(T value)`**
- Creates an `Optional` with a value that may be null.
- If the value is null, it returns an empty `Optional`.

```java
Optional<String> optional = Optional.ofNullable(null); // Returns an empty Optional
```

### **3. `Optional.empty()`**
- Creates an empty `Optional`.

```java
Optional<String> optional = Optional.empty();
```

---

## **Common Methods in `Optional`**

### **1. `isPresent()`**
- Returns `true` if the `Optional` contains a non-null value.

```java
Optional<String> optional = Optional.of("Hello");
if (optional.isPresent()) {
    System.out.println("Value is present: " + optional.get());
}
```

### **2. `ifPresent(Consumer<T> action)`**
- Executes the action if the `Optional` contains a non-null value.

```java
Optional<String> optional = Optional.of("Hello");
optional.ifPresent(value -> System.out.println("Value: " + value));
```

### **3. `orElse(T other)`**
- Returns the value if present; otherwise, returns the specified default value.

```java
Optional<String> optional = Optional.empty();
String value = optional.orElse("Default Value");
System.out.println(value); // Output: Default Value
```

### **4. `orElseGet(Supplier<T> supplier)`**
- Returns the value if present; otherwise, invokes the supplier and returns its result.

```java
Optional<String> optional = Optional.empty();
String value = optional.orElseGet(() -> "Generated Value");
System.out.println(value); // Output: Generated Value
```

### **5. `orElseThrow(Supplier<X> exceptionSupplier)`**
- Returns the value if present; otherwise, throws an exception provided by the supplier.

```java
Optional<String> optional = Optional.empty();
String value = optional.orElseThrow(() -> new RuntimeException("Value not found"));
```

### **6. `map(Function<T, R> mapper)`**
- Applies the mapper function to the value if present; otherwise, returns an empty `Optional`.

```java
Optional<String> optional = Optional.of("Hello");
Optional<Integer> length = optional.map(String::length);
System.out.println(length.orElse(0)); // Output: 5
```

### **7. `flatMap(Function<T, Optional<R>> mapper)`**
- Similar to `map`, but the mapper function returns an `Optional`.

```java
Optional<String> optional = Optional.of("Hello");
Optional<Integer> length = optional.flatMap(s -> Optional.of(s.length()));
System.out.println(length.orElse(0)); // Output: 5
```

### **8. `filter(Predicate<T> predicate)`**
- Returns an `Optional` containing the value if it matches the predicate; otherwise, returns an empty `Optional`.

```java
Optional<String> optional = Optional.of("Hello");
Optional<String> filtered = optional.filter(s -> s.length() > 5);
System.out.println(filtered.isPresent()); // Output: false
```

---

## **Example: Using `Optional`**

```java
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Creating Optional
        Optional<String> optional = Optional.ofNullable(getValue());

        // Checking if value is present
        if (optional.isPresent()) {
            System.out.println("Value: " + optional.get());
        } else {
            System.out.println("Value is absent");
        }

        // Using ifPresent
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // Using orElse
        String value = optional.orElse("Default Value");
        System.out.println("Value: " + value);

        // Using map
        Optional<Integer> length = optional.map(String::length);
        System.out.println("Length: " + length.orElse(0));
    }

    public static String getValue() {
        return null; // Simulating a method that might return null
    }
}
```

---

## **Advantages of `Optional`**

1. **Avoids Null Checks**:
   - Reduces the need for explicit null checks, making code cleaner.

2. **Expressive Code**:
   - Clearly indicates that a value might be absent.

3. **Functional-Style Programming**:
   - Supports functional-style operations like `map`, `filter`, and `ifPresent`.

4. **Reduces Bugs**:
   - Helps avoid `NullPointerException` by encouraging explicit handling of absent values.

---

## **When to Use `Optional`**

- Use `Optional` for return types of methods that might return null.
- Avoid using `Optional` for fields, method parameters, or collections (use null or empty collections instead).

---

## **Summary**

| Method                     | Description                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
| **`of(T value)`**          | Creates an `Optional` with a non-null value.                                |
| **`ofNullable(T value)`**  | Creates an `Optional` with a value that may be null.                        |
| **`empty()`**              | Creates an empty `Optional`.                                                |
| **`isPresent()`**          | Checks if the `Optional` contains a value.                                  |
| **`ifPresent(Consumer)`**  | Executes an action if the `Optional` contains a value.                      |
| **`orElse(T other)`**      | Returns the value if present; otherwise, returns the default value.         |
| **`orElseGet(Supplier)`**  | Returns the value if present; otherwise, invokes the supplier.              |
| **`orElseThrow(Supplier)`**| Returns the value if present; otherwise, throws an exception.               |
| **`map(Function)`**        | Transforms the value if present.                                            |
| **`flatMap(Function)`**    | Transforms the value if present and flattens the result.                    |
| **`filter(Predicate)`**    | Filters the value if present based on a condition.                          |

---


LocalDate and Date :
-----------------------
`LocalDate` was introduced in **Java 8** as part of the **java.time** package to address the limitations of the older `java.util.Date` and `java.util.Calendar` classes.  

### **Key Reasons for Introducing `LocalDate`:**

1. **Immutability:**  
   - `LocalDate` is immutable and thread-safe, making it ideal for concurrent programming.  
   - Unlike `Date` and `Calendar`, which are mutable and prone to unexpected changes.

2. **Clearer API Design:**  
   - `LocalDate` provides more meaningful and intuitive method names like `.plusDays()`, `.minusWeeks()`, etc.  
   - Older classes often required cumbersome code for date manipulation.

3. **Time Zone Independence:**  
   - `LocalDate` represents **only the date** (year, month, day) without time or time zone information.  
   - This avoids confusion caused by automatic time zone adjustments in `Date`.

4. **Better Formatting and Parsing:**  
   - `LocalDate` integrates seamlessly with `DateTimeFormatter`, providing more flexible and readable date formatting.

5. **Improved Validation:**  
   - Methods like `.isLeapYear()` or `.getDayOfWeek()` simplify common date-related checks.

---

### **Example: Using `LocalDate`**
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate futureDate = today.plusDays(10);
        System.out.println("10 Days Later: " + futureDate);

        LocalDate parsedDate = LocalDate.parse("2025-03-20", DateTimeFormatter.ISO_DATE);
        System.out.println("Parsed Date: " + parsedDate);

        System.out.println("Leap Year? " + today.isLeapYear());
        System.out.println("Day of the Week: " + today.getDayOfWeek());
    }
}
```

**Output:**  
```
Today: 2025-03-08  
10 Days Later: 2025-03-18  
Parsed Date: 2025-03-20  
Leap Year? false  
Day of the Week: SATURDAY  
```

---

### **Key Methods in `LocalDate`:**
| Method                  | Description                     |
|-------------------------|---------------------------------|
| `now()`                  | Gets the current date.          |
| `plusDays(int days)`     | Adds days to the date.          |
| `minusMonths(int months)`| Subtracts months from the date. |
| `isLeapYear()`           | Checks if the year is a leap year. |
| `getDayOfWeek()`         | Returns the day of the week.     |
| `format(DateTimeFormatter formatter)` | Formats the date. |

---

### **Why Not Use `java.util.Date` or `Calendar`?**
- `Date` stores both date and time, often causing confusion.  
- `Calendar` is verbose and error-prone.  
- `LocalDate` offers cleaner syntax, better readability, and safer handling of date logic.


