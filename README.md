Console-Based Banking System
A modular console-based banking system built with Java that simulates core banking operations like
account creation, deposit, withdrawal, and balance checking. This project leverages object-oriented
programming principles and JDBC for seamless integration with a MySQL database.

Features
- Account creation with unique ID
- Deposit and withdrawal operations
- Balance inquiry
- Command-line interface for smooth user interaction
- MySQL integration using JDBC
- Modular and maintainable OOP-based architecture

Technologies Used
- Java Core programming language
- JDBC (Java Database Connectivity) For connecting Java with MySQL
- MySQL Database to persist account and transaction data
- OOP (Object-Oriented Programming) For clean modular structure

Prerequisites
- Java JDK 8 or above
- MySQL Server
- Any IDE (e.g., IntelliJ IDEA, Eclipse)
- JDBC driver for MySQL

Steps to Run
1. Clone the Repository
 git clone https://github.com/your-username/BankingSystem.git
2. Set up the MySQL Database
 - Create the database and table using the schema.sql script provided.
3. Update JDBC Config in DBConnection.java
 String url = "jdbc:mysql://localhost:3306/banking_db";
 String username = "root"; // your MySQL username
 String password = "your_password";
4. Compile and Run
 - Use your IDE or terminal to compile and run Main.java


OOP Design Overview – org.connection Package
The org.connection package is responsible for managing the database connection layer of your banking system. It follows key object-oriented principles such as abstraction, encapsulation, modularity, and interface-driven development.

OOP Design Overview – org.customer.Customer Class
The Customer class is a core part of your banking system that models a bank customer. It encapsulates the customer's identity and validation logic, demonstrating strong object-oriented programming principles.

Package: org.exception
Custom exceptions that make the system domain-aware and more descriptive when handling errors.
 PhoneNumberLenthMisMatchException extends Exception
•	Purpose: Thrown when the phone number is not exactly 10 digits.
•	OOP Benefit: Clear, domain-specific error separation instead of using generic Exception.
 EmailFormatException extends Exception
•	Purpose: Thrown when the email format does not match a valid pattern.
•	OOP Benefit: Better debugging and validation tracking.
 AadharLengthException extends Exception
(Assumed from your earlier Customer code; not shown again here)
•	Purpose: Thrown when the Aadhar number is not 12 digits.


Package org.services
Each class in this package encapsulates a specific banking operation, following the Single Responsibility Principle.
Class	Responsibility	Sample Method
OpenAccount	Handles new account creation	openAccount()
Withdraw	Manages withdrawal logic	getWithdraw()
Deposit	Manages deposits	getDeposit()
CheckBalance	Displays current balance	checkBalance()
•	These services likely interact with the database using connection logic from the org.connection package.
•	Separation of Concerns is observed: UI input → service logic → DB layer.

Sample output:
1.When you first time run the code<br>
 <img width="353" height="173" alt="image" src="https://github.com/user-attachments/assets/9f322f17-7854-44f6-bbd3-f226b5f35f82" /><br>

 
2. If you select open account option you have enter name, phone number, email, aadhar number and you will get return with a unique account number and other details like below<br>
 <img width="716" height="500" alt="image" src="https://github.com/user-attachments/assets/90f9c222-569b-4771-9d3a-0b28e654b750" /><br>

3.If you select yes then operations will be reshowed like what you see above like<br>
 <img width="353" height="173" alt="image" src="https://github.com/user-attachments/assets/4c21fe34-31eb-4f65-8fbe-8dc463816741" /><br>

4.If you enter no you will see like<br>
 <img width="547" height="126" alt="image" src="https://github.com/user-attachments/assets/126678e2-dc6c-46cb-9fe9-a063b0a5091a" /><br>

5.want to withdraw?<br>
<img width="806" height="347" alt="image" src="https://github.com/user-attachments/assets/108f97f6-0bb2-4631-bb1a-9885b85853c3" /><br>


6.want to diposit?<br>
 <img width="795" height="442" alt="image" src="https://github.com/user-attachments/assets/e7e0e845-60dc-46a5-83fd-b2e8de576012" /><br>


7.want to check Balance?<br>
 <img width="660" height="417" alt="image" src="https://github.com/user-attachments/assets/9567b085-d121-46b5-898c-4c28cf2ad313" /><br>


8.Exit<br>
 <img width="567" height="314" alt="image" src="https://github.com/user-attachments/assets/4af73531-5a33-407f-a58a-0995da2f8018" /><br>

