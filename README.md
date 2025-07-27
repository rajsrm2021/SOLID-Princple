# SOLID Principles in Java 🚀

This repository demonstrates the five SOLID principles of object-oriented design using real-world examples in Java.

Each principle is implemented in its own modular package with clean and maintainable code.

---

## 🔰 What are SOLID Principles?

SOLID is an acronym for five design principles intended to make software designs more understandable, flexible, and maintainable:

| Principle | Full Form |
|----------|-----------|
| **S**     | Single Responsibility Principle (SOLID_Princples.SRP) |
| **O**     | Open/Closed Principle (SOLID_Princples.OCP) |
| **L**     | Liskov Substitution Principle (SOLID_Princples.LSP) |
| **I**     | Interface Segregation Principle (SOLID_Princples.ISP) |
| **D**     | Dependency Inversion Principle (SOLID_Princples.DIP) |

---

## 📁 Project Structure


---

## 📘 Principle Summaries & Examples

### ✅ 1. SOLID_Princples.SRP — Single Responsibility Principle
> A class should have only one reason to change.

🧾 **Example**: `InvoicePrinter`, `InvoiceCalculator`, and `Invoice` are separated based on their responsibilities.

📂 [Code → srp/](./src/main/java/com/yourname/srp)

---

### ✅ 2. SOLID_Princples.OCP — Open/Closed Principle
> Software entities should be open for extension but closed for modification.

🧾 **Example**: Payment processing system using interfaces for payment methods like `CreditCardPayment`, `UPIPayment`, etc.

📂 [Code → ocp/](./src/main/java/com/yourname/ocp)

---

### ✅ 3. SOLID_Princples.LSP — Liskov Substitution Principle
> Subtypes must be substitutable for their base types without altering the correctness.

🧾 **Example 1**: `Bird` interface, separating `FlyingBird` from non-flying like `Penguin`.

🧾 **Example 2**: `Vehicle` and `EnginePowered` interfaces separate bicycles from cars.

📂 [Code → lsp/](./src/main/java/com/yourname/lsp)

---

### ✅ 4. SOLID_Princples.ISP — Interface Segregation Principle
> Clients should not be forced to depend on interfaces they do not use.

🧾 **Example**: Different interfaces for printer capabilities like `Scanner`, `Printer`, `Fax`.

📂 [Code → isp/](./src/main/java/com/yourname/isp)

---

### ✅ 5. SOLID_Princples.DIP — Dependency Inversion Principle
> High-level modules should not depend on low-level modules. Both should depend on abstractions.

🧾 **Example**: `NotificationService` depends on `MessageSender` interface, not concrete classes like `EmailSender` or `SMSSender`.

📂 [Code → dip/](./src/main/java/com/yourname/dip)

---

## ✅ How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/rajsrm2021/SOLID-Princple
   cd SOLID-Princple

   
