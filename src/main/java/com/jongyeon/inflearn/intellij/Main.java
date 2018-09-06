package com.jongyeon.inflearn.intellij;

import com.jongyeon.inflearn.intellij.innerclass.Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("aaa");

        EmailSender emailSender = new EmailSender("sun","ajou.ac.kr");
        //EmailSender.getInfo();

        prt();

        Practice prc = new Practice();

    }

    private static void prt() {
        System.out.println("hi hello my name is jy");
        System.out.println("hi hello my name is jy");
        System.out.println("hi hello my name is jy");
        System.out.println("hi hello my name is jy");
        System.out.println("hi hello my name is jy");
        System.out.println("hi hello my name is jy");
    }


    public void print(){
        String a = "안녕하세요. 자바 개발자 입니다. 잘 부탁드립니다.";
    }



}
