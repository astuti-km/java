class Parent {
    private int x = 10;

    void showParent() {
        System.out.println("Parent x = " + x);
    }
}

class Child extends Parent {
    void showChild() {
        
        System.out.println("Child cannot access private variable directly");
    }
}

public class TestPrivate {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent();
        obj.showChild();
    }
}


class GrandParent {
    void gp() {
        System.out.println("GrandParent Class");
    }
}

class Parent extends GrandParent {
    void p() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    void c() {
        System.out.println("Child Class");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.gp();
        obj.p();
        obj.c();
    }
}



class Base {
    Base() {
        System.out.println("Base class constructor called");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor called");
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}


class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String n, int a, double s) {
        super(n, a);   // calling base class constructor
        salary = s;
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

public class TestPerson {
    public static void main(String[] args) {

        Person p = new Person("Rahul", 20);
        System.out.println("Person Details:");
        p.display();

        System.out.println();

        Employee e = new Employee("Amit", 25, 50000);
        System.out.println("Employee Details:");
        e.display();
    }
}