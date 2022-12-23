package com.mugen;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------- Notification Simple --------------------------");

        System.out.println("----------------------------");
        Notification email = new Email(new MessageNotification("Bonjour Abdoulfatah Houssein"));
        System.out.println(email.getTypeNotification());
        System.out.println("----------------------------");

        Notification sms = new SMS(new MessageNotification("Bonjour Abdoulfatah"));
        System.out.println(sms.getTypeNotification());
        System.out.println("----------------------------");

        Notification whatapp = new Whatsapp(new MessageNotification("Bonjour Abdoulfatah Houssein"));
        System.out.println(whatapp.getTypeNotification());
        System.out.println("---------------------------------------------------");


        System.out.println("------------------------- Notification combiner  --------------------------");

        Notification notificationWithEmailAndSmsAndWhatapp = new Email(new SMS(new Whatsapp(new MessageNotification("Hello Mugen"))));
        System.out.println(notificationWithEmailAndSmsAndWhatapp.getTypeNotification());

        System.out.println("----------------------------");
        Notification notificationWithWhatappAndSms = new Whatsapp(new SMS(new MessageNotification("Bonjour Monsieur")));
        System.out.println(notificationWithWhatappAndSms.getTypeNotification());
        System.out.println("----------------------------");


        Notification notificationWithEmailAndWhatapp = new Email(new Whatsapp(new MessageNotification("Bonjour mon frere")));
        System.out.println(notificationWithEmailAndWhatapp.getTypeNotification());
        System.out.println("----------------------------");

        Notification notificationWithEmailAndSms = new Email(new SMS(new MessageNotification("Veuillez vous rendre a l'accueil")));
        System.out.println(notificationWithEmailAndSms.getTypeNotification());
        System.out.println("----------------------------");




    }
}
