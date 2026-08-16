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
# ☕ Java #012 - Ternary Operator

## 🎯 Interview Questions & Answers

### 1. What is the ternary operator in Java?

The ternary operator is a conditional operator used to evaluate a condition and return one of two values.

Syntax:

condition ? valueIfTrue : valueIfFalse;

---

### 2. Why is it called a ternary operator?

It is called ternary because it operates on three operands:

1. Condition
2. Value when the condition is true
3. Value when the condition is false

---

### 3. What is the syntax of the ternary operator?

condition ? valueIfTrue : valueIfFalse;

Example:

int largest = a > b ? a : b;

---

### 4. How is the ternary operator different from if-else?

The ternary operator is generally used for simple conditional expressions and returns a value.

if-else is better suited for complex logic or multiple statements.

Example:

Ternary:

int largest = a > b ? a : b;

if-else:

if (a > b) {
largest = a;
} else {
largest = b;
}

---

### 5. Can the ternary operator return a value?

Yes.

The ternary operator is an expression and produces a result.

Example:

int result = a > b ? a : b;

---

### 6. Can we use nested ternary operators?

Yes, Java allows nested ternary operators.

Example:

String result = value > 0
        ? "Positive"
        : value < 0
        ? "Negative"
        : "Zero";

However, excessive nesting can make the code difficult to read.

---

### 7. Can we use the ternary operator with different data types?

The two possible results should be compatible with the variable receiving the result.

Example:

String result = age >= 18 ? "Eligible" : "Not Eligible";

---

### 8. What is the advantage of the ternary operator?

It makes simple conditional assignments shorter and more concise.

Example:

int max = a > b ? a : b;

---

### 9. What is the disadvantage of the ternary operator?

Using complicated or deeply nested ternary expressions can reduce readability.

For complex logic, if-else is usually easier to understand.

---

### 10. Is the ternary operator faster than if-else?

Do not assume that ternary is faster.

The main advantage is concise syntax and readability for simple expressions.

Performance should not normally be the reason for choosing ternary over if-else.

---

## 🧠 Interview Example

Question:

How would you find whether a number is even or odd using the ternary operator?

Answer:

int number = 7;

String result = number % 2 == 0 ? "Even" : "Odd";

---

## 🔥 Interview Statement

"The ternary operator is a concise conditional expression in Java. It evaluates a condition and returns one of two values. I use it mainly for simple conditional assignments, while I prefer if-else for complex logic."

---

## 🎯 Key Interview Rule

Simple condition
→ Ternary

Complex logic
→ if-else

Multiple nested conditions
→ Prefer readable if-else

---

## ✅ Java #012 Interview Ready
---

# 🎤 Java #013 - Switch Statement Interview Questions

## 📌 Basic Interview Questions

### 1. What is a switch statement in Java?

A `switch` statement is a decision-making statement used to execute one block of code from multiple possible choices based on the value of an expression.

---

### 2. Why do we use a switch statement?

We use `switch` when we need to compare one expression against multiple fixed values.

It can make multi-option decision logic more readable than multiple `if-else-if` statements.

---

### 3. What are the main components of a switch statement?

The main components are:

* `switch`
* `case`
* `break`
* `default`

Example:

```java
switch (value) {

    case 1:
        // code
        break;

    case 2:
        // code
        break;

    default:
        // code
}
```

---

### 4. What is the purpose of the `case` keyword?

The `case` keyword defines a possible value that can be matched against the switch expression.

Example:

```java
int day = 2;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;
}
```

Here, `case 2` matches the value of `day`.

---

### 5. What is the purpose of the `break` statement in switch?

The `break` statement terminates the switch after the matching case is executed.

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
}
```

Output:

```text
Two
```

The `break` prevents execution from continuing into the following cases.

---

### 6. What happens if we omit `break`?

If `break` is omitted in a traditional switch statement, execution continues into the following cases.

This behavior is called **fall-through**.

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
}
```

Output:

```text
Two
Three
```

---

### 7. What is fall-through in switch?

