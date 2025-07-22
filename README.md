<h2>Console-Based Banking System</h2><br>
A modular console-based banking system built with Java that simulates core banking operations like
account creation, deposit, withdrawal, and balance checking. This project leverages object-oriented
programming principles and JDBC for seamless integration with a MySQL database.

<h4>Features</h4>
- Account creation with unique ID
- Deposit and withdrawal operations
- Balance inquiry<br>
- Command-line interface for smooth user interaction
- MySQL integration using JDBC
- Modular and maintainable OOP-based architecture

<h4>Technologies Used</h4>
- Java Core programming language<br>
- JDBC (Java Database Connectivity) For connecting Java with MySQL<br>
- MySQL Database to persist account and transaction data<br>
- OOP (Object-Oriented Programming) For clean modular structure<br>

<h4>Prerequisites</h4>
- Java JDK 8 or above
- MySQL Server
- Any IDE (e.g., IntelliJ IDEA, Eclipse)
- JDBC driver for MySQL

<h4>Steps to Run</h4>
1. Clone the Repository<br>
     - git clone https://github.com/your-username/BankingSystem.git<br>
2. Set up the MySQL Database<br>
      - Create the database and table using the schema.sql script provided.<br>
3. Update JDBC Config in DBConnection.java<br>
        String url = "jdbc:mysql://localhost:3306/banking_db";<br>
        String username = "root"; // your MySQL username<br>
        String password = "your_password";<br>
4. Compile and Run<br>
        - Use your IDE or terminal to compile and run Main.java<br>


<h4>OOP Design Overview – org.connection Package</h4>
The org.connection package is responsible for managing the database connection layer of your banking system. It follows key object-oriented principles such as abstraction, encapsulation, modularity, and interface-driven development.

<h4>OOP Design Overview – org.customer.Customer Class</h4>
The Customer class is a core part of your banking system that models a bank customer. It encapsulates the customer's identity and validation logic, demonstrating strong object-oriented programming principles.

<h4>Package: org.exception</h4>
Custom exceptions that make the system domain-aware and more descriptive when handling errors.
    <h5>PhoneNumberLenthMisMatchException extends Exception</h5><br>
          •	Purpose: Thrown when the phone number is not exactly 10 digits.<br>
          •	OOP Benefit: Clear, domain-specific error separation instead of using generic Exception.<br>
     <h5>EmailFormatException extends Exception</h5><br>
          •	Purpose: Thrown when the email format does not match a valid pattern.<br>
          •	OOP Benefit: Better debugging and validation tracking.<br>
      <h5>AadharLengthException extends Exception</h5><br>
           (Assumed from your earlier Customer code; not shown again here)<br>
          •	Purpose: Thrown when the Aadhar number is not 12 digits.<br>


<h4>Package org.services</h4>
Each class in this package encapsulates a specific banking operation, following the Single Responsibility Principle.<br>
OpenAccount	Handles ---> new account creation	openAccount()<br>
Withdraw	Manages ---> withdrawal logic	getWithdraw()<br>
Deposit	Manages---> deposits	getDeposit()<br>
CheckBalance	Displays ---> current balance	checkBalance()<br>
•	These services likely interact with the database using connection logic from the org.connection package.<br>
•	Separation of Concerns is observed: UI input → service logic → DB layer.<br>

<h4>Sample output:</h4>
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

