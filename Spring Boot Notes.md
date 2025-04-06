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
10. Spring Boot JUnit and Mockito
11. Spring Cache


*******/////////*************///////////**************/////////////////*************

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

*******/////////*************///////////**************/////////////////*************

**"Unit Testing in Spring Boot with JUnit 5 and Mockito"**:
---------------------------------------------------------

### 1. **Introduction to Unit Testing**
- **Definition**: Unit testing involves testing the smallest parts of an application (units), such as individual methods or classes, to ensure they work as expected.
- **Purpose**: Helps in identifying bugs early, improving code quality, and ensuring that changes do not break existing functionality.

### 2. **Why Unit Testing Importance / Importance of Unit Testing **
- **Early Bug Detection**: Running unit tests after changes helps catch issues before they reach production.
- **Faster Feedback**: Provides immediate feedback on the impact of changes.
- **Confidence in Code**: Developers can make changes with assurance that existing functionality is not broken.
- **Maintainability**: Unit tests are lightweight and can simplify maintaining the codebase.

### 3. **Unit Testing Frameworks**
- **JUnit 5**: A popular framework for writing and running tests in Java.
- **Mockito**: A framework for creating mock objects in unit tests, allowing for isolated testing of components.

### 4. **Structure of Unit Tests**
- **Test Class Structure**:
  - **Arrange**: Set up the conditions for the test (e.g., create objects, initialize variables).
  - **Act**: Execute the method being tested.
  - **Assert**: Verify that the outcome is as expected.

### 5. **Creating Unit Tests in Spring Boot**
- **Test Packages**: Tests should be organized in a separate `test` directory mirroring the main application structure.
- **Annotations**:
  - `@Test`: Marks a method as a test method.
  - `@Mock`: Creates a mock instance of a class.
  - `@InjectMocks`: Injects mock objects into the class being tested.
  - `@ExtendWith(MockitoExtension.class)`: Enables Mockito in the test class.

### 6. **Writing a Simple Test**
- Example of testing an `addProduct` method:
  - Create a mock for the `ProductService`.
  - Use Mockito to define behavior for the mock (e.g., what to return when a method is called).
  - Use assertions to verify that the expected results match the actual results.

### 7. **Assertions**
- **Common Assertions**:
  - `assertEquals(expected, actual)`: Checks if two values are equal.
  - `assertNotNull(object)`: Verifies that an object is not null.
  - `assertTrue(condition)`: Checks if a condition is true.

### 8. **Best Practices**
- Name tests meaningfully to reflect their purpose.
- Keep tests isolated to ensure they do not depend on external factors.
- Regularly run tests to maintain code quality.



1. **Unit Testing Life Cycle**:

		@BeforeAll (Class Level Setup)
			  ↓
		@BeforeEach (Setup)
			  ↓
		@Test (Test Execution)
			  ↓
		@AfterEach (Cleanup)
			  ↓ (if more tests) ↻ (loop back to @BeforeEach)
			  ↓ (if no more tests)
		@AfterAll (Class Level Cleanup)

   - **Annotations**:
     - `@BeforeAll`: Runs once before all tests in the class. Useful for class-level setup (e.g., database connections).
     - `@BeforeEach`: Runs before each test. Useful for preparing test-specific data.
     - `@AfterEach`: Runs after each test for cleanup.
     - `@AfterAll`: Runs once after all tests for final cleanup.

2. **Mocking with Mockito**:
   - **`doNothing()`**: Used for mocking void methods. It allows you to specify that no action should be taken when a void method is called during a test.
   - **`verify()`**: Checks if a method was called a specific number of times, useful for asserting interactions with mocks.

3. **Testing Private Methods**:
   - Private methods cannot be accessed directly in tests. Instead, they should be tested indirectly through public methods that use them.
   - **Java Reflection**: Allows access to private methods for testing purposes, using `setAccessible(true)` to bypass access restrictions.

4. **Exception Testing**:
   - Use `assertThrows()` to verify that a specific exception is thrown during the execution of a method.
   - You can also check the exception message to ensure it matches expected outcomes.

### Example Scenarios
- **Setup**: Use `@BeforeAll` to initialize a database connection.
- **Mocking**: Use `doNothing()` when testing a void method like `deleteById()`.
- **Private Method Testing**: Use reflection to test a private method if necessary.
- **Exception Handling**: Verify that a method throws an exception when given invalid input.


*******/////////*************///////////**************/////////////////*************
