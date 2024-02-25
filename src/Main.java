abstract class FlyingMachine {
    abstract void fly();
}

interface Flyable {
    default void takeOff() {
        System.out.println("Taking off...");
    }
}

class Airplane extends FlyingMachine implements Flyable, Comparable<Airplane>, Cloneable {
    @Override
    void fly() {
        System.out.println("Airplane is flying...");
    }

    @Override
    public int compareTo(Airplane o) {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "This is an Airplane";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Airplane;
    }
}

class Helicopter extends FlyingMachine implements Flyable, Comparable<Helicopter>, Cloneable {
    @Override
    void fly() {
        System.out.println("Helicopter is flying...");
    }

    @Override
    public int compareTo(Helicopter o) {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "This is a Helicopter";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Helicopter;
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Airplane airplane1 = new Airplane();
        Airplane airplane2 = (Airplane) airplane1.clone();

        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = (Helicopter) helicopter1.clone();

        callFly(airplane1);
        callTakeOff(airplane1);

        callFly(helicopter1);
        callTakeOff(helicopter1);
    }

    static void callFly(FlyingMachine flyingMachine) {
        flyingMachine.fly();
    }

    static void callTakeOff(Flyable flyable) {
        flyable.takeOff();
    }
}
