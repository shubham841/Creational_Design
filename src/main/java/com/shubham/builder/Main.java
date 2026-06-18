package com.shubham.builder;

public class Main {

    public static void main(String[] args) {

        User user1 = new User.UserBuilder()
                .setUserId("1")
                .setUserName("Shubham")
                .setEmailId("shubhambisht@gmail.com")
                .build();

        System.out.println(user1);


        User user2 = new User.UserBuilder().setUserName("Mala").setEmailId("malabisht@gmail.com").build();
        System.out.println(user2);

    }
}
