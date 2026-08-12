# ☕ Java Mastery - Interview Questions

## Java #001 - Introduction to Java

### Q1. What is Java?

Java is a high-level, object-oriented, class-based programming language designed to be platform-independent.

### Q2. Why is Java platform independent?

Java source code is compiled into bytecode, which can run on any system having a compatible JVM.

### Q3. What is the main feature of Java?

Platform independence is one of Java's major features.

---

## Java #002 - JDK, JRE & JVM

### Q1. What is JVM?

JVM executes Java bytecode.

### Q2. What is JRE?

JRE provides the environment required to run Java applications.

### Q3. What is JDK?

JDK contains development tools along with the JRE.

### Q4. What is the relationship?

```text
JDK
 └── JRE
      └── JVM
```

---

## Java #003 - First Java Program

### Q1. What is the main method?

```java
public static void main(String[] args)
```

It is the entry point of a standard Java application.

### Q2. What does `System.out.println()` do?

It prints output to the console followed by a new line.

### Q3. Difference between `print()` and `println()`?

`print()` does not move to a new line.

`println()` prints and moves to the next line.

---

## Java #004 - Variables

### Q1. What is a variable?

A variable is a named memory location used to store a value.

### Q2. How do you declare a variable?

```java
int age = 25;
```

### Q3. What are the parts?

```text
int  → data type
age  → variable name
25   → value
```

---

## Java #005 - Data Types

### Q1. What are the two categories of data types?

- Primitive
- Non-primitive

### Q2. Name the primitive data types.

```text
byte
short
int
long
float
double
char
boolean
```

### Q3. Which data type stores true/false?

```java
boolean
```

---

## Java #006 - Type Casting

### Q1. What is type casting?

Type casting is converting a value from one data type to another.

### Q2. What is widening?

Converting a smaller compatible type into a larger type.

```java
int x = 10;
double y = x;
```

### Q3. What is narrowing?

Converting a larger type into a smaller type explicitly.

```java
double x = 10.5;
int y = (int) x;
```

### Q4. Which type casting is generally automatic?

Widening conversion.

---

## Java #007 - Arithmetic Operators

### Q1. What are arithmetic operators?

```text
+
-
*
/
%
```

### Q2. What does `%` return?

The remainder after division.

### Q3. What is:

```java
10 % 3
```

Answer:

```text
1
```

### Q4. What happens with integer division?

```java
10 / 3
```

Result:

```text
3
```

---

## Java #008 - Assignment Operators

### Q1. What is the assignment operator?

```java
=
```

It assigns a value to a variable.

### Q2. What does `+=` mean?

```java
x += 5;
```

is equivalent to:

```java
x = x + 5;
```

### Q3. Name common compound assignment operators.

```text
+=
-=
*=
/=
%=
```

### Q4. Do assignment operators modify the variable?

Yes.

---

## Java #009 - Relational Operators

### Q1. What are relational operators?

They compare two values and return a boolean result.

### Q2. Name the relational operators.

```text
==
!=
>
<
>=
<=
```

### Q3. What is the difference between `=` and `==`?

```text
=  → assignment
== → comparison
```

### Q4. What is the return type?

```text
boolean
```

---

## Java #010 - Logical Operators

### Q1. What are logical operators?

Logical operators combine or reverse boolean conditions.

### Q2. What does `&&` mean?

AND.

Both conditions must be true.

### Q3. What does `||` mean?

OR.

At least one condition must be true.

### Q4. What does `!` mean?

NOT.

It reverses the boolean value.

### Q5. What is:

```java
true && false
```

Answer:

```text
false
```

### Q6. What is:

```java
true || false
```

Answer:

```text
true
```

### Q7. What is:

```java
!true
```

Answer:

```text
false
```

### Q8. Where are logical operators commonly used?

- `if`
- `if-else`
- loops
- validation
- decision-making
- complex boolean conditions

### Q9. What is the time complexity of evaluating a fixed logical expression?

```text
O(1)
```

### Q10. Quick memory trick?

```text
&& → BOTH
|| → ONE OR BOTH
!  → REVERSE
```

````markdown id="3r7z8x"
---

# 🔵 Java #011 - Unary Operators — Interview Questions

## 1. What are unary operators in Java?

Unary operators are operators that work on **only one operand**.

Examples:

```text
+  -  ++  --  !
````

---

## 2. What is the difference between `a++` and `++a`?

`a++` is **post-increment**. It uses the current value first and then increases it.

`++a` is **pre-increment**. It increases the value first and then uses the new value.

```text
a++ → Use → Increase
++a → Increase → Use
```

---

## 3. What is the difference between `a--` and `--a`?

`a--` is **post-decrement**. It uses the current value first and then decreases it.

`--a` is **pre-decrement**. It decreases the value first and then uses the new value.

```text
a-- → Use → Decrease
--a → Decrease → Use
```

---

## 4. What does the `!` operator do?

The `!` operator is the **logical NOT operator**. It reverses a boolean value.

```java
boolean flag = true;

System.out.println(!flag);
```

Output:

```text
false
```

---

## 5. What will be the output?

```java
int a = 5;

System.out.println(a++);
System.out.println(++a);
System.out.println(a);
```

### Answer

```text
5
7
7
```

### Explanation

```text
a = 5

a++ → prints 5, then a becomes 6
++a → a becomes 7, then prints 7
a   → prints 7
```

---

## 🧠 Interview Memory

```text
POST → Use first → Change later
PRE  → Change first → Use later

++ → Increase by 1
-- → Decrease by 1
!  → Reverse boolean
```

**Java #011 — Interview Preparation ✅**

```
```
