# 📦 Day 6 – Java 8 Features (Streams & Functional Programming)

## 📖 Overview

This module demonstrates modern Java programming using **Java 8 features**.  
The goal of this exercise is to rewrite the **Student Marks Management system from Day 5** using **Streams, Lambdas, and Functional Interfaces** instead of traditional loops.

The implementation showcases how functional programming concepts simplify collection processing and make code more readable.

---

## 🧠 Concepts Covered

### 🔹 Lambda Expressions
Lambda expressions provide a concise way to implement functional interfaces.

Example:
```java
(s1, s2) -> s1.getMarks() - s2.getMarks()