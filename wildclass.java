public class wildclass {
    public class Sheep {
        void walk() {
            System.out.println("walking");
        }
    }

    public class Cat extends Sheep {
        public void Sleep() {
            System.out.println("They are so sleepy");
        }
    }

    interface E {
        void print();
    }

    class Dog extends Sheep implements E {
        public void Eat() {
            System.out.println("Eat bones");
        }

        public void print() {
            System.out.println("both are animals");
        }
    }

    public static void main(String args[]) {
        wildclass animalDemo = new wildclass();
        wildclass.Dog d = animalDemo .new Dog();  // Object creation of the Dog class
        d.Eat();
        d.walk();
        d.print();
    }
}

