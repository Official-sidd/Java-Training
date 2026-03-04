# 📦 Day 7 – Concurrency & File I/O

## 📖 Overview

This module demonstrates **Java Concurrency and File I/O concepts** through practical examples.

The goal of this exercise is to understand how Java handles:
- Multithreading
- Concurrent task execution
- File reading and writing
- Object serialization and deserialization

Two practice tasks were implemented:

1. **Multithreaded File Search**
2. **Object Serialization and Deserialization**

---

# 🧠 Concepts Covered

## 🔹 Multithreading
Multithreading allows multiple tasks to run concurrently within a program.

Java supports multithreading using:
- `Thread`
- `Runnable`
- `ExecutorService`

In this module, `Runnable` and `ExecutorService` were used to run file search tasks concurrently.

---

## 🔹 ExecutorService
`ExecutorService` manages a pool of worker threads instead of creating threads manually.

Example:

```java
ExecutorService executor = Executors.newFixedThreadPool(3);