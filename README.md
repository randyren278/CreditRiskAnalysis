# Credit Risk Analysis System

The Credit Risk Analysis System is a Java-based application designed to analyze the credit risk of customers. This system leverages a MySQL database to store customer data, credit histories, and analysis results. It provides a graphical user interface (GUI) for ease of use and integrates with machine learning algorithms for predictive modeling.

## Features

- **Customer Management:** Add and manage customer information, including personal details and financial status.
- **Credit History Tracking:** Record and track credit history data, such as credit scores, total debt, and missed payments.
- **Risk Level Assessment:** Analyze customer data to assess their credit risk level.
- **Data Visualization:** Visualize customer data and credit risk analysis results.
- **Predictive Analytics:** Integrate with machine learning models to predict future credit risk.

### Example Usage

1. **Start the Application:**

   - After running the project, the GUI will launch.
   - Use the GUI to enter customer details and credit history.

2. **Add Customer Example:**

   - Enter the following details for a new customer:
     ```
     Name: John Doe
     Age: 35
     Address: 123 Main St
     Employment Status: Employed
     Annual Income: 75000.00
     ```
   - Click the "Add Customer" button.

3. **Add Credit History Example:**

   - Select John Doe from the list of customers.
   - Enter the following credit history details:
     ```
     Credit Score: 680
     Total Debt: 15000.00
     Missed Payments: 1
     ```
   - Click the "Add Credit History" button.

4. **Analyze Customer Risk:**

   - Enter the Customer ID of John Doe (e.g., 1) in the provided field.
   - Click the "Analyze Risk" button.
   - The system will assess the credit risk and display the result.

### Example Result

After analyzing the credit risk for John Doe, the system might display the following result:

```
Customer ID: 1
Name: John Doe
Risk Level: Medium
Recommendation: Monitor the customer's payment patterns closely. Consider offering a lower credit limit until the customer's credit score improves and the total debt decreases.
Analysis Date: 2024-07-24 10:00:00
```

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK) 11 or higher**
- **Gradle**
- **MySQL**

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/yourusername/CreditRiskAnalysis.git
   cd CreditRiskAnalysis
   ```

2. **Set Up the MySQL Database:**

   - Open a terminal and log into MySQL:
     ```sh
     mysql -u root -p
     ```
   - Create the database:
     ```sql
     CREATE DATABASE credit_risk_db;
     USE credit_risk_db;
     ```
   - Create the required tables:
     ```sql
     CREATE TABLE Customer (
         id INT PRIMARY KEY AUTO_INCREMENT,
         name VARCHAR(100),
         age INT,
         address VARCHAR(255),
         employment_status VARCHAR(50),
         annual_income DECIMAL(10, 2)
     );

     CREATE TABLE CreditHistory (
         id INT PRIMARY KEY AUTO_INCREMENT,
         customer_id INT,
         credit_score INT,
         total_debt DECIMAL(10, 2),
         missed_payments INT,
         FOREIGN KEY (customer_id) REFERENCES Customer(id)
     );

     CREATE TABLE AnalysisResults (
         id INT PRIMARY KEY AUTO_INCREMENT,
         customer_id INT,
         risk_level VARCHAR(50),
         recommendation TEXT,
         analysis_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
         FOREIGN KEY (customer_id) REFERENCES Customer(id)
     );
     ```

3. **Update the `application.properties` File:**

   - Open the `src/main/resources/application.properties` file in your code editor.
   - Update the file with your MySQL connection details:
     ```properties
     db.url=jdbc:mysql://localhost:3306/credit_risk_db
     db.user=root
     db.password=your_password
     ```

4. **Build and Run the Project:**

   - Open a terminal in the project directory.
   - Build the project using Gradle:
     ```sh
     ./gradlew build
     ```
   - Run the project:
     ```sh
     ./gradlew run
     ```


