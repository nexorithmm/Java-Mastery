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
-

# 🚀 Java Assignment Operators Cheat Sheet

```java
a = b;      // Assignment
a += b;     // a = a + b
a -= b;     // a = a - b
a *= b;     // a = a * b
a /= b;     // a = a / b
a %= b;     // a = a % b
```

### Example

```java
int number = 20;

number += 10;   //30
number -= 5;    //25
number *= 2;    //50
number /= 5;    //10
number %= 3;    //1
```
-

# ☕ Java Cheat Sheet

## Relational Operators

### Operators

==  → Equal To

!=  → Not Equal To

>   → Greater Than

<   → Less Than

>=  → Greater Than or Equal To

<=  → Less Than or Equal To

---

### Example

```java
int a = 20;
int b = 15;

System.out.println(a > b);
```

Output

```
true
```

---

### Returns

All relational operators return

```
boolean
```

---

### Time Complexity

O(1)

### Space Complexity

O(1)

---

### Interview Tip

Remember the difference:

```
=  → Assignment

== → Comparison
```
---

# ☕ Java Mastery Cheat Sheet

## #010 - Logical Operators

### Operators

```text
&&  → AND
||  → OR
!   → NOT
```

---

### AND (`&&`)

Both conditions must be true.

```text
true  && true  → true
true  && false → false
false && true  → false
false && false → false
```

---

### OR (`||`)

At least one condition must be true.

```text
true  || true  → true
true  || false → true
false || true  → true
false || false → false
```

---

### NOT (`!`)

Reverses the boolean value.

```text
!true  → false
!false → true
```

---

### Example

```java
int age = 25;
boolean hasLicense = true;

System.out.println(age >= 18 && hasLicense);
```

Output:

```text
true
```

---

### Quick Memory Trick

```text
&& → BOTH
|| → ONE OR BOTH
!  → REVERSE
```

---

### Complexity

```text
Time  : O(1)
Space : O(1)
```

---

### Interview Tip

Always remember:

```text
&& → all conditions must be true

|| → at least one condition must be true

!  → reverses true/false
```

````markdown
---

# 🔵 Java #011 - Unary Operators

## Unary Operators

Unary operators work on **one operand**.

```text
+   → Unary Plus
-   → Unary Minus
++  → Increment
--  → Decrement
!   → Logical NOT
````

## Increment

```text
a++  → Post-Increment
++a  → Pre-Increment
```

```text
a++ → Use first → Increase
++a → Increase first → Use
```

## Decrement

```text
a--  → Post-Decrement
--a  → Pre-Decrement
```

```text
a-- → Use first → Decrease
--a → Decrease first → Use
```

## Logical NOT

```text
!true  → false
!false → true
```

## Quick Example

```java
int a = 10;

System.out.println(a++);  // 10
System.out.println(++a);  // 12

System.out.println(a--);  // 12
System.out.println(--a);  // 10
```

## 🧠 Memory Trick

```text
POST  → Use → Change
PRE   → Change → Use
```

## ⚡ Complexity

```text
Time  → O(1)
Space → O(1)
```

## 🎯 Remember

```text
++ → +1
-- → -1
!  → Reverse boolean
```

**Java #011 — Unary Operators ✅**

```
```
