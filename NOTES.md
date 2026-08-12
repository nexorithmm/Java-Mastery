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


# Java #004 - Variables

## Objective

Learn how to declare, initialize, update, and use variables in Java.

---

## What is a Variable?

A variable is a named memory location used to store data.

Syntax:

```java
dataType variableName = value;
```

Example:

```java
int age = 18;
String name = "Arjun Sarkar";
double height = 5.6;
char grade = 'A';
boolean isStudent = true;
```

---

## Updating Variables

Variables can change their values during program execution.

```java
age = 20;
name = "Sarkar";
height = 6.0;
grade = 'O';
isStudent = false;
```

---

## Variable Naming Rules

### Valid

```java
studentName
employeeSalary
mobileNumber
age
```

### Invalid

```java
1age
student name
class
```

---

## Naming Convention

Use **camelCase** for variable names.

Examples:

```java
studentName
employeeSalary
isStudent
```

---

## Key Points

- Variables store data.
- Variables can be updated.
- Variable names should be meaningful.
- Follow camelCase naming convention.
-

# Java #005 - Data Types

## What is a Data Type?

A data type specifies the type of value that a variable can store.

Example:

```java
int age = 20;
String name = "Arjun Sarkar";
```

---

## Types of Data Types

Java has two categories of data types:

### 1. Primitive Data Types

Primitive data types store actual values.

There are **8 primitive data types**:

| Data Type | Size | Example |
|-----------|------|---------|
| byte | 1 byte | `byte age = 20;` |
| short | 2 bytes | `short marks = 450;` |
| int | 4 bytes | `int salary = 50000;` |
| long | 8 bytes | `long population = 8000000000L;` |
| float | 4 bytes | `float pi = 3.14f;` |
| double | 8 bytes | `double price = 99.99;` |
| char | 2 bytes | `char grade = 'A';` |
| boolean | JVM dependent | `boolean isPlaced = true;` |

---

### 2. Non-Primitive Data Types

Non-Primitive data types store references to objects.

Example:

```java
String name = "Arjun Sarkar";
```

Other Non-Primitive Data Types:

- Arrays
- Classes
- Objects
- Interfaces
- Enums

These topics will be covered in upcoming lessons.

---

## Why are Data Types Important?

- Store data efficiently
- Improve memory management
- Prevent invalid assignments
- Improve code readability
- Help Java perform type checking

---

## Summary

- Java has two categories of data types.
- Primitive data types store actual values.
- Non-Primitive data types store references.
- String is the most commonly used non-primitive data type.
-

# Java #006 - Type Casting

## What is Type Casting?

Type Casting is the process of converting a value from one data type to another.

Example:

```java
int number = 100;
double value = number;
```

Here, the integer value is automatically converted into a double.

---

## Types of Type Casting

### 1. Widening (Implicit Casting)

- Performed automatically by Java.
- Converts a smaller data type into a larger data type.
- No data loss occurs.

Example:

```java
int number = 100;
double value = number;
```

Output:

```
100.0
```

---

### 2. Narrowing (Explicit Casting)

- Performed manually by the programmer.
- Converts a larger data type into a smaller data type.
- Data loss may occur.

Example:

```java
double price = 99.99;
int amount = (int) price;
```

Output:

```
99
```

---

## Widening Conversion Order

```
byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double
```

---

## Advantages

- Automatic conversion between compatible types.
- Improves code flexibility.
- Useful in calculations and method calls.

---

## Disadvantages

- Narrowing may lose data.
- Explicit casting requires programmer attention.
- Precision can be reduced.

---

## Real-World Uses

- Mathematical calculations
- Database operations
- API responses
- Financial applications
- Scientific calculations
-

# Java #007 – Arithmetic Operators

## 📖 Introduction

Arithmetic operators are used to perform basic mathematical operations on numeric values in Java.

These operators are commonly used in calculations, loops, conditions, and problem-solving.

---

## 🔢 Arithmetic Operators

| Operator | Description | Example |
|----------|-------------|---------|
| + | Addition | a + b |
| - | Subtraction | a - b |
| * | Multiplication | a * b |
| / | Division | a / b |
| % | Modulus (Remainder) | a % b |

---

## 💻 Java Program

```java
public class ArithmeticOperatorsExample {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        System.out.println("=========================");
        System.out.println("   Arithmetic Operators");
        System.out.println("=========================");

        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);

        System.out.println();

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));
    }
}
```

