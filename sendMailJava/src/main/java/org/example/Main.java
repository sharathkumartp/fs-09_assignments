package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");

        //prepare to send mail

        System.out.println("This application is supposed to send mails");

        HandleMail mailer = new HandleMail();
        mailer.sendMail();
    }
}