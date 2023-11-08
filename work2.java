public class work2 {
        public void accelerate() {
            System.out.println("kevin Motorcycle is accelerating");
        }
    }
    
    
    class prime {
        public void startEngine() {
            System.out.println("Robert Motorcycle engine is starting");
        }
    }
    
    
    class Toyota {
        public void turnOnHeadlights() {
            System.out.println("Toyota car headlights are turning on");
        }
    }
    
    
    class Benz {
        public void brake() {
            System.out.println("Benz car is applying brakes");
        }
    }
    
    class Motorbikes {
        public static void main(String[] args) {
            work2 work2 = new work2();
          prime prime = new prime();
            Toyota toyota = new Toyota();
            Benz benz = new Benz();
    
            // Calling methods from each motorcycle class
            work2.accelerate();
            prime.startEngine();
            toyota.turnOnHeadlights();
        }
    }
    
