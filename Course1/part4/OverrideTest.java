package Course1.part4;

import Course1.model.Animal;
import Course1.model.Cat;
import Course1.model.Dog;

public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업케스팅) : Dog.java(X), Animal<--->Dog.class(o)
        Animal ani=new Dog();
        ani.eat();// Animal---(동적바인딩)-->Dog

        ani=new Cat();
        ani.eat();// Animal---(동적바인딩)-->Cat
    }
}

