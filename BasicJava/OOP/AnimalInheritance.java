// Animal hierarchy: Create a hierarchy of animals using inheritance. Define a base Animal class, and 
//then create subclasses such as Dog, Cat, and Bird that inherit from the base class. Each subclass 
//should implement methods for making a sound, moving, and eating.
class Animals{
    
    ////attributes
    // String eatType;
    // String skinType;
    // int lifespan;
    // int legs;
    // int weight;

    //methods
    public void sound(){
        System.out.println("The animal is making a sound...");
    }
    public void moving(){
        System.out.println("The animal is moving...");
    }
    public void eating(){
        System.out.println("The animal is eating...");
    }
}

class Dog extends Animals{
    public void sound(){
        System.out.println("The dog is Barking loudly...");
    }
    public void moving(){
        System.out.println("The dog is running...");
    }
    public void eating(){
        System.out.println("The dog is eating meat...");
    }
}

class Cat extends Animals{
    public void sound(){
        System.out.println("The cat is meowing...");
    }
    public void moving(){
        System.out.println("The cat is jumping...");
    }
    public void eating(){
        System.out.println("The cat is eating tuna...");
    }
}

class Bird extends Animals{
    public void sound(){
        System.out.println("The bird is chirping mildly...");
    }
    public void moving(){
        System.out.println("The bird is flying...");
    }
    public void eating(){
        System.out.println("The bird is eating worm...");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Animals animal1 = new Dog();
        animal1.sound();
        animal1.moving();
        animal1.eating();

        System.out.println('\n');

        Animals animal2 = new Cat();
        animal2.sound();
        animal2.moving();
        animal2.eating();
        
        System.out.println('\n');

        Animals animal3 = new Bird();
        animal3.sound();
        animal3.moving();
        animal3.eating();

    }
    
}
