interface Movable {
    void move();
}

interface EnginePowered {
    void startEngine();
}

class Car implements Movable, EnginePowered {
    public void move() { System.out.println("Car moving"); }
    public void startEngine() { System.out.println("Engine started"); }
}

class Bicycle implements Movable {
    public void move() { System.out.println("Bicycle pedaling"); }
    // No engine method - correct!
}
