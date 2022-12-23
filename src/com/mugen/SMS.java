package com.mugen;

public class SMS extends DecoratorNotification {

    public SMS(Notification newNotification){
        super(newNotification);
//        System.out.println("-> Notification par SMS");
    }

    @Override
    public String getTypeNotification() {
        return notification.getTypeNotification() + " " + MessageNotification.SMS;
    }

}
