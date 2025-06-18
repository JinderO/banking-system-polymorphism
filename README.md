# 🏦 Java Banking System with Polymorphism

Professional banking system simulation demonstrating advanced object-oriented programming concepts including inheritance hierarchies, polymorphism, and interface design.

## 🚀 Features

- Multiple Account Types - Savings, Checking, and Business accounts
- Transaction Management - Deposits, withdrawals with validation
- Polymorphic Operations - Single interface for different account behaviors
- Interest Calculations - Unique rates per account type
- Fee Management - Account-specific monthly fees
- Account Search - Find accounts by number or owner
- Portfolio Overview - List all accounts with balances

## Demo Output
```
===Seznam všech účtů===
Jan Novák (SAV001): Savings Account - 10200.0 Kč
Helena Nová (CHK001): Checking Account - 4975.0 Kč
Josef Krejčí (BUS001): Business Account - 50300.0 Kč

Aplikace úroků...
Aplikace poplatků...

===Po aplikaci úroků a poplatků===
Jan Novák (SAV001): Savings Account - 10404.0 Kč (2% interest)
Helena Nová (CHK001): Checking Account - 4950.0 Kč (0.5% interest, 50 Kč fee)
Josef Krejčí (BUS001): Business Account - 50803.0 Kč (1% interest, 200 Kč fee)
```

## 🛠️ Technologies Used

- **Java 17+** - Core programming language
- **Advanced OOP** - Inheritance, Polymorphism, Abstract classes
- **Interface Design** - Chargeable interface for flexible fee management
- **Collections Framework** - ArrayList with polymorphic object management
- **Financial Logic** - Real-world banking calculations and validations

## System Architecture

```
📁 Banking System
├── 📄 Account.java (Abstract base class)
├── 📄 SavingsAccount.java (2% interest, no fees)
├── 📄 CheckingAccount.java (0.5% interest, monthly fees)
├── 📄 BusinessAccount.java (1% interest, higher fees)
├── 📄 Chargeable.java (Interface for fee calculations)
├── 📄 Bank.java (Account management and operations)
└── 📄 Main.java (Application demonstration)
```

## 🎯 Key OOP Concepts Demonstrated

### Inheritance Hierarchy
```java
Account (Abstract)
├── SavingsAccount (High interest, no fees)
├── CheckingAccount (Low interest, basic fees) implements Chargeable
└── BusinessAccount (Medium interest, premium fees) implements Chargeable
```

### Polymorphism in Action
```java
ArrayList<Account> accounts = new ArrayList<>();
// Stores different account types uniformly
// Each type behaves differently for interest and fees
for (Account account : accounts) {
    account.calculateInterest(); // Polymorphic method call
}
```

### Interface Segregation
```java
public interface Chargeable {
    double calculateFees();
    void applyMonthlyFee();
}
// Only implemented by accounts that have fees
```

## How to Run

**Clone the repository**
```bash
git clone https://github.com/JinderO/banking-system-polymorphism.git
cd banking-system-polymorphism
```

**Compile the project**
```bash
javac -d bin src/dev/jov/*.java
```

**Run the application**
```bash
java -cp bin dev.jov.Main
```

## Banking Business Logic

### Account Types & Behaviors

- **Savings Account**: 2% annual interest, no monthly fees
- **Checking Account**: 0.5% annual interest, 50 Kč monthly fee
- **Business Account**: 1% annual interest, 200 Kč monthly fee

### Transaction Validation

- Withdrawal amount validation against balance
- Negative amount protection
- Account existence verification

### Fee System

- Interface-based design allows easy addition of new fee types
- Automatic monthly fee deduction for applicable accounts
- Transparent fee calculation and reporting

## What I Learned

- **Financial Domain Modeling** - Translating banking rules into code
- **Abstract Class Design** - When to use abstract vs concrete classes
- **Interface Implementation** - Selective behavior addition
- **Polymorphic Collections** - Managing diverse objects uniformly
- **Business Logic Separation** - Clean architecture principles
- **Validation Patterns** - Robust input and state checking

## Code Highlights

**Polymorphic Interest Calculation:**
```java
public void applyInterestToAll() {
    for (Account account : accounts) {
        account.balance += account.calculateInterest();
        // Each account type calculates differently
    }
}
```

**Interface-based Fee Management:**
```java
public void applyFeesToChargeable() {
    for (Account account : accounts) {
        if (account instanceof Chargeable) {
            ((Chargeable) account).applyMonthlyFee();
        }
    }
}
```

**Safe Transaction Processing:**
```java
public boolean withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
        balance -= amount;
        return true;
    }
    return false; // Insufficient funds or invalid amount
}
```

## Future Enhancements

- Spring Boot Migration - REST API development
- Database Integration - Account persistence with JPA
- Transaction History - Detailed audit trail
- Multi-user Support - Customer management system
- Security Layer - Authentication and authorization
- Web Interface - Modern banking portal

## Technical Achievements

- **Zero-bug Transaction Logic** - Robust validation prevents data corruption
- **Extensible Architecture** - Easy to add new account types or fees
- **Memory Efficient** - Optimal object management and polymorphism
- **Clean Code Principles** - Single responsibility and clear naming

## 👨‍💻 Author

**Jindřich Ovádek** - *Java Developer in Training* - [@JinderO](https://github.com/JinderO)

### Technical Achievements

- **Advanced OOP Understanding** - Demonstrates sophisticated inheritance patterns and polymorphic behavior
- **Clean Business Logic** - Professional implementation of financial domain rules and validations  
- **Enterprise Design Patterns** - Template method, factory, and interface segregation principles
- **Professional Code Organization** - Comprehensive structure and technical documentation
- **Scalable Foundation** - Robust groundwork for enterprise banking application development

This project showcases **enterprise-level object-oriented design patterns** commonly used in financial software development, with a focus on **extensibility**, **maintainability**, and **robust business logic implementation**. The implementation demonstrates **strong foundational knowledge** for **Java developer** positions in **enterprise environments**.
