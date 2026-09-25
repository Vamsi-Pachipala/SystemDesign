# 🚀 System Design Practice

A collection of **High-Level Design (HLD)** and **Low-Level Design (LLD)** problems for SDE-2 interview preparation.

The goal is not just to solve problems, but to develop a **repeatable system-design thinking process** that can be applied to unfamiliar interview questions.

---

## 🎯 Goal

Build strong intuition for:

- Requirement gathering
- Functional & non-functional requirements
- Capacity estimation
- API design
- Database selection
- Caching
- Scalability
- Concurrency
- Distributed systems
- Fault tolerance
- Message queues
- Data modeling
- Class responsibilities
- SOLID principles
- Design patterns
- Extensibility
- Trade-offs

---

# 🏗️ HLD — High-Level Design

## 📚 Practice Problems

| # | Problem | Status | Key Concepts |
|---|---|---|---|
| 1 | URL Shortener | ⬜ | Hashing, DB, Cache, Scale |
| 2 | Rate Limiter | ⬜ | Token Bucket, Sliding Window, Redis |
| 3 | Notification System | ⬜ | Kafka, Queue, Retry, Fan-out |
| 4 | Distributed File Storage | ⬜ | Object Storage, Metadata, Sharding |
| 5 | WhatsApp / Chat System | ⬜ | WebSocket, Kafka, Presence, Delivery |
| 6 | YouTube / Video Streaming | ⬜ | CDN, Object Storage, Transcoding |
| 7 | Uber / Ride Booking | ⬜ | Geo-indexing, Matching, Location |
| 8 | Ticket Booking System | ⬜ | Concurrency, Locking, Inventory |
| 9 | News Feed | ⬜ | Fan-out, Ranking, Caching |
| 10 | Search Autocomplete | ⬜ | Trie, Cache, Ranking |
| 11 | Instagram | ⬜ | Feed, Media Storage, CDN |
| 12 | Payment System | ⬜ | Idempotency, Transactions, Consistency |
| 13 | Food Delivery System | ⬜ | Matching, Location, Orders |
| 14 | Distributed Scheduler | ⬜ | Distributed Locks, Workers |
| 15 | Logging System | ⬜ | Kafka, Storage, Search |
| 16 | Metrics Monitoring System | ⬜ | Time-Series DB, Aggregation |
| 17 | E-commerce System | ⬜ | Inventory, Orders, Payments |
| 18 | Google Drive | ⬜ | File Storage, Sync, Metadata |
| 19 | Web Crawler | ⬜ | Queue, Deduplication, Distributed Workers |
| 20 | Distributed Cache | ⬜ | Consistent Hashing, Replication |

---

# 🧩 LLD — Low-Level Design

## 📚 Practice Problems

| # | Problem | Status | Key Concepts |
|---|---|---|---|
| 1 | Parking Lot | ⬜ | SOLID, Strategy, Factory |
| 2 | Elevator System | ⬜ | State, Strategy, Scheduling |
| 3 | Movie Ticket Booking | ⬜ | Entities, Booking, Concurrency |
| 4 | Cab Booking | ⬜ | Strategy, State, Matching |
| 5 | Splitwise | ⬜ | Strategy, Graph, Settlement |
| 6 | Library Management | ⬜ | OOP, Relationships |
| 7 | ATM | ⬜ | State Pattern, Transactions |
| 8 | Vending Machine | ⬜ | State Pattern |
| 9 | Tic-Tac-Toe | ⬜ | Strategy, Game Design |
| 10 | Chess | ⬜ | OOP, Polymorphism |
| 11 | Snake & Ladder | ⬜ | Game Engine, Strategy |
| 12 | Car Rental System | ⬜ | Inventory, Booking |
| 13 | Restaurant Management | ⬜ | Orders, Tables, State |
| 14 | File System | ⬜ | Composite Pattern |
| 15 | Logger | ⬜ | Chain of Responsibility |
| 16 | Notification Service | ⬜ | Strategy, Factory |
| 17 | Coffee Machine | ⬜ | State, Strategy |
| 18 | Amazon Locker | ⬜ | Allocation, State |
| 19 | Meeting Room Scheduler | ⬜ | Scheduling, Intervals |
| 20 | Shopping Cart | ⬜ | Strategy, Pricing |

---

# 🧠 HLD Interview Framework

For every HLD problem, follow this order:

### 1. Requirements

#### Functional Requirements

What should the system do?

Example:

- Create shortened URL
- Redirect shortened URL
- Track URL statistics

#### Non-Functional Requirements

What properties should the system have?

- Scalability
- Availability
- Reliability
- Low latency
- Consistency
- Durability
- Security

---

1. What are the requirements?
2. What are the main entities?
3. What does each entity own?
4. What behaviour can change?
5. Which abstraction represents that behaviour?
6. Where can the system fail?
7. What happens when traffic becomes 10x?
8. What trade-off am I making?

Estimate:

```text
Users
Requests/sec
Storage
Bandwidth
Read : Write ratio
Peak traffic
