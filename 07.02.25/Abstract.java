abstract class Animal {
        abstract void makeSound();
    }
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("The dog is barking: Woof! Woof!");
        }
    }
    public class Abstract {
        public static void main(String[] args) {
            Animal myDog = new Dog();
            myDog.makeSound();
        }
    }

