import Klass.Animal;

public class Test {
    public static void main(String[] args) {
       Animal animal = new Animal();
       Dog dog = new Dog();
       Cat cat = new Cat();

       //test(animal);
       test5(dog);
       test5(cat);


    }

    public static void test5(Animal animal){
        animal.eat();

    }

}
