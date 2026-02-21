Retirement Saving API — BlackRock Challenge

Overview

This project implements a REST API that transforms, validates, and calculates financial returns from a list of expenses.
The system simulates an auto-saving platform that optimizes investment decisions.

Built using:

Java 17

Spring Boot

Maven

Docker


How to Run the Application
1. Clone Repository
git clone https://github.com/<your-username>/retirement-saving.git
cd retirement-saving
2. Build Project
mvn clean install
3. Run Application
mvn spring-boot:run

Application runs on:

http://localhost:8080


API Endpoints
Parse Transactions

POST /blackrock/challenge/v1/transactions/parse

Example Body:

[
  {
    "date": "2023-10-12 20:15:30",
    "amount": 250
  }
]


Validate Transactions

POST /blackrock/challenge/v1/transactions/validator

Returns Calculation

POST /blackrock/challenge/v1/returns/nps

POST /blackrock/challenge/v1/returns/index

Performance Report

GET /blackrock/challenge/v1/performance


Docker

Build Image:

docker build -t blk-hacking-ind-<yourname> .

Run Container:

docker run -p 5477:5477 blk-hacking-ind-<yourname>
Project Structure
controller/
service/
model/
util/

Author

Agam Srivastav


