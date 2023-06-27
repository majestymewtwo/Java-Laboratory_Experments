//5D
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class HierarchichalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
    }
}
