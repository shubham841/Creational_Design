package com.shubham.builder;

public class User {


    // WHile creating objects when object contain many attributes there are many problem exists:
    // 1. we have to pass many arguments to create object
    // 2. Some parameters might be optional
    // 3. Fctory class takes all responsibility for creating object. If the object is heavy then all complexity is the part of factory class.
    // So in builder pattern we create object step by step and finally return  final object with desired values of attributes.

    private String userId;
    private String userName;
    private String emailId;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return this.userName+ "; " + this.emailId + "; " + this.userId;
    }

    static class UserBuilder{
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {
        }


        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
