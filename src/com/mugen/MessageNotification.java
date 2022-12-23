package com.mugen;

public class MessageNotification implements Notification{

    public static String EMAIL = "EMAIL";
    public static String SMS = "SMS";
    public static String WHATAPPS = "WHATAPPS";

    public MessageNotification(String messageNotification){
        System.out.println("-> Message : " + messageNotification);
    }


    @Override
    public String getTypeNotification() {
        return "-> Types de notification pour envoyer ce message : ";
    }
}
