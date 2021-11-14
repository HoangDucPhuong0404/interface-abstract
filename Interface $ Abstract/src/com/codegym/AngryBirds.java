package com.codegym;

public class AngryBirds extends Animals implements Flyable {
    public AngryBirds(String name){
        super.name =name;
        super.setName(name);
    }
    @Override
    public void fly(){
        System.out.println(super.name + "is flying...");
        System.out.println(super.getName() + "is flying..");
    }
}
