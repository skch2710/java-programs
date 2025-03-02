
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
   - Implementations: `PriorityQueue`, `ArrayDeque`, ConcurrentLinkedQueue, `LinkedList` (acts as Queue)
   
4. **Map** (Key-Value pairs, unique keys)  
   - Implementations: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`, `ConcurrentHashMap`