---

## 🖥️ Output

```text
=========================
   Arithmetic Operators
=========================
Value of A : 20
Value of B : 10

Addition       : 30
Subtraction    : 10
Multiplication : 200
Division       : 2
Modulus        : 0
```

---

## 🌍 Real-World Applications

- Calculator applications
- Billing systems
- Banking software
- Game development
- E-commerce calculations
- Inventory management

---

## 📌 Key Points

- `+` → Addition
- `-` → Subtraction
- `*` → Multiplication
- `/` → Division
- `%` → Returns the remainder
- Integer division removes the decimal part.
-

# ☕ Java #008 - Assignment Operators

## 📖 Definition

Assignment operators are used to assign values to variables and update their existing values.

They provide a shorter and cleaner way to perform arithmetic operations while assigning the result.

---

## 📚 Assignment Operators

| Operator | Description | Example |
|----------|-------------|---------|
| = | Assign | a = 10 |
| += | Add and Assign | a += 5 |
| -= | Subtract and Assign | a -= 5 |
| *= | Multiply and Assign | a *= 5 |
| /= | Divide and Assign | a /= 5 |
| %= | Modulus and Assign | a %= 5 |

---

## 💻 Example

```java
int number = 20;

number += 10;
number -= 5;
number *= 2;
number /= 5;
number %= 3;
```

---

## 🎯 Output

```
Initial Value : 20

After += 10 : 30
After -= 5  : 25
After *= 2  : 50
After /= 5  : 10
After %= 3  : 1
```

---

## 💡 Key Points

- Assignment operators update the existing variable.
- They reduce code length.
- Improve code readability.
- Frequently used in loops and calculations.
-

# ☕ Java #009 - Relational Operators

## 📖 Introduction

Relational operators are used to compare two values or expressions in Java. The result of every comparison is always a boolean value (`true` or `false`).

They are commonly used in decision-making statements such as `if`, `if-else`, loops, and conditional expressions.

---

## 🔹 Relational Operators

| Operator | Meaning |
|----------|---------|
| == | Equal To |
| != | Not Equal To |
| > | Greater Than |
| < | Less Than |
| >= | Greater Than or Equal To |
| <= | Less Than or Equal To |

---

## 💻 Java Program

```java
public class RelationalOperatorsDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        System.out.println("===========================================");
        System.out.println("            Relational Operators");
        System.out.println("===========================================");

        System.out.println();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
    }
}
```

---

## 📊 Output

```
===========================================
            Relational Operators
===========================================

a = 20
b = 15

a == b : false
a != b : true
a > b  : true
a < b  : false
a >= b : true
a <= b : false
```

---

## ⏱️ Time Complexity

O(1)

---

## 💾 Space Complexity

O(1)

---

## ✅ Key Points

- Used to compare two values.
- Always returns a boolean value.
- Does not modify variable values.
- Frequently used with if-else statements and loops.
---

# ☕ Java #010 - Logical Operators

## 📖 Introduction

Logical operators are used to combine or reverse boolean conditions in Java.

Java provides three main logical operators:

| Operator | Name | Meaning |
|----------|------|---------|
| `&&` | AND | Both conditions must be true |
| `||` | OR | At least one condition must be true |
| `!` | NOT | Reverses the boolean value |

---

## 🔹 1. AND Operator (`&&`)

The `&&` operator returns `true` only when both conditions are true.

```java
boolean result = true && true;
System.out.println(result);
```

Output:

```text
true
```

Examples:

```text
true  && true  → true
true  && false → false
false && true  → false
false && false → false
```

### Real-World Example

```text
Age >= 18 AND Has Driving License
```

Both conditions must be satisfied.

---

## 🔹 2. OR Operator (`||`)

The `||` operator returns `true` when at least one condition is true.

```java
boolean result = true || false;
System.out.println(result);
```

Output:

```text
true
```

Examples:

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

### Real-World Example

```text
Cash OR Card
```

Either payment method can be used.

---

## 🔹 3. NOT Operator (`!`)

The `!` operator reverses a boolean value.

```java
boolean isStudent = false;

System.out.println(!isStudent);
```

Output:

```text
true
```

Examples:

```text
!true  → false
!false → true
```

---

## 💻 Java Program

