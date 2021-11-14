package com.codegym;

public class Siddeley extends Machine implements Flyable {
    public Siddeley(String name){
        super.name = name;
        super.setName(name);
    }
    @Override
    public void fly(){
        System.out.println(super.name + "is flying");
        System.out.println(super.getName() + " is flying");
    }
}
