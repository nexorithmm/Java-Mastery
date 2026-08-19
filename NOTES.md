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
# ☕ Java #012 - Ternary Operator

## 📌 What is a Ternary Operator?

The ternary operator is a conditional operator used to make a simple if-else decision in a single expression.

It works with three operands:

condition ? valueIfTrue : valueIfFalse

---

## 🎯 Why Do We Use It?

The ternary operator is mainly used to simplify short and simple if-else conditions.

### Using if-else

int age = 20;
String result;

if (age >= 18) {
result = "Eligible";
} else {
result = "Not Eligible";
}

### Using Ternary Operator

int age = 20;

String result = age >= 18 ? "Eligible" : "Not Eligible";

The ternary version is shorter and useful when the condition is simple.

---

## 🧩 Syntax

condition ? valueIfTrue : valueIfFalse;

### Parts

condition
→ The condition that is evaluated.

valueIfTrue
→ Returned when the condition is true.

valueIfFalse
→ Returned when the condition is false.

---

## 🔹 Example 1 - Check Eligibility

int age = 20;

String result = age >= 18 ? "Eligible" : "Not Eligible";

System.out.println(result);

### Output

Eligible

### Explanation

20 >= 18 is true, so the ternary operator selects "Eligible".

---

## 🔹 Example 2 - Find the Larger Number

int a = 10;
int b = 20;

int largest = a > b ? a : b;

System.out.println(largest);

### Output

20

### Explanation

10 > 20 is false, so the value of b is selected.

---

## 🔹 Example 3 - Check Even or Odd

int number = 7;

String type = number % 2 == 0 ? "Even" : "Odd";

System.out.println(type);

### Output

Odd

### Explanation

7 % 2 == 0 is false, so "Odd" is selected.

---

## 🔹 Example 4 - Positive, Negative, or Zero

int value = -5;

String result = value > 0
        ? "Positive"
        : value < 0
        ? "Negative"
        : "Zero";

System.out.println(result);

### Output

Negative

### Explanation

value > 0 is false.

Then value < 0 is true.

Therefore, "Negative" is selected.

This is called a nested ternary operator.

---

## 🔹 Example 5 - Find the Smallest Number

int x = 25;
int y = 15;

int smallest = x < y ? x : y;

System.out.println(smallest);

### Output

15

### Explanation

25 < 15 is false, so y is selected.

---

## ⚠️ Nested Ternary

A ternary operator can contain another ternary operator.

Example:

int value = -5;

String result = value > 0
        ? "Positive"
        : value < 0
        ? "Negative"
        : "Zero";

However, too many nested ternary operators can make the code difficult to read.

Use them only when the logic remains simple and readable.

---

## 🆚 Ternary vs if-else

### if-else

int a = 10;
int b = 20;

int largest;

if (a > b) {
largest = a;
} else {
largest = b;
}

### Ternary

int a = 10;
int b = 20;

int largest = a > b ? a : b;

Both produce the same result.

---

## 🧠 Important Rules

1. Ternary operator works with three operands.

2. It uses the ? and : symbols.

3. The expression before ? is the condition.

4. The expression after ? is selected when the condition is true.

5. The expression after : is selected when the condition is false.

6. It is best suited for simple conditional expressions.

7. Too many nested ternaries can reduce readability.

8. For complex logic, normal if-else is generally more readable.

9. The ternary operator is an expression because it produces a value.

---

## 🔥 Key Pattern

condition ? trueValue : falseValue

Simple condition
↓
Ternary

Complex logic
↓
if-else

---

## 🎯 Interview Point

The ternary operator is a concise alternative to a simple if-else when we need to select one of two values based on a condition.

---

## 📝 Practice

Predict the output:

int a = 5;
int b = 10;

int result = a++ > 5 ? a : ++b;

System.out.println(result);
System.out.println(a);
System.out.println(b);

### Answer

result = 11
a = 6
b = 11

### Reason

a++ uses 5 first.

5 > 5 is false.

Then a becomes 6.

Since the condition is false, ++b executes.

b becomes 11.

Therefore:

result = 11
a = 6
b = 11

---

## ✅ Key Takeaway

Ternary Operator:

condition ? trueValue : falseValue

Use it to write concise and readable code for simple conditional decisions.

Simple logic → Ternary
Complex logic → if-else

Java #012 - Completed ✅
---

# ☕ Java #013 - Switch Statement

## 📌 What is a Switch Statement?

The `switch` statement is a decision-making statement used to execute one block of code from multiple possible options.

It is useful when we want to compare one expression against several fixed values.

Instead of writing multiple `if-else-if` conditions, we can use a `switch` statement when the possible values are known.

---

## 🎯 Why Do We Use It?

The `switch` statement is mainly used when we need to perform different actions based on a single value.

