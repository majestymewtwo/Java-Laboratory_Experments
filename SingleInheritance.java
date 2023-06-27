//5A
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.makeSound();
    }
}
