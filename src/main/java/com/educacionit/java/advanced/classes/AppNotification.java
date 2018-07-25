package com.educacionit.java.advanced.classes;

public class AppNotification {

    public static void main (String[] args) {
        Notificator app = new Notificator();

        app.setNotification(new EmailNotification());
        app.send( "Rommel Torrez",  "Homero", "Mi primera clase Java Avanzado" );

        app.setNotification(new PushNotification());
        app.send( "Rommel Torrez",  "Homero", "Mi primera clase Java Avanzado" );

//clase anonima
        app.setNotification(
                new INotification() {
            @Override
            public void send(String from, String to, String msg) {
             System.out.println();
            }
        }
        );




}