### Using if-else

```java
int day = 2;

if (day == 1) {
    System.out.println("Monday");
} else if (day == 2) {
    System.out.println("Tuesday");
} else if (day == 3) {
    System.out.println("Wednesday");
} else {
    System.out.println("Invalid Day");
}
```

### Using Switch

```java
int day = 2;

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
        System.out.println("Invalid Day");
}
```

The `switch` version is often easier to read when there are many fixed choices.

---

## 🧩 Syntax

```java
switch (expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

### Parts

**expression**
→ The value that is evaluated.

**case**
→ Defines a possible matching value.

**break**
→ Stops the execution of the switch statement.

**default**
→ Executes when none of the cases match.

---

## 🔹 Example 1 - Day of the Week

```java
int day = 2;

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

    case 4:
        System.out.println("Thursday");
        break;

    case 5:
        System.out.println("Friday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

### Output

```text
Tuesday
```

### Explanation

The value of `day` is `2`.

Therefore, `case 2` matches and `"Tuesday"` is printed.

The `break` statement then stops the switch.

---

## 🔹 Example 2 - Default Case

```java
int day = 8;

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
        System.out.println("Invalid Day");
}
```

### Output

```text
Invalid Day
```

### Explanation

There is no case for the value `8`.

Therefore, the `default` block executes.

---

## 🔹 Example 3 - Multiple Cases

Multiple cases can execute the same block of code.

```java
int day = 6;

switch (day) {

    case 6:
    case 7:
        System.out.println("Weekend");
        break;

    default:
        System.out.println("Weekday");
}
```

### Output

```text
Weekend
```

### Explanation

Both `6` and `7` represent the weekend.

There is no code between `case 6` and `case 7`, so both cases lead to the same block.

---

## ⚠️ Break Statement

The `break` statement is used to exit the switch after a matching case is executed.

Example:

```java
int number = 2;

switch (number) {

    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    case 3:
        System.out.println("Three");
        break;
}
```

### Output

```text
Two
```

After `"Two"` is printed, `break` exits the switch.

---

## ⚠️ Fall-Through

If `break` is not used, execution continues into the next cases.

Example:

```java
int number = 2;

switch (number) {

    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
        break;

    default:
        System.out.println("Default");
}
```

### Output

```text
Two
Three
```

### Explanation

`number` is `2`, so execution starts at `case 2`.

Because there is no `break` after `case 2`, execution continues to `case 3`.

This behavior is called **fall-through**.

---

## 🧠 Important Point About Fall-Through

```text
case 1
   ↓
case 2
   ↓
case 3
   ↓
break
```

Once a matching case is found, Java continues executing subsequent cases until it reaches a `break` or the end of the switch.

---

## 💻 Practical Example

```java
package com.nexorithmm.java.basics;

public class SwitchStatement {

    public static void main(String[] args) {

        int choice = 2;

        switch (choice) {

            case 1:
                System.out.println("Add");
                break;

            case 2:
                System.out.println("Update");
                break;

            case 3:
                System.out.println("Delete");
                break;

            case 4:
                System.out.println("View");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
```

### Output

```text
Update
```

### Explanation

The value of `choice` is `2`.

Therefore, `case 2` is executed.

After printing `"Update"`, the `break` statement exits the switch.

---

## 🔄 Switch vs if-else

### Switch

```java
int choice = 2;

switch (choice) {

    case 1:
        System.out.println("Add");
        break;

    case 2:
        System.out.println("Update");
        break;

    default:
        System.out.println("Invalid");
}
```

### if-else

```java
int choice = 2;

if (choice == 1) {
    System.out.println("Add");
} else if (choice == 2) {
    System.out.println("Update");
} else {
    System.out.println("Invalid");
}
```

Both can produce the same result.

### When to Prefer Switch?

Use `switch` when:

* One expression is compared against multiple fixed values.
* The possible choices are clearly defined.
* You want readable multi-option decision logic.

Use `if-else` when:

* Conditions involve ranges.
* Conditions contain complex logical expressions.
* Comparisons are not based on fixed matching values.

---

# 🆕 Modern Switch Expression

Modern Java provides a cleaner switch syntax using the arrow (`->`) syntax.

```java
int day = 2;

switch (day) {

    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid Day");
}
```

### Output

```text
Tuesday
```

---

## 🔥 Arrow Syntax and Break

With the arrow syntax:

```java
case 1 -> System.out.println("Monday");
```

we do not need to write `break`.

The arrow case does not fall through into the next case.

---

## 🔹 Switch Expression Returning a Value

A switch expression can return a value and assign it to a variable.

```java
int day = 2;

String result = switch (day) {

    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid Day";
};

System.out.println(result);
```

### Output

```text
Tuesday
```

### Explanation

The switch expression evaluates the value of `day`.

Since `day` is `2`, the expression returns `"Tuesday"`.

That value is assigned to `result`.

---

## 🧠 Switch Statement vs Switch Expression

### Switch Statement

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
}
```

Used mainly to perform an action.

### Switch Expression

```java
String result = switch (day) {
    case 1 -> "Monday";
    default -> "Invalid";
};
```

Produces and returns a value.

---

## ⚡ Important Rules

1. `switch` is used for multi-way decision making.

2. `case` defines possible matching values.

3. `break` exits the switch.

4. Without `break`, fall-through can occur.

5. `default` executes when no case matches.

6. Multiple cases can share the same block.

7. Modern arrow syntax uses `->`.

8. Arrow-style cases do not require `break`.

9. A switch expression can produce a value.

10. `switch` is useful when comparing one expression against multiple fixed choices.

---

## 🎯 Interview Point

A `switch` statement is a decision-making statement that allows a program to select one block of code from multiple possible cases based on the value of an expression.

The `break` statement prevents fall-through in traditional switch statements, while modern arrow-style switch cases do not require `break`.

---

## 📝 Practice

Predict the output:

```java
int x = 2;

