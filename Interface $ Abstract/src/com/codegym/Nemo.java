package com.codegym;

public class Nemo extends Animals implements Swimable {
        public  Nemo(String name){
            super.name = name;
            super.setName(name);
        }
        @Override
        public void swim(){
            System.out.println(super.name + " is swimming");
            System.out.println(super.getName() + "is swimming");
        }

}
