**main modules** of the Spring architecture:

1. **Spring Core Container** – Provides IoC (Inversion of Control) and Dependency Injection.  
2. **Spring AOP** – Supports Aspect-Oriented Programming.  
3. **Spring Data Access/Integration** – Includes JDBC, ORM, Hibernate, Transactions, JMS, etc.  
4. **Spring Web** – Supports web applications (Spring MVC, Spring Web Flux, etc.).  
5. **Spring Security** – Provides authentication and authorization.  
6. **Spring Messaging** – Supports message-based communication (JMS, Kafka, RabbitMQ, etc.).  
7. **Spring Test** – Provides unit and integration testing support.  
8. **Spring Boot** – Simplifies Spring application setup and configuration.  
9. **Spring Cloud** – Provides tools for building microservices and distributed systems.  



Apache Kafka :
----------------

[Producer] --> [Kafka Broker] --> [Partition] --> [Consumer]

1. **Producers** → Write data to Kafka topics.  
2. **Kafka Brokers** → Store data across partitions and brokers.  
3. **Consumers** → Read data from topics. 


## **How Kafka Works**
### 1. **Writing Data (Producer)**
- Producer sends a message to a specific **topic**.  
- Kafka assigns the message to a partition based on:  
   - A specified key (messages with the same key go to the same partition).  
   - Round-robin distribution if no key is provided.  
- A Kafka producer using **KafkaTemplate**.

### 2. **Storing Data (Broker)**
- Kafka stores messages in a **commit log** in the order they arrive.  
- Messages are retained for a configurable period (e.g., 7 days) even if consumed.  
- Kafka replicates data across brokers for durability and fault tolerance.  

### 3. **Reading Data (Consumer)**
- Consumers poll Kafka brokers for new messages.  
- Kafka delivers messages in order within a partition.  
- Consumers track offsets to avoid processing the same message twice.  
- Kafka supports **at-least-once** and **exactly-once** delivery guarantees.
- A Kafka consumer using **@KafkaListener**



## **Core Concepts**
### 1. **Topic**  
- A **topic** is a category or feed name to which records are sent.  
- Producers write data to topics, and consumers read data from topics.  
- Topics are partitioned to enable parallel processing.  

---

### 2. **Partition**  
- Each topic is split into **partitions**.  
- A partition is an ordered, immutable sequence of records.  
- Each record within a partition has a unique **offset** (position).  
- Kafka ensures ordering within a partition but not across partitions.  

---

### 3. **Offset**  
- An **offset** is a unique identifier for a record within a partition.  
- Kafka assigns an incremental offset to each message as it is written.  
- Consumers track offsets to keep track of which messages have been processed.  

---

### 4. **Broker**  
- A **broker** is a Kafka server that stores data and serves clients (producers and consumers).  
- Kafka clusters usually have multiple brokers to enable scalability and fault tolerance.  
- Each broker is identified by an ID.  

---

### 5. **Producer**  
- A **producer** publishes messages to a topic.  
- Producers can choose which partition to write to or let Kafka distribute data automatically based on a key.  
- Producers handle retries and acknowledgments for reliability.  

---

### 6. **Consumer**  
- A **consumer** subscribes to a topic and reads messages.  
- Consumers can track the last processed offset.  
- Kafka supports both **pull-based** and **push-based** consumption.  

---

### 7. **Consumer Group**  
- A **consumer group** is a set of consumers that work together to consume messages from a topic.  
- Each partition is consumed by only one consumer within a group at a time.  
- Kafka distributes partitions across the consumers in the group.  

---

### 8. **Zookeeper** (Legacy)  
- Kafka initially used **Zookeeper** for cluster management, leader election, and tracking metadata.  
- Since **Kafka 3.0**, Zookeeper is being phased out in favor of a built-in **KRaft (Kafka Raft)** protocol.  

---

### 9. **KRaft (Kafka Raft)**  
- KRaft replaces Zookeeper for managing cluster state.  
- It improves scalability and reduces complexity by eliminating Zookeeper dependencies. 
