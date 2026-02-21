# Retirement Saving Service – BlackRock Code Challenge
## Overview

This project implements a Retirement Saving Service API developed as part of the BlackRock coding challenge.
The application processes financial transactions, applies period-based rules, calculates savings and returns, and exposes REST APIs for transaction processing and performance reporting.

The application is built using Spring Boot, containerized using Docker, and designed to run consistently across environments.

# Technology Stack

Java 17

Spring Boot

Maven

REST APIs

Docker

JSON Processing

# Project Features
## 1. Transaction Processing

Parses transaction input data

Validates transactions

Calculates total transaction amounts

Applies business rules

## 2. Period Logic Implementation
## Q Period Logic

Applies fixed saving rules within defined date ranges.

## P Period Logic

Adds extra savings amount for eligible periods.

## K Period Aggregation

Aggregates savings and calculates final values across defined intervals.

## 3. Returns Calculation

Computes profit based on calculated savings.

Applies inflation and financial adjustments where applicable.

## 4. Performance API

Provides runtime metrics including:

Response time

Memory usage

Number of active threads

Endpoint:

GET /blackrock/challenge/v1/performance

## API Endpoints
## Parse Transactions
POST /blackrock/challenge/v1/transactions:parse

Processes incoming transaction data.

## Validate Transactions
POST /blackrock/challenge/v1/transactions:validator

Validates transaction entries.

## Performance Metrics
GET /blackrock/challenge/v1/performance

Returns application performance information.


## Running the Application Locally
### Prerequisites

Java 17

Maven

Docker

## Step 1 – Build Application
mvn clean package
## Step 2 – Run Spring Boot Application
mvn spring-boot:run

Application runs at:

http://localhost:5477

## Running Using Docker
### Build Docker Image
docker build -t <docker-username>/blk-hacking-ind-agam .

Example:

docker build -t agam04/blk-hacking-ind-agam .
## Run Container
docker run -p 5477:5477 <docker-username>/blk-hacking-ind-agam

## Verify Application

Open browser:

http://localhost:5477

## Docker Image

Public Docker image:

https://hub.docker.com/r/agam04/blk-hacking-ind-agam

## Project Structure
src
 └── main
     ├── controller
     ├── service
     ├── model
     ├── util
     └── resources
Dockerfile
pom.xml
README.md

## Assumptions

Transactions are processed in chronological order.

Invalid transactions are ignored during aggregation.

Performance metrics are runtime approximations.

## Author

Agam Srivastav