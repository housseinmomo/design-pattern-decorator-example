package com.mugen;

public abstract class DecoratorNotification implements Notification{

    protected Notification notification;

    public DecoratorNotification(Notification newNotification){
        this.notification = newNotification;
    }

    @Override
    public String getTypeNotification() {
        return notification.getTypeNotification();
    }

}
