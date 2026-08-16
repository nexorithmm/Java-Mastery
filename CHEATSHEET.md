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
# ☕ Java #012 - Ternary Operator

## 🔑 Core Syntax

condition ? valueIfTrue : valueIfFalse;

Think:

Condition
↓
┌───────┐
true   false
↓       ↓
value   value

---

## 🧠 Quick Understanding

Ternary Operator
↓
Short form of simple if-else
↓
Returns a value

---

## 🔹 Common Examples

### Check Eligibility

int age = 20;

String result = age >= 18 ? "Eligible" : "Not Eligible";

Output:
Eligible

---

### Find Largest

int a = 10;
int b = 20;

int largest = a > b ? a : b;

Output:
20

---

### Even or Odd

int number = 7;

String type = number % 2 == 0 ? "Even" : "Odd";

Output:
Odd

---

### Find Smallest

int x = 25;
int y = 15;

int smallest = x < y ? x : y;

Output:
15

---

## 🔄 Ternary vs if-else

if-else:

if (a > b) {
largest = a;
} else {
largest = b;
}

Ternary:

int largest = a > b ? a : b;

Both can produce the same result.

---

## ⚠️ Nested Ternary

A ternary can contain another ternary.

Example:

value > 0
    ? "Positive"
    : value < 0
        ? "Negative"
        : "Zero";

Use nested ternary carefully.

Too much nesting → reduced readability.

---

## 🎯 When To Use

Simple condition
→ Ternary

Complex condition
→ if-else

Need to select one of two values
→ Ternary

---

## 💡 Remember

? → separates the condition from the true value

: → separates the true value from the false value

Pattern:

condition ? trueValue : falseValue

---

## 🔥 Interview Point

The ternary operator is an expression that evaluates a condition and returns one of two values.

It is useful for concise conditional assignments.

---

## 📝 Quick Revision

Eligibility:
age >= 18 ? "Eligible" : "Not Eligible"

Largest:
a > b ? a : b

Even/Odd:
number % 2 == 0 ? "Even" : "Odd"

Positive/Negative/Zero:
value > 0 ? "Positive" : value < 0 ? "Negative" : "Zero"

---

## ✅ Java #012

Topic: Ternary Operator

Status: Completed
---

# ☕ Java #013 - Switch Statement Cheat Sheet

## 📌 Definition

The `switch` statement is used for **multi-way decision making** by comparing one expression against multiple fixed values.

---

## 🧩 Basic Syntax

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

---

## 🔑 Important Keywords

| Keyword   | Purpose                           |
| --------- | --------------------------------- |
| `switch`  | Evaluates the expression          |
| `case`    | Defines a possible matching value |
| `break`   | Exits the traditional switch      |
| `default` | Executes when no case matches     |

---

## 💻 Example

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

Output:

```text
Tuesday
```

---

## ⚠️ Fall-Through

If `break` is omitted, execution continues into the next cases.

```java
int number = 2;

switch (number) {

    case 1:
        System.out.print("A");

    case 2:
        System.out.print("B");

    case 3:
        System.out.print("C");
        break;
}
```

Output:

```text
BC
```

### Remember

```text
No break
   ↓
Fall-through
   ↓
Next case executes
```

---

## 🔗 Multiple Cases

Multiple cases can share the same block.

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

Output:

```text
Weekend
```

---

# 🆕 Modern Switch Syntax

Java provides arrow (`->`) syntax for switch cases.

```java
int day = 2;

switch (day) {

    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid Day");
}
```

### Important

```text
case value -> statement
```

* No `break` required.
* No traditional fall-through.
* Cleaner and more concise.

---

## 🔥 Switch Expression

A switch expression can produce a value.

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

Output:

```text
Tuesday
```

---

## 🆚 Switch vs if-else

| Switch                             | if-else                  |
| ---------------------------------- | ------------------------ |
| Fixed values                       | Complex conditions       |
| Multiple choices                   | Ranges/conditions        |
| Uses `case`                        | Uses boolean expressions |
| Good readability for fixed options | More flexible            |

### Quick Rule

```text
Fixed choices → switch

Complex conditions / ranges → if-else
```

---

## 🧠 Quick Revision

```text
switch
   ↓
Multi-way decision

case
   ↓
Matching value

break
   ↓
Exit switch

default
   ↓
No case matches

No break
   ↓
Fall-through

case value ->
   ↓
Modern syntax

switch expression
   ↓
Returns a value
```

---

## 🎯 Key Points

* `switch` is used for multi-way decision making.
* `case` defines matching values.
* `break` prevents fall-through in traditional switch.
* Missing `break` can cause fall-through.
* `default` handles unmatched values.
* Multiple cases can share one block.
* Arrow syntax uses `->`.
* Arrow-style cases do not require `break`.
* Switch expressions can return values.

---

## 🏆 Java #013 Status

```text
Topic  → Switch Statement
Status → ✅ Completed
```