switch (x) {

    case 1:
        System.out.print("A");

    case 2:
        System.out.print("B");

    case 3:
        System.out.print("C");
        break;

    default:
        System.out.print("D");
}
```

### Answer

```text
BC
```

### Reason

`x` is `2`, so execution starts at `case 2`.

`B` is printed.

There is no `break` after `case 2`, so execution falls through to `case 3`.

`C` is printed.

Then `break` stops the switch.

Therefore:

```text
BC
```

---

## 🏆 Key Takeaway

Switch Statement:

```text
switch(expression)
       ↓
    case value
       ↓
      code
       ↓
     break
       ↓
    next case
```

Use `switch` for clear multi-option decisions based on fixed values.

Traditional switch:

```text
case → code → break
```

Modern switch:

```text
case value -> result
```

Simple fixed choices → `switch`

Complex conditions or ranges → `if-else`

Java #013 - Completed ✅
---

# Java Mastery #014.1 — while Loop

## 1. What is a while Loop?

A `while` loop is a looping statement used to repeatedly execute a block of code as long as a given condition is `true`.

The condition is checked before every iteration.

## 2. Syntax

```java
while (condition) {
    // statements
}
```

## 3. Basic Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### Output

```text
1
2
3
4
5
```

## 4. How while Loop Works

```text
Initialize
    ↓
Check Condition
    ↓
Condition true?
    ↓ Yes
Execute Statements
    ↓
Update Variable
    ↓
Check Condition Again
    ↓
Condition false → Stop
```

## 5. Example: Print Even Numbers

```java
int i = 2;

while (i <= 10) {
    System.out.println(i);
    i += 2;
}
```

### Output

```text
2
4
6
8
10
```

## 6. Example: Count Down

```java
int i = 10;

while (i >= 1) {
    System.out.print(i + " ");
    i -= 2;
}
```

### Output

```text
10 8 6 4 2
```

## 7. Example: Multiplication Pattern

```java
int i = 1;

while (i < 10) {
    System.out.print(i + " ");
    i *= 2;
}
```

### Output

```text
1 2 4 8
```

## 8. Condition Checked Before Execution

A `while` loop is a **pre-test loop**.

```java
int i = 5;

while (i < 5) {
    System.out.println(i);
}
```

### Output

```text
No output
```

Because:

```text
5 < 5 → false
```

The loop body never executes.

## 9. Infinite Loop

If the loop variable is not updated correctly, the condition may remain `true`.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
}
```

Here `i` never changes, so the condition remains true.

This creates an **infinite loop**.

## 10. Important Points

- `while` repeatedly executes code while the condition is `true`.
- The condition is checked before every iteration.
- `while` is a pre-test loop.
- If the condition is initially `false`, the body does not execute.
- The loop variable should be updated appropriately.
- Incorrect updating can create an infinite loop.
- `while` is useful when the number of iterations is not necessarily known in advance.

## 11. Common Use Cases

- Repeating an operation until a condition changes.
- Reading input until a specific condition is reached.
- Menu-driven programs.
- Processing data until a condition is satisfied.
- Repeating operations when the number of iterations is not known beforehand.

## 12. Key Pattern

```text
Condition → Execute → Update → Repeat
```

## 13. Class Example

```java
package com.nexorithmm.java.basics;

public class WhileLoopExample {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

### Output

```text
1
2
3
4
5
```

## 14. Summary

The `while` loop is used to repeatedly execute statements while a condition remains `true`.

The most important thing to remember is:

```text
Check → Execute → Update → Repeat
```

Java Mastery #014.1 — while Loop completed.