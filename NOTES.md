# 📚 Java Mastery Notes

Welcome to my Java learning journey.

This repository contains well-structured Java notes, examples, interview questions, and practice programs.

---

# ☕ Java #001 - Introduction to Java

## 📖 What is Java?

Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems in 1995. It is currently maintained by Oracle Corporation.

---

## ⭐ Key Features

- Object-Oriented
- Platform Independent
- Secure
- Robust
- Portable
- Multithreaded
- High Performance

---

## 💼 Applications

- Enterprise Applications
- Web Applications
- Android Development
- Banking Systems
- Cloud & Microservices

---

## 📌 Important Term

### WORA

**Write Once, Run Anywhere**

Java programs can run on any operating system that has a Java Virtual Machine (JVM).

---

## 🎤 Interview Questions

### What is Java?

Java is a high-level, object-oriented, platform-independent programming language.

### What is WORA?

Write Once, Run Anywhere.

---

## 🔑 Key Takeaways

- Java is object-oriented.
- Java is platform independent.
- Java follows the WORA principle.
- Java is widely used in enterprise software.

# ☕ Java #002 - JDK, JRE & JVM

## 📖 What is JDK?

JDK (Java Development Kit) is a software development kit used to develop Java applications.

### JDK Includes

- JRE
- JVM
- Java Compiler (javac)
- Debugger
- Development Tools

**Purpose:** Develop, compile, debug, and run Java applications.

---

## 📖 What is JRE?

JRE (Java Runtime Environment) provides the environment required to run Java applications.

### JRE Includes

- JVM
- Core Java Libraries

**Purpose:** Run Java applications.

---

## 📖 What is JVM?

JVM (Java Virtual Machine) executes Java bytecode.

### Responsibilities

- Load class files
- Verify bytecode
- Execute bytecode
- Manage memory
- Garbage Collection

---

## 📦 What is Bytecode?

Bytecode is the intermediate code generated after compiling a Java program.

Example:

Hello.java

↓

Hello.class

The JVM executes the `.class` file.

---

## 🔄 Java Execution Flow

Hello.java

↓

javac

↓

Hello.class (Bytecode)

↓

JVM

↓

Output

---

## 🌍 Why is Java Platform Independent?

Java source code is compiled into bytecode.

The same bytecode can run on any operating system that has a JVM.

This is known as:

**WORA (Write Once, Run Anywhere)**

---

## 🧠 Easy Way to Remember

- JDK → Develop
- JRE → Run
- JVM → Execute

---

## ☕ Tea Analogy

- JDK → Everything needed to make tea.
- JRE → Ready-to-serve tea setup.
- JVM → The flame that actually makes the tea.

---

## 🎯 Key Takeaways

- JDK is for development.
- JRE is for running applications.
- JVM executes bytecode.
- Java is platform independent because of the JVM.

# Java #003 - First Java Program

## Objective
Learn how to write and execute the first Java program.

## Program Structure

```java
package com.nexorithmm.java.basics;

public class FirstJavaProgram {

    public static void main(String[] args) {

        System.out.println("Hello, Nexorithmm!");

    }

}
```

## Explanation

### Package
- Organizes related Java classes.
- Example:
  ```
  com.nexorithmm.java.basics
  ```

### Class
- Blueprint of a Java object.
- Naming convention: PascalCase.

### Main Method
```java
public static void main(String[] args)
```
- Entry point of every Java application.

### System.out.println()
- Prints output to the console.
- Moves the cursor to the next line after printing.

### print() vs println()

```java
System.out.print("Java");
System.out.print("Mastery");
```

Output:
```
JavaMastery
```

```java
System.out.println("Java");
System.out.println("Mastery");
```

Output:
```
Java
Mastery
```

## Key Takeaways

- Every Java program starts from the `main()` method.
- Java code is written inside a class.
- `System.out.println()` is used to display output.
- Package names should be lowercase.
- Class names should follow PascalCase.