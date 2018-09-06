package com.jongyeon.inflearn.intellij;

public class EmailSender {
    String id;
    String email;


    public EmailSender (String id, String email){
        this.id=id;
        this.email=id;
    }

    public static void getInfo(String id, String email){
        System.out.println("id : " + id + " , email: " + email);
    }
}