```java
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        int age = 25;
        boolean hasLicense = true;
        boolean isStudent = false;

        System.out.println("=========================");
        System.out.println("       Logical Operators");
        System.out.println("=========================");

        System.out.println();

        System.out.println("age = " + age);
        System.out.println("hasLicense = " + hasLicense);
        System.out.println("isStudent = " + isStudent);

        System.out.println();

        System.out.println(
            "age >= 18 && hasLicense : " +
            (age >= 18 && hasLicense)
        );

        System.out.println(
            "age < 18 || isStudent   : " +
            (age < 18 || isStudent)
        );

        System.out.println(
            "!isStudent              : " +
            !isStudent
        );
    }
}
```

---

## 📊 Output

```text
=========================
       Logical Operators
=========================

age = 25
hasLicense = true
isStudent = false

age >= 18 && hasLicense : true
age < 18 || isStudent   : false
!isStudent              : true
```

---

## 📋 Truth Tables

### AND (`&&`)

| A | B | A && B |
|---|---|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### OR (`||`)

| A | B | A || B |
|---|---|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### NOT (`!`)

| A | !A |
|---|----|
| true | false |
| false | true |

---

## ⏱️ Time Complexity

O(1)

## 💾 Space Complexity

O(1)

---

## ✅ Key Points

- `&&` means AND.
- `||` means OR.
- `!` means NOT.
- Logical operators work with boolean expressions.
- They are commonly used in `if`, `else`, loops, and decision-making.
- Logical operators return a boolean value.
---

````markdown
---

# 🔵 Java #011 - Unary Operators

## 📌 What are Unary Operators?

Unary operators operate on **only one operand**.

```java
int a = 10;
a++;
````

Here, `++` operates only on the variable `a`.

## 🔹 Unary Operators

| Operator | Name        |
| -------- | ----------- |
| `+`      | Unary Plus  |
| `-`      | Unary Minus |
| `++`     | Increment   |
| `--`     | Decrement   |
| `!`      | Logical NOT |

## ➕ Unary Plus

The unary `+` operator represents a positive value.

```java
int a = 10;
System.out.println(+a);
```

Output:

```text
10
```

## ➖ Unary Minus

The unary `-` operator changes the sign of a value.

```java
int a = 10;
System.out.println(-a);
```

Output:

```text
-10
```

## ⬆️ Increment Operator

The `++` operator increases a value by `1`.

```java
a++;
```

is equivalent to:

```java
a = a + 1;
```

### Post-Increment

```java
a++;
```

```text
Use first → Increase later
```

### Pre-Increment

```java
++a;
```

```text
Increase first → Use later
```

## ⬇️ Decrement Operator

The `--` operator decreases a value by `1`.

```java
a--;
```

is equivalent to:

```java
a = a - 1;
```

### Post-Decrement

```java
a--;
```

```text
Use first → Decrease later
```

### Pre-Decrement

```java
--a;
```

```text
Decrease first → Use later
```

## ❗ Logical NOT

The `!` operator reverses a boolean value.

```java
boolean isJavaFun = true;

System.out.println(!isJavaFun);
```

Output:

```text
false
```

Remember:

```text
true  → false
false → true
```

## 🧠 Pre vs Post

```text
a++  → Use first → Increase
++a  → Increase first → Use

a--  → Use first → Decrease
--a  → Decrease first → Use
```

## 💻 Practical Example

```java
package com.nexorithmm.java.basics;

public class UnaryOperator {

    public static void main(String[] args) {

        int a = 10;

        // Unary Plus
        System.out.println(+a);

        // Unary Minus
        System.out.println(-a);

        // Post-Increment: Use first, then increase
        System.out.println(a++);

        // Pre-Increment: Increase first, then use
        System.out.println(++a);

        // Post-Decrement: Use first, then decrease
        System.out.println(a--);

        // Pre-Decrement: Decrease first, then use
        System.out.println(--a);

        // Logical NOT
        boolean isJavaFun = true;
        System.out.println(!isJavaFun);
    }
}
```

## 🎯 Key Learning

* Unary operators work on a single operand.
* Unary `+` represents a positive value.
* Unary `-` changes the sign.
* `++` increases a value by `1`.
* `--` decreases a value by `1`.
* Prefix operators change the value before using it.
* Postfix operators use the value before changing it.
* `!` reverses a boolean value.

## ⚡ Complexity

Unary operators perform constant-time operations.

```text
Time  → O(1)
Space → O(1)
```

## 🏆 Java #011 Status

```text
Topic  → Unary Operators
Class  → UnaryOperator
Status → ✅ Completed
```

```
```
