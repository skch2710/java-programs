
					JAVA NOTES:  Sathich Kumar Ch
				-------------------------------------
	
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



