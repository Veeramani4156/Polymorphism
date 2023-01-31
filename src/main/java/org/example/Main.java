package org.example;
class Animal{
    public void AnimalSound() {
        System.out.println("this is superclass animal sound");
    }
}
class cat extends Animal{
    public void AnimalSound() {
        System.out.println("cat sound : meow");
    }
}
class dog extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("dog sound : barking");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}