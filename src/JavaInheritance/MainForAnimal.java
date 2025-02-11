package JavaInheritance;

public class MainForAnimal {
    public static void main(String[] args) {
        Dog bobic = new Dog("Bobic", 1, "black");
        Cat murka = new Cat("Murka", 2);
        Animal animal = new Animal("Animal", 1);
        bobic.makeSound();
        murka.makeSound();
        animal.makeSound();
        bobic.eat();
        bobic.eat("meat");
    }
}
