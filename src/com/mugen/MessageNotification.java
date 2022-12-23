package com.mugen;

public class MessageNotification implements Notification{

    public static String EMAIL = "EMAIL";
    public static String SMS = "SMS";
    public static String WHATAPPS = "WHATAPPS";

    private String message;

    public MessageNotification(String messageNotification){
        this.message = messageNotification;
        System.out.println("-> Message : " + this.message);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getTypeNotification() {
        return "-> Types de notification pour envoyer ce message : ";
    }
}
