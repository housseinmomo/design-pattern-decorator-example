package com.mugen;

public class Email extends DecoratorNotification {

    public Email(Notification newNotification){
        super(newNotification);
//        System.out.println("-> Notification par EMAIL");
    }

    @Override
    public String getTypeNotification() {
        return notification.getTypeNotification() + " "+MessageNotification.EMAIL;
    }

}
