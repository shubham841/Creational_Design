# Builder Design Pattern

The **Builder Pattern** is a creational design pattern that lets you build complex objects step by step.

---

## 💡 Concept
Imagine you want to create an object that has many fields (some are required, some are optional). Writing a constructor for every combination of fields is very difficult. 

The Builder pattern solves this by giving you a helper class (the Builder) to set values one by one, and then build the final object at the end.

---

## ❓ Why Do We Need This Pattern?
When you try to build objects with many fields using regular constructors:
1. **Too many constructors**: You will end up writing many constructors with different numbers of parameters. This is hard to maintain.
2. **Confusing parameters**: If many parameters have the same type (like five different `String` fields), it is easy to pass values in the wrong order. The compiler will not show an error, but your data will be wrong.
3. **Half-built objects**: If you use empty constructors and call setters later, your object is in an incomplete state while it is being created. Also, you cannot make the fields `final` (immutable) if you must use setter methods.

The Builder pattern solves this by letting you set properties step by step and verify everything before the object is created.

---

## 🛠️ Key Components
1. **Product**: The main complex class that you want to create. It usually has a private constructor that takes the Builder as an input.
2. **Builder**: A helper class (usually nested inside the Product class) that collects the values and builds the final Product object.

---

## 📝 Example Structure

```mermaid
classDiagram
    class User {
        -String userId
        -String userName
        -String emailId
        -User(UserBuilder builder)
        +getUserId() String
        +getUserName() String
        +getEmailId() String
    }
    class UserBuilder {
        -String userId
        -String userName
        -String emailId
        +setUserId(String id) UserBuilder
        +setUserName(String name) UserBuilder
        +setEmailId(String email) UserBuilder
        +build() User
    }
    User +-- UserBuilder : Nested Class
```

### Simple Code Example

```java
public class User {
    // These fields are final so they cannot be changed after creation
    private final String userId;
    private final String userName;
    private final String emailId;

    // Private constructor: can only be called by UserBuilder
    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserId() { return userId; }
    public String getUserName() { return userName; }
    public String getEmailId() { return emailId; }

    @Override
    public String toString() {
        return "User{" + "id='" + userId + '\'' + ", name='" + userName + '\'' + ", email='" + emailId + '\'' + '}';
    }

    // Helper Builder class
    public static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {}

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this; // Returns the builder so we can chain the next call
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        // Creates the actual User object
        public User build() {
            return new User(this);
        }
    }
}

// How to use it
public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("USR-101")
                .setUserName("Shubham")
                .setEmailId("shubhambisht@gmail.com")
                .build();
        System.out.println(user);
    }
}
```

---

## ⚖️ Pros and Cons
### Pros:
- **Readable Code**: The code to create an object is very easy to read and write.
- **Immutable Objects**: You can make fields `final` since they are set inside the private constructor.
- **Safety**: Prevents passing arguments in the wrong order.

### Cons:
- **Double Code**: You have to write similar fields in both the Product and the Builder class.
