# Solid Principles
Code examples of Solid Principles in Java

## Why solid principles -
These principles encourage us to create more maintainable, understandable, and flexible software. Consequently, as our applications grow in size, we can reduce their complexity.

### Single Responsibility Principle
A class should only have one responsibility and only one reason to change.
Advantages - testing, low coupling, better organization of code.

### Open closed principle
Software components should be open for extension but closed for modification.
In doing so, we stop ourselves from modifying existing code and causing potential new bugs.

### Liskov substitution principle
if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program.

### Interface segregation principle
Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

### Dependency inversion principle
High level modules should not refer to low level modules directly. They should depend on abstractions.
Abstractions should never depend upon details. Details should depend upon abstractions.