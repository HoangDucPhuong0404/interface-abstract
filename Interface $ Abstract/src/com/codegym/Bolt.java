package com.codegym;

public class Bolt extends Animals implements Runnable, Barkable{
        public Bolt(String name){
            super.name = name;
            super.setName(name);
        }
    @Override
    public void run(){
        System.out.println(super.name + "is running...");
        System.out.println(super.getName() + "is running");
    }
    @Override
    public void bark(){
        System.out.println(super.name + "is barkig..");
        System.out.println(super.getName() + "is barking");
    }
}
