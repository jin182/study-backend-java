package Course1.part4;

import Course1.model.Animal;
import Course1.model.Cat;
import Course1.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal-->Dog, Cat
        Animal ani=new Dog();
        ani.eat();

        ani=new Cat(); // 업케스팅(Upcasting)
        ani.eat();
        //ani.night(); // 다운케스팅(Downcasting)
        //Cat c=(Cat)ani;
        //c.night();
        ((Cat)ani).night();
    }
}
