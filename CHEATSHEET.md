# ⚡ Java Cheat Sheet

Quick revision notes for Java.

---

# ☕ Java #001 - Introduction to Java

## Definition

Java is a high-level, object-oriented, platform-independent programming language.

---

## Developed By

Sun Microsystems

---

## Current Owner

Oracle Corporation

---

## Released

1995

---

## Principle

WORA

Write Once, Run Anywhere

---

## Features

- Object-Oriented
- Platform Independent
- Secure
- Robust
- Portable
- Multithreaded

---

## Applications

- Web Development
- Enterprise Applications
- Banking Systems
- Android
- Cloud Applications

---

## Interview Keywords

✔ Platform Independent

✔ Bytecode

✔ JVM

✔ WORA

✔ Object-Oriented


# ☕ Java #002 - JDK, JRE & JVM

✔ JDK = Java Development Kit

✔ JRE = Java Runtime Environment

✔ JVM = Java Virtual Machine

✔ javac → Compiler

✔ .java → Source Code

✔ .class → Bytecode

✔ JVM executes Bytecode

✔ WORA = Write Once, Run Anywhere

Memory Trick

JDK → Develop

JRE → Run

JVM → Execute


# Java #003 Cheat Sheet

## Package
```java
package com.nexorithmm.java.basics;
```

## Class
```java
public class FirstJavaProgram
```

## Main Method
```java
public static void main(String[] args)
```

## Print Output
```java
System.out.println("Hello");
```

## Print Without New Line
```java
System.out.print("Hello");
```

## Print With New Line
```java
System.out.println("World");
```

## Output
```
Hello
World
```

# Java #004 Cheat Sheet

## Declare Variable

```java
int age;
```

## Initialize Variable

```java
int age = 18;
```

## Update Variable

```java
age = 20;
```

## Syntax

```java
dataType variableName = value;
```

## Examples

```java
String name = "Karthik";
int age = 24;
double salary = 50000.50;
char grade = 'A';
boolean isStudent = true;
```

# Java #005 - Data Types Cheat Sheet

## Primitive Data Types

| Type | Size | Example |
|------|------|---------|
| byte | 1 byte | `byte age = 20;` |
| short | 2 bytes | `short marks = 450;` |
| int | 4 bytes | `int salary = 50000;` |
| long | 8 bytes | `long population = 8000000000L;` |
| float | 4 bytes | `float pi = 3.14f;` |
| double | 8 bytes | `double price = 99.99;` |
| char | 2 bytes | `char grade = 'A';` |
| boolean | JVM dependent | `boolean isPlaced = true;` |

---

## Non-Primitive Data Types

- String
- Arrays
- Classes
- Objects
- Interfaces
- Enums

---

## Example

```java
int age = 20;
double price = 99.99;
char grade = 'A';
boolean isPlaced = true;
String name = "Arjun Sarkar";
```


# Java Type Casting Cheat Sheet

## Syntax

### Widening

```java
int number = 100;
double value = number;
```

### Narrowing

```java
double price = 99.99;
int amount = (int) price;
```

---

## Widening

✔ Automatic

✔ Safe

✔ No data loss

---

## Narrowing

✔ Manual

✔ Explicit casting required

✔ Possible data loss

---

## Keywords

- Implicit Casting
- Explicit Casting
- Widening
- Narrowing
- Data Loss
-

# Java #007 – Arithmetic Operators Cheat Sheet

## Operators

```text
+   Addition
-   Subtraction
*   Multiplication
/   Division
%   Modulus
```

---

## Example

```java
int a = 20;
int b = 10;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

## Remember

- `/` → Quotient
- `%` → Remainder
- Integer ÷ Integer = Integer