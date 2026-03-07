class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 10;
    }
}

class BOB extends Bank {
    int getRateOfInterest() {
        return 11;
    }
}

public class Q1 {
    public static void main(String[] args) {
        SBI s = new SBI();
        PNB p = new PNB();
        BOB b = new BOB();

        System.out.println("SBI Rate: " + s.getRateOfInterest() + "%");
        System.out.println("PNB Rate: " + p.getRateOfInterest() + "%");
        System.out.println("BOB Rate: " + b.getRateOfInterest() + "%");
    }
}


class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor called");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}


final class Vehicle {
    final void speed() {
        System.out.println("Speed is fixed");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.speed();
    }
}


interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

abstract class Addition {
    abstract void add(int... num);
}

class Demo extends Addition {
    void add(int... num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.add(10, 20, 30);
    }
}
