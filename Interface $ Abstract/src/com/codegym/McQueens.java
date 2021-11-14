package com.codegym;

public class McQueens extends Machine implements Runnable {
    public McQueens (String name){
        super.name = name;
        super.setName(name);
    }
    @Override
    public void run(){
        System.out.println(super.name + "is running");
        System.out.println(super.getName() + "is running");
    }
}
