package com.mugen;

public class Whatsapp extends DecoratorNotification{

    public Whatsapp(Notification newNotification){
        super(newNotification);
//        System.out.println("-> Notification par Whatsapp");
    }

    @Override
    public String getTypeNotification() {
        return notification.getTypeNotification() + " " + MessageNotification.WHATAPPS ;
    }
}
