# Low Level Design (LLD) — Creational Design Patterns

This project contains Java implementations and notes for **Creational Design Patterns**.

---

## What are Design Patterns?
Design patterns are proven solutions to common problems that developers face while writing code. They are not actual code, but more like templates or best practices that you can follow to solve a problem in a clean and reusable way.

Design patterns are divided into three main categories:
- **Creational** — How to create objects
- **Structural** — How to organize classes and objects
- **Behavioral** — How objects talk to each other

This project focuses on **Creational Design Patterns**.

---

## What are Creational Design Patterns?
Creational patterns deal with **how objects are created**. In a normal program, you create objects using the `new` keyword. But as the project grows, this simple approach causes problems like:

- **Tight coupling**: Your code is directly linked to specific classes, making it hard to change later.
- **Repeated code**: The same object creation logic is written in many places.
- **Hard to manage complexity**: When objects need many parameters, or when the creation process is heavy and slow, managing it manually becomes messy.

Creational patterns give you smarter ways to create objects so that your code stays clean, flexible, and easy to maintain.

---

## Patterns Covered in This Project

| # | Pattern | Package | What It Does |
|---|---------|---------|--------------|
| 1 | **Factory Method** | `com.shubham.factory` | Creates objects without telling the client which exact class is being used. The client just asks the factory, and the factory decides what to return. |
| 2 | **Abstract Factory** | `com.shubham.abstractfactory` | Creates families of related objects together. Makes sure you do not accidentally mix objects from different families. |
| 3 | **Builder** | `com.shubham.builder` | Builds complex objects step by step. Useful when an object has many fields, some required and some optional. |
| 4 | **Prototype** | `com.shubham.prototype` | Creates new objects by copying (cloning) an existing object instead of creating one from scratch. Useful when object creation is slow or expensive. |
| 5 | **Singleton** | `com.shubham.singleton` | Makes sure only one instance of a class exists in the entire application. Everyone shares the same object. |

---

## When to Use Which Pattern?

| Problem You Are Facing | Pattern to Use |
|------------------------|----------------|
| You want to hide which exact class is being created from the client code | **Factory Method** |
| You need to create a group of related objects that must go together | **Abstract Factory** |
| Your object has too many constructor parameters and some are optional | **Builder** |
| Creating a new object is slow or expensive and you already have a similar object ready | **Prototype** |
| You need exactly one shared instance of a class across the whole application | **Singleton** |

---

## Project Structure

```
src/main/java/com/shubham/
├── factory/                  # Factory Method Pattern
│   ├── Employee.java         # Product interface
│   ├── AndroidDeveloper.java # Concrete product
│   ├── WebDeveloper.java     # Concrete product
│   ├── EmployeeFactory.java  # Factory class
│   ├── DeveloperClient.java  # Client / Demo
│   └── notes.md              # Pattern notes
│
├── abstractfactory/          # Abstract Factory Pattern
│   ├── Employee.java         # Abstract product
│   ├── AndroidDeveloper.java # Concrete product
│   ├── WebDeveloper.java     # Concrete product
│   ├── EmployeeAbstractFactory.java  # Abstract factory
│   ├── AndroidDevFactory.java        # Concrete factory
│   ├── WebDevFactory.java            # Concrete factory
│   ├── EmployeeFactory.java          # Factory helper
│   ├── Client.java           # Client / Demo
│   └── notes.md              # Pattern notes
│
├── builder/                  # Builder Pattern
│   ├── User.java             # Product with nested Builder
│   ├── Main.java             # Client / Demo
│   └── notes.md              # Pattern notes
│
├── prototype/                # Prototype Pattern
│   ├── NetworkConnection.java # Cloneable prototype
│   ├── Main.java             # Client / Demo
│   └── notes.md              # Pattern notes
│
├── singleton/                # Singleton Pattern
│   ├── SingletonDemo.java    # Singleton class + Demo
│   └── notes.md              # Pattern notes
│
└── Main.java                 # Project entry point
```

---

## How to Run

### Build the project
```bash
mvn clean compile
```

### Run a specific pattern demo
```bash
java -cp target/classes com.shubham.factory.DeveloperClient
java -cp target/classes com.shubham.abstractfactory.Client
java -cp target/classes com.shubham.builder.Main
java -cp target/classes com.shubham.prototype.Main
java -cp target/classes com.shubham.singleton.SingletonDemo
```

---

## Quick Summary

> Creational patterns are all about **controlling how objects are created**. Instead of scattering `new ClassName()` calls all over your code, these patterns give you a clean, organized, and flexible way to create objects — making your code easier to read, test, and change in the future.