Fall-through occurs when a matching case continues executing the statements of subsequent cases because there is no `break`.

```text
Matching case
     ↓
Execute code
     ↓
Next case
     ↓
Next case
     ↓
break
```

---

### 8. What is the purpose of the `default` case?

The `default` case executes when none of the cases match the switch expression.

Example:

```java
int day = 8;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

Output:

```text
Invalid Day
```

---

## 🔹 Intermediate Interview Questions

### 9. Can multiple cases execute the same block of code?

Yes.

Multiple cases can share the same block of code.

Example:

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

### 10. What is the difference between switch and if-else?

| switch                                   | if-else                         |
| ---------------------------------------- | ------------------------------- |
| Useful for multiple fixed values         | Useful for complex conditions   |
| Good for fixed choices                   | Good for ranges and expressions |
| Can improve readability for many choices | More flexible for conditions    |
| Uses `case` values                       | Uses boolean conditions         |

Example:

```java
switch (choice) {
    case 1:
        // code
        break;
}
```

```java
if (choice == 1) {
    // code
}
```

---

### 11. What is a switch expression?

A switch expression is a form of switch that produces a value.

Example:

```java
int day = 2;

String result = switch (day) {

    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid";
};

System.out.println(result);
```

Output:

```text
Tuesday
```

---

### 12. What is the difference between a switch statement and a switch expression?

A switch statement is mainly used to perform an action.

A switch expression produces a value.

### Switch Statement

```java
switch (day) {

    case 1:
        System.out.println("Monday");
        break;
}
```

### Switch Expression

```java
String result = switch (day) {

    case 1 -> "Monday";
    default -> "Invalid";
};
```

---

### 13. What is the arrow (`->`) syntax in switch?

The arrow syntax provides a modern way to write switch cases.

Example:

```java
int day = 2;

switch (day) {

    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Invalid");
}
```

It is more concise than the traditional `case`, statement, and `break` syntax.

---

### 14. Is `break` required with arrow-style switch cases?

No.

With arrow-style switch cases, `break` is not required.

```java
case 1 -> System.out.println("Monday");
```

The arrow-style case does not fall through into the next case.

---

### 15. Can a switch expression return a value?

Yes.

Example:

```java
int number = 2;

String result = switch (number) {

    case 1 -> "One";
    case 2 -> "Two";
    default -> "Unknown";
};
```

Here, the switch expression returns `"Two"`.

---

## 🧠 Output-Based Interview Questions

### 16. What is the output?

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

### Explanation

`x` is `2`, so execution starts at `case 2`.

`B` is printed.

There is no `break` after `case 2`, so execution falls through to `case 3`.

`C` is printed.

Then `break` terminates the switch.

---

### 17. What is the output?

```java
int day = 7;

switch (day) {

    case 6:
    case 7:
        System.out.println("Weekend");
        break;

    default:
        System.out.println("Weekday");
}
```

### Answer

```text
Weekend
```

### Explanation

Both `case 6` and `case 7` share the same block.

Since `day` is `7`, the `"Weekend"` block executes.

---

### 18. What is the output?

```java
int number = 5;

switch (number) {

    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    default:
        System.out.println("Other");
}
```

### Answer

```text
Other
```

### Explanation

There is no matching case for `5`, so the `default` block executes.

---

## 🔥 Interview Quick Revision

```text
switch
   ↓
Multi-way decision making

case
   ↓
Possible matching value

break
   ↓
Terminates traditional switch

default
   ↓
Executes when no case matches

No break
   ↓
Fall-through

case value ->
   ↓
Modern switch syntax

switch expression
   ↓
Produces a value
```

---

## 🎯 Key Interview Takeaway

The `switch` statement is useful for selecting one of multiple fixed choices.

Remember these five points:

1. `case` defines possible values.
2. `break` prevents fall-through in traditional switch.
3. Missing `break` can cause fall-through.
4. `default` handles unmatched values.
5. Modern switch expressions can return values.

---

## 🏆 Java #013 Status

```text
Topic  → Switch Statement
Class  → SwitchStatement
Status → ✅ Completed
```
